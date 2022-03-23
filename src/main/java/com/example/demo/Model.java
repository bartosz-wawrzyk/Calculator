package com.example.demo;

public class Model {

    public float calculate(float number1, float number2, String operator){

        switch (operator){
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if(number2 == 0){
                    return 0;

                }else{
                    return number1 / number2;
                }


            default:
                return 0;
        }
    }

    public float calculateUnary(float number1, String operator){

        switch (operator){
            case "sin":
                return (float)Math.sin(number1);
            case "cos":
                return (float)Math.cos(number1);
            case "tan":
                return (float)Math.tan(number1);
            case "ln":
                return (float)Math.log(number1);

            default:
                return 0;
        }
    }
}
