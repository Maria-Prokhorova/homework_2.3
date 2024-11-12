package org.skypro.calculator.controller;

import org.skypro.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService resultService;

    public CalculatorController(CalculatorService resultService) {
        this.resultService = resultService;
    }

    @GetMapping
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    //Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть
    // результат в формате “5 + 5 = 10”

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return resultService.plus(num1, num2);
    }

    //Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и
    // вернуть результат в формате “5 − 5 = 0”.

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return resultService.minus(num1, num2);
    }

    //Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и
    // вернуть результат в формате “5 * 5 = 25”.

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return resultService.multiply(num1, num2);
    }

    //Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и
    // вернуть результат в формате “5 / 5 = 1”.
    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return resultService.divide(num1, num2);
    }

}
