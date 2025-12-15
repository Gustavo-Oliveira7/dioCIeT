package org.example.ClassesEncapsulamentos.exNumberOne;

/*
Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
Consultar saldo
consultar cheque especial
Depositar dinheiro;
Sacar dinheiro;
Pagar um boleto.
Verificar se a conta está usando cheque especial.
Siga as seguintes regras para implementar

A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
*/


public class bankAccount {
    private double saldo;
    private double chequeEspecial;
    private double limiteChequeEspecial;

    public bankAccount(double deposito){
        this.saldo = 0;
        this.chequeEspecial = 0;

        if(deposito < 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = deposito * 0.5;
        }
    }

    public void deposito (double valor) {
        if (valor <= 0) {
            System.out.println("Digite um valor válido");
            return;
        }
        if (chequeEspecial > 0) {
            double taxaChequeEspecial = chequeEspecial + 1.2;
            if (valor < chequeEspecial){
                chequeEspecial -= valor;
            } else {
                valor -= taxaChequeEspecial;
                chequeEspecial = 0;
            }
        saldo += valor;
        }

    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

}
