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
    // TODO
}

export default {
    appendData,
    getInputDataArrayMessage,
    calculate,
}