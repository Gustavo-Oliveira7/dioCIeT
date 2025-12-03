package org.example;

//Escreva um código onde o usuário entra com sua altura e peso,
// seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e
// seja exibida a mensagem de acordo com o resultado:
//
//  Se for menor ou igual a 18,5 "Abaixo do peso";
//  se for entre 18,6 e 24,9 "Peso ideal";
//  Se for entre 25,0 e 29,9 "Levemente acima do peso";
//  Se for entre 30,0 e 34,9 "Obesidade Grau I";
//  Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
//  Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

import java.util.Scanner;

public class exNumberTwo {
    public static String main(String[] args) {
        var scanner = new Scanner(System.in);
        Integer height = 0;
        float weight = 0;
        System.out.println("Write your height in centimeters");
        height = scanner.nextInt();
        System.out.println("Write your weight in kilograms");
        weight = scanner.nextFloat();
        float imc = (weight/height*height);
        if (imc <= 18.5){
            return "Abaixo do peso";
        } if(imc <= 24.9){
            return "Peso ideal";
        } if (imc <= 29.9) {
            return "Levemente acima do peso";
        } if (imc <= 34.9) {
            return "Obesidade Grau I";
        } if (imc <= 39.9) {
            return "Obesidade Grau II (Severa)";
        } else {
            return "Obesidade III (Mórbida)";
        }
    }
}
