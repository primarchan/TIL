# JPA (Java Persistence API)

## 1. JPA 란?

### 1.1 영속성의 이해 (1/3) - 개요
- 영속성은 사전적 의미로는 영원히 계속되는 성질이나 능력을 뜻합니다.
- 어플리케이션의 상태와 상관 없도록 물리적인 저장소를 이용해 데이터를 저장하는 행위를 영속화라고 할 수 있습니다.
- 데이터를 어떤 공간에 어떤 형태로 저장할 것인지에 따라 영속화 방식은 달라질 수 있습니다.
- 보편적으로 적용되는 RDBMS 에 데이터를 저장하기 위해서는 SQL 을 이용해 데이터를 영속화 해야 합니다.

### 1.1 영속성의 이해 (2/3) - JDBC API (1/2)
- Java 어플리케이션에서 데이터베이스에 접근 하는 방법은 기본적으로 JDBC 인터페이스를 통한 방법입니다.
- JDBC 인터페이스는 Java 어플리케이션과 데이터베이스의 소통을 위한 기능들을 정의하고 있습니다.
- 각 데이터베이스 제조사들은 JDBC 인터페이스를 구현하는 클래스들을 제공하며 이를 드라이버 라고 합니다.
- 순수 JDBC 기반의 영속적 데이터 관리는 개발 과정에서 다소 많은 시간과 비용을 발생하게 합니다.

### 1.1 영속성의 이해 (3/3) - JDBC API (2/2)
- DBMS 의 데이터 관리는 SQL (Structured Query Language) 을 통해 이루어집니다.
- 데이터베이스에 접속부터 질의 (Query) 를 보내고, 결과를 받는 것까지 전체 과정에서 Java 와 데이터베이스 간의 변환 절차가 필요합니다.
- 순수 JDBC 를 적용하여 데이터를 관리할 경우, Java 코드와 SQL 코드를 동일한 파일에서 관리하게 됩니다.

### 1.2 자원 (resource) 접근 레이어
- 비지니스 컴포넌트는 비지니스 로직 레이어에, 자원 접근 모듈은 자원 접근 레이어에 놓여 있습니다.
- 이들 간의 관계를 생각할 때, 좌측에 표현한 레이어 관점에서 볼 수 있습니다.
- 어떤 객체 정보 (ex. Customer) 가 자원 접근 레이어를 통해서 저장될 때는 하나의 인터페이스를 타고 들어갑니다.
- 하지만, 실제로 그 데이터가 저장되는 경로는 자원 접근 레이어에서 어떤 모듈이 처리하는가에 따라 다릅니다.

### 1.3 객체의 세상과 테이블의 세상 (1/3)
- 객체 중심의 객체지향 어플리케이션과 테이블 중심의 관계형 데이터베이스는 서로의 목표가 다릅니다.
- 이를 패러다임이 일치하지 않는다고 표현하며, 이는 개발 과정에서 많은 비용을 발생하게 합니다.
- 영속적으로 데이터를 저장하기 위해 객체의 세상과 테이블의 세상을 서로 맞추는 과정이 필요합니다.
  
| 객체지향 모델                     | 관계형 모델          |
|-----------------------------|-----------------|
| 객체, 클래스                     | 테이블, 로우         |
| 속성 (attribute, property)    | 컬럼              |
| Identity                    | Primary Key     |
| Relationship / 다른 Entity 참조 | Foreign Key     |
| 상속 / 다형성                    | 없음              |
| 메서드                         | SQL 로직, SP, 트리거 |
| 코드의 이식성                     | 벤더 종속적임         |

### 1.3 객체의 세상과 테이블의 세상 (2/3)
- Java 어플리케이션에서 관계형 데이터베이스의 사용을 돕는 프레임워크를 Persistence Framework 라 합니다.
- Persistence Framework 는 SQL Mapping 과 OR Mapping 으로 구분합니다.
- SQL Mapping 은 Java 코드와 SQL 을 분리하며, 개발자가 작성한 SQL 의 수행 결과를 객체로 매핑합니다.
- OR Mapping 은 객체와 관계형 데이터베이스 사이에서 매핑을 담당하며 SQL 을 생성하여 패러다임의 불일치를 해결합니다.

### 1.3 객체의 세상과 테이블의 세상 (3/3)
- Persistence Framework 는 로직에서 DB 연결 설정을 분리하여, 개발자가 비지니스 로직에 집중할 수 있도록 도와줍니다.
  - 순수 JDBC 를 적용하면, DB 자원 연결 및 사용에 관련된 코드가 메서드마다 중복됩니다.
  - 상황에 맞는 Persistence Framework 를 적용하면, 개발 편의성 뿐 아니라 성능 유지보수에도 큰 이점이 됩니다.
