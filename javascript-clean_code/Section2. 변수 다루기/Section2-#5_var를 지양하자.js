// 함수 스코프 : var
// 블록 스코프, TDZ(Temporal Dead Zone) : let, const -> 안전한 코드 작성 가능

// 문자열 '이름'이 담긴 변수 name 선언
var name = '이름';
var name = '이름2';
var name = '이름2';
var name = '이름3';

// 가장 마지막에 할당된 값이 출력 -> 편하게 재할당 가능, 재선언(중복선언) 무한히 가능
// console.log(name);

let name1 = '이름';
let name1 = '이름';
let name1 = '이름'

const name2 = '이름';
const name2 = '이름';
const name2 = '이름';