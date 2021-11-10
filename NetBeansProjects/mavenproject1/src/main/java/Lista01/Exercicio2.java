package Lista01;


import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos filhos de 0 a 3 anos você tem?");
        Double primeiraIdade = leitor.nextDouble();

        System.out.println("Quantos filhos de 4 a 16 anos você tem?");
        Double segundaIdade = leitor.nextDouble();

        System.out.println("Quantos filhos de 17 a 18 anos você tem?");
        Double terceiraIdade = leitor.nextDouble();

        Double bolsa1 = primeiraIdade * 25.12;
        Double bolsa2 = segundaIdade * 15.88;
        Double bolsa3 = terceiraIdade * 12.44;
        Double totalBolsa = bolsa1 + bolsa2 + bolsa3;

        System.out.println(String.format("Você tem um total de " + (primeiraIdade + segundaIdade + terceiraIdade) + " filhos e vai receber R$ %.2f de bolsa", totalBolsa));
    }
}
