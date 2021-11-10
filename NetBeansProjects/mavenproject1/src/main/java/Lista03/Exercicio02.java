
package Lista03;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        TesteExercicio02 calc = new TesteExercicio02();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a sua renda: ");
        Double renda = leitor.nextDouble();
        
        Double mediaSalario = calc.calcMedia(renda);
        
        System.out.println(String.format("Você recebe aproximadamente: %.1f salários mínimos.", mediaSalario));
        
        calc.exibirClasse(renda);
    }
}
