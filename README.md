# 스프링 바닥부터 시작하기

## 목표

1. [Spring이란?](#Spring이란?) 
1. [간단한 스프링 프로젝트 만들기](#간단한-스프링-프로젝트-만들기)
    1. 개발환경 설정
    1. 스프링 프로젝트 생성
    1. 코드작성
    1. 실행
1. [참고](#참고)

## 개발 환경

- 이클립스: Eclipse IDE Oxygen.3a Release (4.7.3a) (2018.05 최신버전)
- JDK: Java SE 10.0.1 (2018.05 최신버전)
- STS: Spring Tools 3.9.4 (2018.05 최신버전)

# Spring이란?

기초 데이터를 읽어 연산 후 결과를 보여주는 프로그램을 스프링 기법으로 만들어봅시다. 

스프링 기법을 적용해보기 전에 알면 좋은 개념에 대해 알아봅시다.

## Dependency Injection (DI)

A, B, C는 객체입니다. A가 B와 C에 있는 기능을 가져와서 쓰고 싶어합니다. 어떻게 하면 될까요? 두가지 방법이 있습니다.

- 방법 1. A가 B, C를 `new`키워드를 이용하여 직접 생성하고, 기능을 씁니다.

- 방법 2. A의 외부에서 B, C를 생성하여 A의 `setter()` 또는 `construct()`를 통해 넘겨받고, 기능을 씁니다.

A는 B와 C를 생성해 쓰고 있습니다. A는 B와 C에 의존한다고 표현할 수도 있어요.

스프링은 방법 2를 채택합니다. **의존하는(dependency)** 객체를 외부에서 **주입하여(injection)** 사용합니다. 스프링의 DI 기법입니다.

> 스프링이란 부품을 생성하고 조립하는 라이브러리 집합체이다.

# 간단한 스프링 프로젝트 만들기

이름, 색깔로 성격을 판별 후 결과를 보여주는 프로그램을 스프링 기법으로 만들어봅시다.

# 개발환경 설정

이클립스와 JDK를 설치하세요.

이클립스를 실행하여 스프링 플러그인 STS(Spring Tool Suite)를 설치하세요.

- 이클립스의 `Help > Eclipse Marketplace`에서 검색창에 'STS'를 치고 검색 후 설치
- 모든 설치된 후 이클립스 재시작 되면 완료, 스프링 perspective 열기

# 스프링 프로젝트 생성

Simple Spring Project를 생성하세요.

1. `New > Spring Legacy Project`
1. Project name: SpringBasic
1. Template: Simple Spring Maven
1. finish

src/main/java 이하에 새로운 패키지를 생성하세요.

1. `New > Packege`
1. Source folder: SpringBasic/src/main/java
1. Name: com.basic.ex
1. finish

생성한 패키지에 클래스를 생성하세요.

- ColorPersonalityJudgment.java
```java
package com.basic.ex;

public class ColorPersonalityJudgment {

}

```
- MyJudgment.java 
```java
package com.basic.ex;

public class MyJudgment {

}
```
- MainClass.java
```java
package com.basic.ex;

public class ColorPersonalityJudgment {

    public void judgePersonality(String color) {
        
    }
}
```

SpringBasic/src/main/resources 이하에 자바 설정 파일을 생성하세요.

- `New > Java Bean Configuration File `
- parent folder: SpringBasic/src/main/resources
- File name: applicationCTX.xml
- finish
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    
</beans>
```

# 코드 작성

## ColorPersonalityJudgment.java

> Do It Yourself ! 색깔로 성격을 판별하는 메서드를 작성하세요.

```
빨강: 외향적이고 적극적이며 자신감이 넘치는 사람
주황: 심성이 착하고 다른 사람과 어울리기 좋아하는 사람
노랑: 모험을 즐기며 늘 새로운 것을 찾는 사람
초록: 도덕적 민주적 견해를 가진 모범적인 사람
파랑: 고집이 세고 다소 보수적 신념을 가진 사람
보라: 개성이 강하고 감수성이 풍부한 사람
```

```java
public void judgePersonality(String color) {
    if (color.equals("빨강")) {
        System.out.println("외향적이고 적극적이며 자신감이 넘치는 사람");
    } else if (color.equals("주황")) {
        System.out.println("심성이 착하고 다른 사람과 어울리기 좋아하는 사람");
    } else if (color.equals("노랑")) {
        System.out.println("모험을 즐기며 늘 새로운 것을 찾는 사람");
    } else if (color.equals("초록")) {
        System.out.println("도덕적 민주적 견해를 가진 모범적인 사람");
    } else if (color.equals("파랑")) {
        System.out.println("고집이 세고 다소 보수적 신념을 가진 사람");
    } else if (color.equals("보라")) {
        System.out.println("개성이 강하고 감수성이 풍부한 사람");
    }
}
```

## MyJudgment.java

> Do It Yourself ! 아래의 조건에 맞게 변수와 메서드를 작성하세요.

```
변수:
    ColorPersonalityJudgment 객체
    String 사용자 이름
    String 사용자 색깔
메서드:
    getter와 setter
    사용자 이름과 색깔 출력
    색깔로 성격을 판별
```

```java
private ColorPersonalityJudgment colorPersonalityJudgment;
private String userName;
private String userColor;

public ColorPersonalityJudgment getColorPersonalityJudgment() {
    return colorPersonalityJudgment;
}

public void setColorPersonalityJudgment(ColorPersonalityJudgment colorPersonalityJudgment) {
    this.colorPersonalityJudgment = colorPersonalityJudgment;
}

public String getUserName() {
    return userName;
}

public void setUserName(String userName) {
    this.userName = userName;
}

public String getUserColor() {
    return userColor;
}

public void setUserColor(String userColor) {
    this.userColor = userColor;
}

public void printUserInfo() {
    System.out.println("이름: " + userName);
    System.out.println("색깔: " + userColor);
}

public void judgeUserPersonality() {
    colorPersonalityJudgment.judgePersonality(userColor);
}
```

## applicationCTX.xml

```xml
<bean id="colorPersonalityJudgment" class="com.basic.ex.ColorPersonalityJudgment">
</bean>

<bean id="myJudgment" class="com.basic.ex.MyJudgment">
    <property name="colorPersonalityJudgment">
        <ref bean="colorPersonalityJudgment" />
    </property>
    <property name="userName" value="전정완" />
    <property name="userColor" value="주황" />
</bean>
```

## MainClass.java

```java
String configLocation = "applicationCTX.xml";
AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
MyJudgment myJudgment = ctx.getBean("myJudgment", MyJudgment.class);

myJudgment.printUserInfo();
myJudgment.judgeUserPersonality();
```

# 실행

`Run > Run As > Java Application`으로 실행하여 console창에서 결과를 확인하세요.

# 참고

- [인프런, 자바 스프링 강좌](https://www.inflearn.com/course/%EC%9E%90%EB%B0%94-%EC%8A%A4%ED%94%84%EB%A7%81-%EA%B0%95%EC%A2%8C/)
- [색깔로 알아보는 심리테스트](https://m.blog.naver.com/PostView.nhn?blogId=gppcgppc&logNo=220872458645&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F)