package org.example;

//Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

import java.util.Scanner;

public class exNumberOne {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Integer number = 0;
        System.out.println("Write your number:");
        number = scanner.nextInt();

        for (var i = 1; i <= 10; i++){
            System.out.printf("%s x %s = %s \n", number, i, (number* i ));
        }

    }
}