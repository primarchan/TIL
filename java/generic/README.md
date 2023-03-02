# 제네릭(Generic) 이해하기

## 제네릭(Generic) 이란?
- [참고 자료 링크 (클릭하기)](https://www.nextree.io/generic-ihaehagi-2)
- 제네릭(Generic)은 개발 과정에서 직접 정의하는 경우는 많지 않습니다.
- 그렇지만 다양한 코드를 분석하고 사용할 때 제네릭의 개념과 기능 그리고 문법적 표현 방식을 이해하는 것이 중요합니다.
```java
// Java
public static <T extends Comparable<? super T>> List<T> sorted(List<T> list) {
        ...
        }
```
```typescript
// TypeScript
function useState<S>(initialState: S | (() => S)): [S, Dispatch<SetStateAction<S>>]
type Dispatch<A> = (value: A) => void;
type SetStateAction<S> = S | ((prevState: S) => S);
```

## 제네릭 개념
- 제네릭이란 타입을 일반화 한 것!
> "타입의 일반화" 란 클래스 내부에서 타입을 지정하는 것이 아니라, 외부에서 지정할 수 있도록 정의하는 것을 의미합니다.  
> "외부에서 지정" 한다는 것은 제네릭 클래스의 인스턴스화 시점 혹은 제네릭 메소드 호출 시점에 내부의 타입을 지정하는 것을 뜻합니다.
```java
// 제네릭을 적용하지 않은 예시 코드
public class Box {
    private Apple apple;
    
    public Apple takeOut() {
        return this.apple;
    }
    
    public void putIn(Apple apple) {
        this.apple = apple;
    }
}
```
```java
// 제네릭을 적용한 예시 코드
public class Box<T> {
    private T material;

    public T takeOut() {
        return this.material;
    }

    public void putIn(T material) {
        this.material = material;
    }
}
```

## 제네릭의 장점
- 재사용성 
  - 제네릭 타입의 정의는 타입 파라미터를 통해 서로 다른 속성을 갖는 인스턴스를 생성할 수 있기 때문에 코드를 간결하게 하고 재사용성을 높입니다.
- 에러 검출 (컴파일 시점)
  - 제네릭 타입이 적용되어 있지 않을 경우, 실행 타임 (런 타임) 에 형 변환의 에러가 발생할 여지가 많습니다.
- 형 변환 과정 생략 
  - 제네릭 타입은 컴파일 과정에서 타입에 대한 검사가 진행되기 때문에 코드상에서 타입 캐스팅(형 변환) 을 명시적으로 추가할 필요가 없습니다.
- 개발 생산성 
  - 제네릭 타입은 내부 객체 타입의 정보를 IDE 가 알 수 있기 때문에 내부 객체가 갖고 있는 기능을 원할하게 사용할 수 있습니다.

## 제네릭 클래스 정의와 사용 시 고려사항

```java
// PaperBox 클래스, PlasticBox 클래스 등을 따로 만들 필요 없이
// 하나의 Box 제네릭 클래스를 사용하면 됩니다.
public class Box<T> {
    public T material;

    Box(T material) {
        this.material = material;
    }
}

Box<Paper> paperBox = new Box<Paper>(new Paper());
Box<Plastic> plasticBox = new Box<Plastic>(new Plastic());
```
- 제네릭 타입 파라미터의 상속 관계
  - 제네릭 타입 파라미터 간에는 상속 관계에서의 형 변환이 적용되지 않습니다.
- 제네릭 타입 파라미터의 배열 정의 
  - 제네릭 타입을 정의할 때 타입 파라미터를 이용한 배열 생성이 불가합니다.
- 타입 파라미터에 static 선언 불가 
  - 제네릭 타입을 정의할 때, 타입 파라미터는 static 이 적용될 수 없으며, 마찬가지로 static 메소드를 선언할 수 없습니다.

## 제네릭 변성 (variance) 의 의미 - 공변성, 반공변, 불공변
> 공변 
> - Child 클래스가 Parent 의 하위 타입이면
>   - Child[] 은 Parent[] 의 하위 타입이다.
>   - List<Child> 는 List<Parent> 의 하위 타입이다.

> 반공변
> - Child 클래스가 Parent 의 하위 타입이면
>   - Parent[] 은 Child[] 의 상위 타입이다.
>   - List<Parent> 는 List<Child> 의 상위 타입이다.

> 불공변
> - Child 클래스가 Parent 의 하위 타입이며
>   - List<Parent> 와 List<Child> 는 다른 타입이다.

```java
// 공변
Object[] objects = new String[10];

// 반공변
String[] strArr = (String[]) objects;

// 불공변
// Type mismatch: cannot convert from
// ArrayList<String> to List<Object>
List<Object> list = new ArrayList<String>();
```

## 제네릭 와일드 카드
- 제네릭의 타입 파라미터는 단 하나의 타입만 허용되며, 이러한 문제점을 해결하기 위해 와일드카드가 도입되었습니다.
```java
// 특정 타입이 아닌 여러가지 타입을 담고자 모든 객체의 상위인 Object 를 타입으로 지정하였으나...
public void printObjectList(List<Object> list) { ... }

List<Integer> list = Arrays.asList(1, 2, 3);
printObjectList(list);

// error
// List<Integer> 는 List<Object> 의 하위타입이 아닌 별개의 타입
```
- 와일드 카드 종류

| 와일드 카드        | 명칭                                         | 설명                           |
|---------------|--------------------------------------------|------------------------------|
| <?>           | Unbounded Wildcards<br/>(비한정적 와이들 카드)      | 모든 타입 가능 (제한없음)              |
| <? extends T> | Upper Bounded Wildcards<br/>(상한 경계 와이들 카드) | 상위 클래스 제한 (T 와 그 하위 클래스만 가능) |
| <? super T>   | Lower Bounded Wildcards<br/>(하한 경계 와일드 카드) | 하위 클래스 제한 (T 와 그 상위 클래스만 가능) |

```java
class Steal { ... }

class Paper extends Material { ... }

// <? extends Material> 의 ? 에다 T 라는 이름을 붙여놓은 예시
class Box<T extends Material> {
    public T material;

    Box(T material) { this.material = material; }
}

new Box<Steal>(new Steal());  // error Steal 은 Material 의 자식이 아님
new Box<Paper>(new Paper());  // OK
```

## 제네릭 메소드와 고려사항
- 제네릭 메소드는 하나의 메소드에 다양한 타입의 파라미터로 메소드 호출을 가능하게 합니다.
- 제네릭 메소드의 타입 파라미터는 그 범위 (scope) 가 해당 메소드 내로 한정되며, 제네릭 클래스의 타입 파라미터와 중첩될 경우 메소드의 타입 파라미터가 우선합니다.
- 제네릭 타입 파라미터의 상속 관계
  - 제네릭 타입과 마찬가지로 제네릭 메소드의 타입 또한 불공변의 특성을 가지며, 타입 파라미터간에 형변환이 적용되지 않습니다.
- 제네릭 클래스(타입) 내부에서 정의
  - 제네릭 메소드는 일반 클래스 내부 뿐만 아니라 제네릭 클래스(타입) 내부에서도 정의할 수 있습니다.
- static 적용 가능
  - static 속성을 갖는 제네릭 메소드를 정의할 수 있습니다.
