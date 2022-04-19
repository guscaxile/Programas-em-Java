package Lista01;


import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
     
        System.out.println("Insira o seu login:");
        String login = leitor.nextLine();
     
        System.out.println("Insira a sua senha:");
        Integer senha = leitor.nextInt();
        
        System.out.println("Insira a quantidade de tentativas de login até que seja bloqueada a conta:");
        Double quantidadeLogin = leitor.nextDouble();
        
        String frase = String.format("Seu login é %s e sua senha é %d. Você tem %.0f tentativas antes de ser bloqueado", login, senha, quantidadeLogin);
        
        System.out.println(frase);
    }
}
