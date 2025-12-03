package org.example;

//Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e
//escolhe entre a opção par e impar, com isso o código deve informar todos os números
//pares ou ímpares(de acordo com a seleção inicial) no intervalo de números informados,
//incluindo os números informados e em ordem decrescente;

import java.util.ArrayList;
import java.util.Scanner;

public class exNumberThree {
    public static void main(String[] args) {
        var scanner  = new Scanner(System.in);
        Integer firstNumber = 0;
        Integer secondNumber = 0;
        System.out.println("Write your first number:");
        firstNumber = scanner.nextInt();
        System.out.println("Write your second number:");
        secondNumber = scanner.nextInt();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (var i = firstNumber; i <= secondNumber; i++){
            Integer division = i % 2;
            if (division == 0) {
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }
        System.out.printf("These are the even numbers \n %s \n", evenNumbers);
        System.out.printf("These are the odd numbers \n %s", oddNumbers);

    }
}
