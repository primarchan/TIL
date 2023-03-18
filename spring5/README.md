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

### 2.2 UML

### 2.3 구현 : Entities, Services, Stores

### 2.4 이해 #01 : Spring Core IoC / DI

### 2.5 이해 #02 : Maven 개요

</div>
</details>