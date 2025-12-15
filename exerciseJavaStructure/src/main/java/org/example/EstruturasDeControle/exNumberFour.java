package org.example.EstruturasDeControle;

//Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números,
//a execução do código irá continuar até que o número informado dividido pelo primeiro número
//tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados


import java.util.Scanner;

public class exNumberFour {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Integer firstNumber;
        System.out.println("Write your first number:");
        firstNumber = scanner.nextInt();
        Integer numbers;
        do {
            System.out.println("Write another number:");
            numbers = scanner.nextInt();
        } while ((numbers % firstNumber == 0) || (numbers < firstNumber));
    }
}