- 관계형 데이터 접근 프레임워크는 크게 SQL Mapping 과 OR Mapping 접근 기반 프레임워크로 나눠집니다.
  - SQL Mapping 프레임워크는 Java 객체와 쿼리 결과를 매핑합니다.
  - OR Mapping 프레임워크는 Java 객체와 데이터베이스 릴레이션 (테이블)을 매핑합니다.

### 1.4 JPA (Java Persistence API) 의 이해
- JPA (Java Persistence API) 은 자바 프로그램에서 관계형 데이터베이스에 접근하는 방식을 명세화한 인터페이스입니다.
- JPA 자바 진영의 ORM (Object-Relational Mapping) 기술 표준입니다.
- JPA 는 자바 애플리케이션 JDBC 사이에서 동작하며, 일반적으로 구현체는 Hibernate 라이브러리를 사용합니다.
- JPA 를 적용할 경우, 도메인 객체는 기술에 의존적이지 않으며 재사용을 높일 수 있습니다.
- JPA 를 사용해서 객체를 영속화 하기 위해서는 객체에 Annotation 을 추가하거나 별도의 메타 데이터 구성이 필요합니다.

### 1.5 JPA 기초 실습
- DB 설치 : H2 DB
  - [H2 DB 다운로드 링크](https://www.h2database.com/html/main.html)
- H2 DB 의 3가지 모드
  - Sever Mode
  - Embedded Mode
  - In-Memory Mode

<hr>

## 2. How to work?

### 2.1 JPA 내부 동작 방식
- JPA 를 통해 객체를 영속화 하기 위해서는 EntityManager 객체가 필요하며, EntityManger 의 인스턴스 객체는 EntityManagerFactory 객체를 통해 얻습니다.
- EntityManager 는 영속성 컨택스트 (Persistence Context) 를 통해 영속 객체를 관리합니다.
- 사용자는 EntityManager 인스턴스 객체의 다양한 메소드를 이용해 영속 객체를 관리합니다.

### 2.2 영속성 컨텍스트 (1/4) - 개요
- 영속성 컨텍스트 (Persistence Context) 는 고유 ID 를 갖는 모든 영속 객체 인스턴스에 대한 집합입니다.
- 영속성 컨텍스트 내에서 영속 객체에 대한 생명주기가 관리되며 이러한 영속 객체에 대한 관리는 EntityManager 의 메서드들을 이용합니다.
- EntityManager 를 통해 등록된 영속 객체 혹은 저장소로부터 가져온 영속객체의 정보는 1차 캐시에서 관리합니다.
- 영속성 컨텏트는 애플리케이션과 영구 저장소 (Database) 사이에 위치합니다.

### 2.2 영속성 컨텍스트 (2/4) - 동작방식 (1/2)
- 영속성 컨텍스트는 EntityManager 단위로 관리됩니다.
- EntityManager.persist() 를 통한 영속객체 등록은 우선 해당 객체가 1차 캐시에 저장되고 일반적으로 트랜잭션이 커밋되는 시점에 Insert 쿼리가 데이터베이스에 반영됩니다.
- EntityManager.find() 를 통한 데이터 검색은 우선 1차 캐시를 통해 해당 객체를 검색하고 없을 경우, Select 쿼리를 통해 데이터베이스에서 검색을 수행합니다.

### 2.2 영속성 컨텍스트 (3/4) - 동작방식 (2/2)
- 영속 컨텍스트를 통해 관리되는 영속 객체는 객체의 상태 변경에 따라 Update 쿼리가 생성되고 커밋 시점에 데이터베이스에 반영됩니다.
- 객체의 변경 사항ㅇ은 1차 캐시의 스냅샷 (Snapshot) 정보를 통해 판별합니다.
- 영속객체의 상태가 변경되면 1차 캐시의 스냅샷과 비교하고 다를 경우, Update 쿼리를 생성 SQL 저장소에 저장합니다.

### 2.2 영속성 컨텍스트 (4/4) - Flush
- 플러시 (Flush) 는 영속성 컨텍스트의 내용을 데이터베이스와 동기화 하는 것을 의미합니다.
- 플러시의 3가지 방식
  - EntityManager.flush() 직접 호출을 통합 플러시
  - 트랜잭션의 커밋을 통한 자동 플러시
  - JPQL 쿼리 실행을 통한 자동 플러시
- 플러시를 실행한 이후에도 영속성 컨텍스트의 내용은 그대로 유지됩니다.

### 2.3 Entity Lifecycle
- 영속 객체의 상태는 다음의 4가지의 상태로 구분합니다.
  - 비영속 (New) : 영속성 컨텍스트로 관리되기 이전 순수 객체 상태
  - 영속 (Managed) : 영속성 컨텍스트로 등록되고 관리되는 상태
  - 준영속 (Detached) : 영속성 컨텍스트의 관리에 있다가 분리된 상태 (Managed -> Detached)
  - 삭제 (Removed) : 영속 데이터의 삭제를 위한 상태 (EntityManager.remove())

<hr>

## 3. Entity Mapping

### 3.1 객체와 테이블 매핑 (1/3) - @Entity
- 도메인 객체를 관계형 데이터베이스 테이블 맵핑할 때, @Entity 어노테이션을 사용합니다.
- @Entity 어노테이션만 선언했을 때, 테이블 이름은 클래스 이름이 되고, 대/소문자 치환은 일어나지 않습니다.
- 대부분의 RDBMS 는 대/소문자를 가리지 않으므로 기본 JPA 작명규칙이 문제를 발생하지는 않습니다.
- @Table 어노테이션을 사용해서 테이블 이름을 명시적으로 표기할 수 있습니다.

### 3.1 객체와 테이블 매핑 (2/3) - @Table
- 관습적인 테이블 설계 방법에서 테이블 이름은 대문자에 "_" 를 많이 사용합니다.
- @Table 어노테이션은 스키마를 지정하거나 테이블 이름을 구체적으로 명시합니다.
- 특정 RDBMS 는 스키마 지정을 테이블 이름에 포함할 수 있기에 "SA.USER" 로 스키마 지정이 가능합니다.
- @Table(name="USER", catalog="CATALOG") 로 카탈로그 지정이 가능합니다.

### 3.1 객체와 테이블 매핑 (3/3) - @Access
- JPA 에서 객체에 대한 접근방식은 크게 필드 접근방법과 프로퍼티 접근방법으로 구분합니다.
- @Access 를 적용하지 않을 경우, @Id 어노테이션의 지정 위치에 따라 방법을 결정할 수 있습니다.
- @Access 어노테이션을 선언해서 명시적으로 접근 방법을 설정할 수 있습니다.
- @Access 어노테이션으로 필드/속성 접근 방법을 동시에 사용할 수도 있습니다.

### 3.2 기본키 매핑 (1/5) - @Id
- 기본키 적용을 위한 어노테이션은 다음 3가지 입니다.
  - @Id
  - @IdClass
  - @EmbeddedId
- 피해야 할 타입
  - float, Float, double, TimeStamp 타입을 피해야 합니다.

### 3.2 기본키 매핑 (2/5) - @GenerateValue
- 기본키 값을 직접 할당 하는 경우, @Id 어노테이션을 적용합니다.
- 기본키 값을 자동 생성하기 위해서는 @GenerateValue 어노테이션을 적용합니다.
- @GenerateValue 를 이용한 기본키 갑의 자동생성 방법은 여러 옵션을 이용해 기본키 생성 전략을 적용할 수 있습니다.

### 3.2 기본키 매핑 (3/5) - Identity 기본키 생성 전략
- Identity 전략은 기본키 생성에 대한 처리를 전적으로 데이터베이스에 위임하는 전략입니다.
- MySQL, DB2, Oracle 데이터베이스 등에 적용할 수 있습니다.
- Identity 전략은 새로운 데이터가 생성될 때, 그 값이 부여됩니다. 따라서, 데이터 저장을 위해 persist() 호출 시점에 Insert 가 진행됩니다.

### 3.2 기본키 매핑 (4/5) - Sequence 기본키 생성 전략
- Sequence 생성 전략은 데이터베이스의 Sequence 오브젝트를 이용해 기본키를 생성하는 방식입니다.
- 이 전략은 Sequence 오브젝트를 제공하는 Oracle, PostgreSQL, DB2 데이터베이스 등에서 적용할 수 있습니다.
- Sequence 전략을 사용하기 위해서는 @SequenceGenerator 가 필요하며 이 어노테이션을 이용해 여러 옵션을 적용할 수 있습니다.
- 이 전략도 Identity 전략과 마찬가지로 데이터가 발생할 때 생성되는 Sequence 를 받아 영속 객체를 관리합니다. 

### 3.2 기본키 매핑 (5/5) - Table 기본키 생성 전략
- 기본키 생성을 위해 별도의 테이블을 생성하고 이 테이블을 이용해 기본키를 생성합니다.
- Table 기본키 생성 전략은 별도의 테이블을 생성하기 때문에 데이터베이스 종류에 영향을 받지 않습니다.
- Table 생성 전략을 적용하기 위해서는 @TableGenerator 어노테이션이 필요하며 여러 옵션을 적용할 수 있습니다.
- Table 생성 전략은 테이블 생성과 키값 증가를 위한 Update 가 실행되기 때문에 성능에 대한 고려가 필요합니다.

### 3.3 필드와 컬럼 매핑 (1/5) - @Column
- @Column 어노테이션은 영속 객체의 필드와 데이터베이스 테이블의 열(Column) 을 매핑할 때 사용합니다.
- @Column 어노테이션은 다양한 옵션 기능을 제공하며 이를 통해 영속 객체 필드의 속성을 정의할 수 있습니다.
- @Column 의 여러 속성들은 대부분 선택적으로 사용하며 기본값이 지정되어 있습니다.