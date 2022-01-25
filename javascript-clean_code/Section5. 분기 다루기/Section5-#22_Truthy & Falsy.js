if('string'.length > 0) {

}

if('string') {

}

if(!isNaN(10)) {

}

if(10) {

}

if(boolean === true) {

}

if(boolean) {

}

function printName(name) {
  if(name === undefined || name === null) {
    return '사람이 없네요';
  }

  return '안녕하세요' + name + '님';
}

// var customer = 'poco';
// var customer = null

console.log(printName()); // 사람이 없네요