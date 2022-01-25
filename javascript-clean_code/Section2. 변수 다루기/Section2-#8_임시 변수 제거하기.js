function getElement() { // getElement 함수는 Query Selector 라는 웹 API를 통해서 DOM을 가져온 다음에 객체에 넣어주고 반환하는 기능을 수행
  const result = {}; // 임시 객체

  result.title = document.querySelector('.title');
  result.text = document.querySelector('.text');
  result.value = document.querySelector('.value');

  return result;
}

function getElement() { // getElement 함수는 Query Selector 라는 웹 API를 통해서 DOM을 가져온 다음에 객체에 넣어주고 반환하는 기능을 수행
  const result = {
    title: document.querySelector('.title'),
    text: document.querySelector('.text'),
    value: document.querySelector('.value')
  }; 

  return result;
}

function getElement() { // getElement 함수는 Query Selector 라는 웹 API를 통해서 DOM을 가져온 다음에 객체에 넣어주고 반환하는 기능을 수행
  return {
    title: document.querySelector('.title'),
    text: document.querySelector('.text'),
    value: document.querySelector('.value')
  };
}