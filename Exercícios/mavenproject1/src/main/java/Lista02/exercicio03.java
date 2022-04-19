
package Lista02;

import java.util.Scanner;

public class exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Integer tentativas = 0;
        
        while(tentativas >= 0){
            
            System.out.println("Digite o seu login:");
            String login = leitor.next();
            
            System.out.println("Digite a sua senha:");
            Integer senha = leitor.nextInt();
            
            if(login.equalsIgnoreCase("admin")){
                
                if(senha.equals(123)){
                    
                    System.out.println("Bem vindo senhor do mundo, rei de todo o universo.");
                }else{
                    
                    System.out.println("Erro! Seu impostor!");
                }
                
                tentativas++;
            }
        }
    }
}
