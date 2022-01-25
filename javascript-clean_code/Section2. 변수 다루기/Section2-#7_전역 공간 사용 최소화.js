/**
 * <전역 공간 사용 최소화 이유>
 * 1. 경험 
 * 2. 누군가 혹은 JavaScript 생태계
 * 3. 강의 or 도서
 * 4. 회사 or 멘토
 * 5. Lint
**/

// 전역 공간(최상위 공간) : global(Node.js 환경), window(웹 브라우저 환경)

var globalVar = 'global';

console.log(globalVar);

setTimeout(() => {
  console.log('1초');
}, 1000);

// 전역 공간을 더럽히지 않기
// 어디서나 접근 가능하기 때문에 스코프 분리 위험
// 1. 전역 변수 만들지 않는다.
// 2. 지역 변수로 만듦
// 3. window, global을 조작 X
// 4. const, let 사용
// 5. IIFE(즉시 실행 함수), Module, Closure, 스코프 나누는 방법