let global = '전역';

if(global === '전역') {
  let global = '지역'

  console.log(global);  // 지역
}

console.log(global);  // 전역

const person = { // 동시에 선언 & 할당
  name: 'jang',
  age: '30'
};

person = { // Erro : Assignment to constant variable.(const로 선언된 변수는 재할당 금지)
  name: 'jang', 
  age: '30'
};

// const로 선언된 객체 내 요소 값 재할당(변경) 가능
person.name = 'lee'; 
person.age = 'age';

console.log(person); // { name: 'lee', age: '22' }

// const로 선언된 배열 내 요소 값 재할당(변경) 가능
const person2 = [{
  name: 'lee',
  age: '22'
}];

person2.push({
  name: 'jang',
  age: '30'
});

console.log(person2); // { name: 'lee', age: '22' }, { name: 'jang', age: '30' }