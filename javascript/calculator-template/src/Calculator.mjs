// import { isNumber, isOperation } from './Validator.mjs';
import validator from './Validator.mjs';

let inputDataArray = [];

function appendData(inputData) {
    inputDataArray.push(inputData);
}

function getInputDataArrayMessage() {
    let message = '';
    inputDataArray.map(element => message += element);
    return message;
}

function calculate() {
    let result = parseInt(inputDataArray[0]);
    let currentNumber = 0;
    let currentOperation = '';
    let prevOperation = '';

    inputDataArray.forEach(element => {
        if (validator.isNumber(parseInt(element))) {
            currentNumber = parseInt(element);
        } else if (validator.isOperation(element)) {
            currentOperation = element;
        }

        switch (prevOperation) {
            case '+' :
                result += currentNumber;
                break;
            case '-' :
                result -= currentNumber;
                break;
            case '*' :
                result *= currentNumber;
                break;
            case '/' :
                result /= currentNumber;
                break;
            default:
                break;
        }
        prevOperation = currentOperation;
        currentOperation = '';
    });
    return result;
}

export default {
    appendData,
    getInputDataArrayMessage,
    calculate,
}