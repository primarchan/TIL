function example() {
  return condition1 ? value1
    : condition2 ? value2
    : condition3 ? value3
    : value4;
}

function example() {
  if(condition1) {
    return value1;
  }
  else if(condition2) {
    return value2;
  }
  else if(condition3) {return value3;
  }
  else {return value4;
  }
}

// 임시 변수에 조건 할당
const temp = condition1; condition2; condition3;

switch(key) {
  case value:

    break;

  default:
    break;
}

const example = condition1
  ? (a === 0 ? 'zero' : 'positive')
  : 'negative';

  const welcomeMessage = (isLogin) => {
    const name = isLogin ? getName() : '이름없음'; // isLogin이 있으면, 이름을 가져옴 / isLogin이 없으면 '이름없을'을 반환

    return `안녕하세요 ${name}`; // 가져온 이름으로 메세지를 반환/출력
  };

  const example = condition1
  ? (a === 0 ? 'zero' : 'positive')
  : 'negative';

  const welcomeMessage = (isLogin) => {
    if(isLgoin) {
      return `안녕하세요 ${getName()}`; 
    }

    return `안녕하세요 '이름없음'`; 
  };

function alertMessage(isAdult) {
  isAdult
    ? alert('입장이 가능합니다.')
    : alert('입장이 불가능합니다.');
}

function alertMessage(isAdult) {
  if(isAdult) {
    alert('입장이 가능합니다.');
  } else {
    alert('입장이 불가능합니다.');
  }
}