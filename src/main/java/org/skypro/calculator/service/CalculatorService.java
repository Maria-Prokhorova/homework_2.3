package org.skypro.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Делить на ноль нельзя, введите другое значение";
        } else return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}

