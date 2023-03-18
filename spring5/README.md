# Spring 5 for Beginner

## 1. Overview Spring 5

<details>
<summary><b>1강 학습 자료 (클릭)</b></summary>
<div markdown="1">

### 1.1 What's Spring? (1/2)
- Spring 은 Java 엔터프라이즈 개발을 위한 오픈소스 경량 Application Framework
- Application Framework 는 Application 개발의 모든 계층을 지원
- Framework 가 애플리케이션 수준의 Infra Structure 를 제공하므로 개발자는 업무 로직 개발에만 전념
- Spring Framework 는 공통 프로그래밍 모델 및 Configuration 모델을 제공

### 1.1 What's Spring? (2/2)
- Spring 은 다양한 프로젝트로 구분 되며, 가장 기본이 되는 프로젝트는 Spring Framework 프로젝트
- Spring Framework 프로젝트는 엔터프라이즈 Application 의 핵심 기능을 위한 기반을 제공
- 이 밖에도 보안, 클라우드, 빅데이터, 배치 및 배포 등 다앙햔 프로젝트가 진행 중
  - [공식 문서 링크](https://spring.io/projects)
- Spring Framework, Spring Boot, Spring MVC, Spring Data 는 여러 프로젝트 중 핵심이 되는 프로젝트

### 1.2 Spring Framework
- Spring Framework 프로젝트는 Spring 의 핵심 (core) 기능을 담고 있는 프로젝트
- 전체 프로젝트를 포함하는 지금 모습과 같은 Spring 의 첫 시작은 Spring Framework
- Spring Framework 는 엔터프라이즈 Application 개발을 위해 제공하는 Spring 의 핵심 기능을 담고 있음

### 1.3 Spring MVC
- Spring MVC 는 MVC 패턴 기반의 Web Framework
- Spring MVC 는 모든 요청을 받아 각 Controller 로 요청을 위임해주는 Front Controller 를 사용
- 설정보다는 관례 (CoC) 중심 Framework 로서, 보편적인 기능은 기본 제공하고 그외 설정은 확장 가능
- Spring @MVC 라고 불리울 만큼 Annotation 을 이용한 편리하고 효율적인 개발을 지원

### 1.4 Spring Boot
- Spring Boot 는 단독 실행할 수 있고, 상용화 수준의, 실행 가능한 스프링 기반 Application 을 쉽게 생성할 수 있게 함
- Spring Boot 를 이용하면 설정의 최소화를 할 수 있음
- 내장된 Tomcat, Jetty, Undertow 를 이용해 WAR 배포없이 Web Application 을 실행할 수 있음
- 많이 사용하는 라이브러리를 모아놓은 Starter POM 파일을 제공하여 쉽게 라이브러리 관리할 수 있음

### 1.5 Spring Data JPA
- Spring Data JPA 프로젝는 데이터 영속성을 위해 사용할 수 있는 모듈으 집합
- Spring Data JPA 다양한 모듈은 관계형 혹은 비 관계형 데이터베이스에 접근 데이터를 관리할 수 있는 방법을 제공
- JPA (Java Persistence API) 는 ORM (Object-Relational Mapping) 기술 표준
- Spring Data JPA 프로젝트는 프로그램에 JPA 의 적용을 보다 간결하게 할 수 있도록 함

### 1.6. 개발 환경 구성
- JDK (Java Development Kit) 8.0 이상
- REST Client
  - Insomnia, POSTMAN 
- IDE (Integrated Development Environment)
  - IntelliJ IDEA, Visual Studio Code

</div>
</details>

## 2. Travel Club Project

<details>
<summary><b>2강 학습 자료 (클릭)</b></summary>
<div markdown="1">

### 2.1 Travel Club Project 개요
- Travel Club Project 는 여행 클럽과 클럽 멤버 관리 (클럽 개설 과 변경 등) 를 위한 Application
- Travel Club Project 는 크게 4 단계 과정을 통해 개발을 진행
- 웹 환경에서 서비스할 수 있도록 구현하며, 사용자 UI (Front-End) 는 REST-Client 를 이용

### 2.2 UML (1/2)
- 여행 클럽 정보는 Travel Club 클래스로 정의하며 클럽명, 소개, 개설일을 정보로 갖습니다.
- CommunityMember 클래스는 여행 클럽의 멤버에 대한 정보를 담고 있는 클래스입니다.
- 여행 클럽과 소속 멤버들의 관계는 Membership 클래스를 통해 관리
<img src="./img/uml/entity_diagram.jpeg">

### 2.2 UML (2/2) - Class Diagram (1/3)
- 모든 클래스는 그 역할에 따라 구분하고 이를 계층 (Layer) 으로 나누어 관리 구성
- 역할의 구분은 정보 (Entity), 처리(Service), 저장(Store) 로 계층으로 분리
- 처리와 저장에 해당하는 Service 와 Store 은 인터페이스를 이용해 느슨한 결합 (Loose Coupling) 을 갖도록 함
- <img src="./img/uml/travelclub_diagram.jpeg">

### 2.2 UML (2/2) - Class Diagram (2/3)
- 서비스 영역은 클럽, 멤버, 멤버십에 대한 인터페이스와 이를 구현한 구현 클래스로 구성
- 각 서비스의 구현체 클래스는 스터어 영역의 언터페이스를 속성으로 참조
- Membership 을 구현한 클래스는 클럽, 멤버, 그리고 멤버십에 대한 스토처 인터페이스의 참조를 갖도록 함
- <img src="./img/uml/service_diagram.jpeg">

### 2.2 UML (2/2) - Class Diagram (3/3)
- 스토어 영역은 클럽, 멤버, 그리고 멤버십에 대한 인터페이스와 이를 구현한 구현체로 구성
- 스토어 영역의 구현 클랫들은 각 데이터에 대한 저장, 검색, 수정, 삭제 기능을 수행
- Spring Data JPA 를 적용하는 4단계에는 DB 를 통해 데이터를 저장하며 1 ~ 3 단계에서는 Map 을 이용
- <img src="./img/uml/store_diagram.jpeg">

### 2.3 구현 : Entities, Services, Stores
- [참고 GitHub 링크](https://github.com/namoosori/spring5-for-beginner)

### 2.4 이해 #01 : Spring Core IoC / DI

### 2.5 이해 #02 : Maven 개요

</div>
</details>