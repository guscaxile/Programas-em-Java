package VistoEmAula;

public class TesteApp {

    public static void main(String[] args) {

        //instância = criando um objeto conta corrente a partir de uma classe
        ContaCorrente conta1 = new ContaCorrente();
        conta1.nomeTitular = "Gustavo";
        conta1.saldo = 15.0;

        System.out.println("\nConta 1: \n");
        System.out.println(conta1.nomeTitular);
        System.out.println(conta1.saldo);

        ContaCorrente conta2 = new ContaCorrente();
        conta2.nomeTitular = "Bruno";
        conta2.saldo = 10.0;

        System.out.println("\nConta 2: \n");
        System.out.println(conta2.nomeTitular);
        System.out.println(conta2.saldo);

        System.out.println("\nChamando depósito para conta 1: \n");
        conta1.depositar(10.0);

        System.out.println("\nConferindo conta 2: \n");
        System.out.println("Saldo: " + conta2.saldo);

        System.out.println("\nChamando saque para a conta 2: \n");
        conta2.sacar(7.0);
        conta2.depositar(2.0);
    }
}
