
package Lista02;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        
        Integer numeroDigitado = leitor.nextInt();
        
        String frase = String.format("\n Tabuada do %d \n \n %d x 0 = %d \n"
                + " %d x 1 = %d \n %d x 2 = %d \n %d x 3 = %d \n %d x 4 = %d \n"
                + " %d x 5 = %d \n %d x 6 = %d \n %d x 7 = %d \n %d x 8 = %d \n"
                + " %d x 9 = %d \n %d x 10 = %d \n \n Fim da execução. \n", 
        numeroDigitado, numeroDigitado, (numeroDigitado * 0),
        numeroDigitado, (numeroDigitado * 1), numeroDigitado, (numeroDigitado * 2),
        numeroDigitado, (numeroDigitado * 3), numeroDigitado, (numeroDigitado * 4),
        numeroDigitado, (numeroDigitado * 5), numeroDigitado, (numeroDigitado * 6),
        numeroDigitado, (numeroDigitado * 7), numeroDigitado, (numeroDigitado * 8),
        numeroDigitado, (numeroDigitado * 9), numeroDigitado, (numeroDigitado * 10));
        
        System.out.println(frase);
    }
}
