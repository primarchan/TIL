// 1. 문자형
// 문자열을 표현하는 방법("", '', ``)
const name1 = "Mike";
const name2 = "Mike";
const name3 = `Mike`;

const message1 = "I'm a boy.";
const message2 = "I'm a boy."; // \앞에 붙여주면 특수문자로 인식

const message3 = `My name is ${name}`; // ``은 문자열 안에 변수를 표현 할 때 사용, 일반 '' 사용 시 변수명이 그대로 노출됨
const message4 = `나는 4{30 + 1}살 입니다.`;
console.log(message4);

// 2. 숫자형
const age = 30;
const PI = 3.14;

console.log(1 + 2); // 덧셈
console.log(10 - 3); // 뺄셈
console.log(3 * 2); // 곱셈
console.log(6 / 3); // 나눗셈
console.log(6 % 4); // 나머지

const x = 1 / 0;
console.log(x); // 0으로 나눴을 때 결과 값 : Infinity

const name4 = 'Mike';
const y = name / 2;
console.log(y); // 문자열을 숫자로 나눘을 때 결과 값 : NaN(Not a Number)


// Boolean 타입
const a = true;  // 참
const b = false; // 거짓

const name5 = 'Mike';
const age2 = 30;

console.log(name5 == 'Mike'); // true 반환
console.log(age > 40); // false 반환


// null & undifined
// null : 존재하지 않는 값
// undifined : 값이 할당되지 않음
let age3;
console.log(age3); // 변수를 선언만 하고 값을 할당하지 않았기 때문에 undifined를 반환
let age4 = null;
console.log(age4);


// 객체형, 심볼형 등..


// typeof 연산자
const name6 = "Mike";

console.log(typeof 3);         // Number
console.log(typeof name);      // String
console.log(typeof true);      // Boolean
console.log(typeof "xxx");     // String
console.log(typeof null);      // object(객체형) -> null은 객체형이 아님, 자바스크립트 초기 버전의 오류
console.log(typeof undifined); // undifined


// Tip
// 문자형 + 문자형 -> 하나로 합쳐짐
const name7 = "Kevin";
const a1 = '나는 ';
const b1 = '입니다.';
console.log(a1 + name7 + b1);

const age5 = 28;
console.log(a1 + age5 + "살" + b1); // 문자형 + 숫자형 -> 문자형으로 변환