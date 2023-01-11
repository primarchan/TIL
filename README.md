# TIL
- Today I Learned

## JavaScript for Beginner
<details>
<summary><b>JavaScript 기초 강의 (클릭)</b></summary>
<div markdown="1">

### 1강 - JavaScript 소개
<details>
<summary><b>1강 학습 자료 보기 (클릭)</b></summary>
<div markdown="1">

#### 1.1 JavaScript 개요
- JS 는 프로토타입 기반의 스크립트 언어로 객체지향 개념을 지원합니다.
- JS 는 다중패러다임 (Multi-paradigm) 언어로 객체지향, 절차지향 프로그래밍이 가능합니다.
- 하나의 웹 페이지는 HTML, CSS, JS 에 의해 표현되고 사용자와 상호 작용합니다.
- JS 는 타입에 대한 제약이 느슨한 타입 언어 (Loosely Typed Language) 입니다.

#### 1.2 JavaScript 활용
- JS 는 SPA (Single Page Application) 개발에 적용되는 다양한 프레임워크의 기반이 되는 언어입니다.
- 웹브라우저에서만 동작하던 JS 는 이제 Node.js 를 통해 서버 프로그래밍에도 활용되고 있습니다.
- JS 가 다양한 프레임워크와 라이브러리의 토대가 되는 만큼 기본적인 핵심개념과 사용에 대한 이해가 필요합니다.

#### 1.3 ECMAScript
- ECMAScript 는 JS 의 표준화를 위해 만들어진 스크립트 언어입니다.
- ECMAScript 의 상위 집합 (superset) 이 바로 JavaScript, JScript, ActionScript 입니다.
- ECMAScript 의 표준 재정은 매년 이루어지고 있으며 2015년 재정된 ES2015 버전에서 많은 변화가 이루어졌습니다.
- ES2015/ES6 의 주요 변화로는 Class, Module, Inheritance 등이 있습니다.

#### 1.4 개발환경 구성 (1/2)
- Visual Studio Cod 는 MS 사에서 개발한 코드 편집 도구입니다.
- 다음의 URL 을 통해 해당 사이트에서 개발 컴퓨터에 적합한 버전을 다운로드합니다.
  - https://code.visualstudio.com

#### 1.4 개발환경 구성 (2/2)
- JS 는 기본적으로 Web 기반의 언어로 개발되었습니다. 따라서, 실행범위가 Web Browser 로 국한되었습니다.
- Node.js 는 V8 엔진 기반의 JS 실행 환경을 제공합니다. 즉, Web Browser 이외의 환경에서도 JS 를 실행할 수 있습니다.
- 다음의 URL 을 통해 개발 환경에 맞는 Node.js 를 설치합니다.
  - https://node.js.org
</div>
</details>

### 2강 - Data Types, Operators
<details>
<summary><b>2강 학습 자료 보기 (클릭)</b></summary>
<div markdown="1">

#### 2.1 JS Data Types
- JS 는 동적 타입 체계 (Dynamic Typed) 언어로 변수에 타입을 지정하지 않습니다.
- 동적 타입 체계는 변수에 할당되는 값의 타입에 따라 변수의 타입을 자동적으로 결정합니다.
- 이와 같은 동적 타입 체계의 장점은 프로그램의 유연성에 있지만 변수에 할당된 값을 읽어 사용하는 단계에서 문제가 발생할 여지를 가지고 있습니다.

#### 2.2 Variable[1/2] - let
- ES5 기준으로 변수의 선언은 var 키워드를 사용합니다. 이렇게 선언된 변수는 함수나 전역의 범위를 갖습니다.
- ES6 에는 let 을 이용한 변수 선언이 추가되었습니다.
- let 으로 선언한 변수는 해당 변수가 선언된 블록({}), 구문 또는 표현식 내에서만 유효합니다.
- let 변수는 전역 객체의 속성을 생성하지 않으며 Hoisting 이 적용되지 않습니다.
```js
// var scope
function testVar() {
    var n = 10;
    if (true) {
        var n = 20;
        console.log(n);  // 20
    }
    console.log(n);  // 20
}
```

