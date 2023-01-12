const readLine = require('readline-sync');

function showPrompt() {
    console.clear();
    const testStr = readLine.question('Enter test message : ');
    console.log(testStr);
}

showPrompt();