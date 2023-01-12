import { question } from 'readline-sync';
import calculator from "./Calculator.mjs";

function showPrompt() {
    while (true) {
        let inputData = question('Enter number or operation : ');

        if (inputData !== '=') {
            calculator.appendData(inputData);
            console.log(calculator.getInputDataArrayMessage());
        } else {
            console.log(calculator.getInputDataArrayMessage() + '=' + calculator.calculate());
            break;
        }
    }
}

showPrompt();