```js
// let scope
function testLet() {
    let n = 10;
    if (true) {
        let n = 20;
        console.log(n);  // 20
    }
    console.log(n);  // 10
}
```

```js
// var hoisting
function hoistingVar() {
    console.log(text);  // undifined
    var text = "ES6";
    console.log(text);  // ES6
}
```

```js
// let hoisting
function hoistingVar() {
    console.log(text);
    // ReferenceError : text is not defined
    let text = "ES6";
    console.log(text);
}
```

#### 2.2 Variable[2/2] - const
- ES5 까지 상수는 변수명을 통해 구분할 수 있도록 하는 것이 일반적이었습니다. 하지만, 일반 변수와 같은 특성을 갖습니다.
- const 키워드는 ES6 부터 추가되었으며 상수 (사용자 정의 상수) 를 정의할 때 사용합니다.
- let 키워드처럼 블록 범위 (block-scope)를 가지며 선언과 동시에 초기화합니다.
```js
const PI = 3.141592;  // (O) 선언과 동시에 초기화

const PI;
PI = 3.141592;  // (X) Missing initializer in const declaration

const MY_MATH = {
    pi : 3.14
};

MY_MATH.pi = 3.141592;  // (O) 객체에 접근하여 element의 값 변경 가능

const MY_ARRAY = [];
MY_ARRAY.push("test");  // (O) 배열에 접근하여 추가 가능
MY_ARRAY = ["test"];    // (X) Uncaught TypeError: Assignment to constant variable
```

#### 2.3 Primitive Type[1/3]
- JS 의 데이터 원시타입 (Primitive Type) 은 모두 6가지 입니다.
- 숫자형 데이터 타입은 실수와 정수를 구분하지 않고 모든 숫자를 8 Byte 의 실수 형태로 처리합니다.
- 숫자 데이터 타입의 연산처리 시 실수 형태로 연산이 이루어지기 때문에 결과에 대한 오류가 발생할 수 있습니다.
- JS 는 숫자와 관련된 특별한 상수가 존재합니다.
  - NaN (Not a Number) : 계산식의 결과가 숫자가 아님을 나타내는 상수입니다.
  - Infinity : 무한대를 나타내는 상수이며 어떤 수를 0 으로 나누거나 Infinity 를 어떠한 수로 나눈 식의 결과를 나타냅니다.

```js
// 부동소수점 연산 오류
let x = 0.3 - 0.2;
let y = 0.2 - 0.1;

console.log(x == y);  // false
console.log(x);       // 0.99999999999999998
console.log(y);       // 0.1
```

```js
// Infinity, NaN
console.log(100 / 0);  // Infinity
console.log(Infinity / 100);  // Infinity

console.log(0 / 0);           // NaN
console.log(parseInt('1A'));  // 1
console.log(parseInt('A'));   // NaN
```

