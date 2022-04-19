package Lista02;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Integer primeiroNumero;
        Integer soma = 0;

        do {
            
            System.out.println("Digite um número");
            primeiroNumero = leitor.nextInt();
            soma += primeiroNumero;
        }while(primeiroNumero != 0);
        
        System.out.println(soma);
    }
}

//Criar uma classe chamada “Acumulador” que :
//
//Leia vários números até ler o número 0 e calcule a soma dos números lidos.
//     (Não é para usar vetor).
