# 대용량 비동기 Process 를 위한 Kafka 의 활용 및 실습

> [강의 소스코드 GitHub](https://github.com/spacetime101/fastcampus-kafka)

<hr>

> Tech Stack & Tool 
> - Apache Kafka 2.8 ([GitHub 링크](https://github.com/apache/kafka))
> - JDK 1.8
> - IDE : IntelliJ IDEA Ultimate
> - OS : MacOS

<hr>

## Kafka 의 기본 개념
- 실시간으로 기록 스트림을 게시, 구독, 저장 및 처리할 수 있는 분산형 데이터 스트리밍 플랫폼
- 여러 소스에서 데이터 스트림을 처리하고 여러 사용자에게 전달하도록 설계
- 예를 들어, A지점에서 B지점까지 이동하는 것뿐만 아니라 A지점에서 Z지점을 비롯해 필요한 모든 곳에서 대규모 데이터를 동시에 이동 가능
- [참고 자료](https://www.redhat.com/ko/topics/integration/what-is-apache-kafka)

<hr>

## Local 환경 Kafka CLI 이용 가이드
- JDK 다운로드 : JDK 1.8+ (1.8 이상 버전 모두 사용 가능)
  - Open JDK 1.8 을 Mac 에 설치 (homebrew 사용)
```
% brew tap AdoptOpenJDK/openjdk

% brew install --cask adoptopenjdk8

# 설치된 Version 확인
% /usr/{사용자 계정}/java_home -v

# 새로 설치된 Version 으로 변경 적용
% export JAVA_HOME=$(/usr/{사용자 계정}/java_home -v 1.8)

# 적용된 Java Version 확인
% java -version

```

- [Kafka 다운로드](https://kafka.apache.org)
```
% tar -zxf kafka_2.13-2.8.2.tgz

% cd kafka_2.13-2.8.2
```

- zookeeper & Kafka 실행
```
% bin/zookeeper-server-start.sh config/zookeeper.properties

# config/server.properties 파일의 advertised.listeners 를 주석 해제 후, localhost:9092 로 수정
-- 새로운 터미널 실행
% bin/kafka-server-start.sh config/server.properties

# 새로운 터미널 실행 후, Topic 생성
% bin/kafka-topic.sh --create --topic topic-example1 --bootstrap-server localhost:9092

% bin/kafka-topic.sh --decribe --topic topic-example1 --bootstrap-server localhost:9092

# 첫 번째 Message 발행
% bin/kafka-console-producer.sh --topic topic-example1 --bootstrap-server localhost:9092
>First Message
>Second Message

# 새로운 터미널에서 Consumer 실행하여 Message 읽기
% bin/kafka-console-consumer.sh --topic topic-example1 --from-beginning --bootstrap-server localhost:9092
```