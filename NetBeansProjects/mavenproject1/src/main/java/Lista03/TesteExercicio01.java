
package Lista03;

import java.util.Scanner;

public class TesteExercicio01 {
    
    public static void main(String[] args) {
        
        Exercicio01 med = new Exercicio01();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digita a primeira nota: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        Double nota2 = leitor.nextDouble();
        
        System.out.println("Sua média é: " + med.calculaMedia(nota1, nota2));
    }
}
