// const readLine = require('readline-sync');
import { question } from 'readline-sync';

function showPrompt() {
    console.clear();

    const firstNumber = question('Enter first number : ');
    const operation = question('Enter operation : ');
    const secondNumber = question('Enter second number : ');

    const validation = isNumber(firstNumber) && isOperation(operation) && isNumber(secondNumber);

    if (validation) {
        let result = calculate(parseInt(firstNumber), operation, parseInt(secondNumber));
        console.log(`Result : ${result}`);
    } else {
        console.log('Invalid Input!!!');
    }
}

function isNumber(number) {
    return !isNaN(parseInt(number));
}

function isOperation(operation) {
    let operations = '+-*/';
    return operations.indexOf(operation) !== -1;
}

function calculate(firstNumber, operation, secondNumber) {
    switch (operation) {
        case '+' : return firstNumber + secondNumber;
        case '-' : return firstNumber - secondNumber;
        case '*' : return firstNumber * secondNumber;
        case '/' : return firstNumber / secondNumber;
    }
}

showPrompt();