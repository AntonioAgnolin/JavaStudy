package org.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public String somar(float num1, float num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String subtrair(float num1, float num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplicar(float num1, float num2) {
        return num1 + " X " + num2 + " = " + (num1 * num2);
    }

    public String dividir(float num1, float num2) {
        if (num2 == 0) {
            return "Erro: Divisão por zero!";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
