/**
 *  매개변수의 순서가 경계다
 * 
 * 호출하는 함수의 네이밍과 인자의 순서의 연관성을 고려한다.
 * 
 * 1. 매개변수를 2개가 넘지 않도록 만든다.
 * 2. 매개변수가 2개가 넘어가게 되면 arguments, rest parameter 사용
 * 3. 랩핑하는 함수(순서 여부 존재)
 * 4. 매개변수를 객체에 담아서 넘긴다.(순서 여부 상관 없음)
 */

// ES2015+에 추가된 나머지 매개변수
function someFunc(someArg, ... someArg) {

}

// 매개변수를 객체로 받기
function someFunc({someArg, someArg}) {

}

// JavaScript에서 제공하는 arguments
function someFunc(someArg, someArg) {
  arguments
}

// 랩핑하는 함수
function someFunc(someArg1, someArg2, someArg3, someArg4) {
  
}

function getFunc(someArg1, someArg2) {
  someFunc(someArg1, someArg2);
}

function getFunc(someArg1, someArg3) {
  someFunc(someArg1, undifined, someArg3);
}
genRandomNumber(1, 50)
GeolocationCoordinates('2021-10-01', '2021-10-31');
genShuffleArray(1, 5)