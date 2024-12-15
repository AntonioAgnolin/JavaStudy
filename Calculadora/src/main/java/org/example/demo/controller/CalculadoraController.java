package org.example.demo.controller;

import org.example.demo.model.Calculadora;
import org.example.demo.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @PostMapping("/calculate")
    public String calculate(@RequestBody Calculadora request) {
        float num1 = request.getNum1();
        float num2 = request.getNum2();
        String operacao = request.getOperacao();

        switch (operacao) {
            case "somar":
                return calculadoraService.somar(num1, num2);
            case "subtrair":
                return calculadoraService.subtrair(num1, num2);
            case "multiplicar":
                return calculadoraService.multiplicar(num1, num2);
            case "dividir":
                return calculadoraService.dividir(num1, num2);
            default:
                return "Operação inválida!";
        }
    }
}
