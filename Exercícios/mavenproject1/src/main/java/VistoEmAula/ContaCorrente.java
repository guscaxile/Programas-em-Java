package VistoEmAula;

public class ContaCorrente {

    //criando atributos da conta = características
    String nomeTitular;
    Double saldo;

    //métodos = comportamentos
    void depositar(Double valorDeposito) {

        System.out.println("Saldo antes de depósito: " + saldo);
        saldo = saldo + valorDeposito;
        System.out.println("Saldo depois do depósito: " + saldo);
    }

    void sacar(Double valorSaque) {

        System.out.println("Valor antes do saque: " + saldo);
        saldo = saldo - valorSaque;
        System.out.println("Valor depois do saque: " + saldo);
    }
}