#### 2.3 Primitive Type[2/3]
- JS 의 문자열은 16비트의 Unicode 문자 체계를 사용합니다.
- 단일 문자를 표현하는 char 와 같은 타입은 제공하지 않으며, 'a' 와 같은 형태도 문자열로 표현합니다.
- 문자열 표현에 작은 따옴표 (', single quotes), 큰 따옴표(", double quotes) 모두 사용 가능하지만 혼용해서 사용하지는 않습니다.
```js
console.log("");
console.log('작은 따옴표로 문자열 나타내기');
console.log("3.14");
console.log('문자열 안에 포함된 "따옴표"는 이렇게...');
console.log('특수문자 사용하기 \n이 것은 두 번째 줄');
```

#### 2.3 Primitive Type[3/3]
- boolean 은 비교 연산의 결과 값으로, true 값 또는 false 값 중 하나를 가집니다.
- null 은 값이 없거나 비어있음을 뜻하고 undefined 는 값이 초기화되지 않았음 (정의되지 않음) 을 뜻합니다.
- null 과 undefined 는 의미가 비슷하지만 값을 할당하지 않은 변수는 undefined 가 할당되고 (시스템 레벨), 코드에서 명시적으로 값이 없음을 나타낼 때 (프로그램 레빌) 는 null 을 사용합니다.
- Symbol 타입은 변경 불가능한 원시타입의 값이며 ES6 부터 추가된 원시 타입입니다.
```js
// boolean, null, undefined
let undefinedVariable;
let nullValue = null;

let x = 10;
let y = 12;

console.log(x == y);             // false
console.log(undefinedVariable);  // undefined
console.log(nullValue);          // null
```

#### 2.4 Operators[1/4]
- JS 에서 기본적으로 제공하는 약속된 문자의 표현식을 연산자라고 합니다.
- 연산자에는 산술 연산자, 비교 연산자, 논리 연산자, 기타 연산자 등을 제공합니다.
- 표현 식에서 2개 이상의 연산자를 동시에 사용했을 경우 우선순위별로 표현식을 해석합니다.
- 괄호를 사용하여 우선순위를 조절할 수 있습니다.

#### 2.4 Operators[2/4]
- 연산자는 연산의 대상이 되는 연산의 대상이 되는 값에 따라서 동작이 결정됩니다.
- '+' 연산자는 대상의 값이 모두 숫자인 경우 산술 연산을 수행합니다.
- '+' 연산자는 대상 중에 문자열이 포함된 경우, 모든 연산 대상을 문자열로 변환하고 문자열을 붙입니다.
- 연산자는 종류에 따라 1항 연산자, 2항 연산자, 3항 연산자로 구분됩니다.

#### 2.4 Operators[3/4]
- a++ 와 a-- 는 각각 a = a + 1 과 a = a - 1 연산의 축약 형태로써 증감연산자라고 합니다.
- 증감연산자가 앞에 오면 연산을 먼저 실행하고, 뒤에 오면 해당 라인을 진행 후 연산을 실행합니다.
- ! 연산은 Not 의 의미로써 boolean 형의 값을 반대로 반환합니다.
- typeof 는 해당 변수의 타입을 반환합니다.
```js
let num1 = 10;
let num2 = 20;
let bool = true;

console.log("num1++ : ", + num1++);  // num1++ : 10
console.log("num1 : " + num1);       // num1 : 11
console.log("--num1 : " + --num1);   // --num1 : 10
console.log("!bool : " + !boot);     // !bool : false

console.log("typeof bool : " + typeof bool);  // typeof bool : boolean
console.log("typeof num1 : " + typeof num1);  // typeof num1 : number

console.log("num1 + num2 : " + (num1 + num2));  // num1 + num2 : 30
console.log("num1 - num2 : " + (num1 - num2));  // num1 - num2 : -10
console.log("num1 * num2 : " + (num1 * num2));  // num1 * num2 : 200
console.log("num1 / num2 : " + (num1 / num2));  // num1 / num2 : 0.5
```

#### 2.4 Operators[4/4]
- 논리값을 비교하여 참 (true) 과 거짓 (false) 을 판단할 수 있습니다.
- 비교연산자 ==, === 의 차이점은 자료형까지 비교하는지 아닌지의 여부입니다.
- 비교연산자 && 은 둘 중 하나라도 거짓 (false) 이며 false, || 는 둘 중 하나라도 참 (true) 이면 true 를 반환합니다.
- 3항 연산자의 ? 앞 비교 값이 참 (true) 이면 : 앞의 값을 반환하고, 거짓 (false) 이면 : 뒤에 값을 반환합니다.
```js
let num = 10;
let str = "10";

console.log("num == str : " + (num == str));        // num == str : true
console.log("num === str : " + (num === str));      // num == str : false

str = "20";

console.log("num != str : " + num != str);          // num != str : true 
console.log("num !== str : " + num1 !== str);       // num !== str : false 

console.log("true && true : " + (true && true));    // true && true :  true
console.log("true && false : " + (true && false));  // true && false : false
console.log("true || true : " + (true || true));    // true || true : true
console.log("true || false : " + (true || false));  // true || false : true

console.log("num > num ? 'true' : 'false' -> " + num > num ? 'true' : 'false');  // num > num ? 'true' : 'false' -> false
```

</div>
</details>


</div>
</details>