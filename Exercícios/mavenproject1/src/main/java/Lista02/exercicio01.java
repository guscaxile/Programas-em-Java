package Lista02;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número de 0 a 10:");
        Integer numeroInformado = leitor.nextInt();

        Integer numeroAleatorio;
        Integer contador = 0;

        do {

            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            contador++;
        } while (!Objects.equals(numeroInformado, numeroAleatorio));

        if (contador <= 3) {

            System.out.println("Você é MUITO sortudo");
        } else if (contador <= 10) {

            System.out.println("Você é sortudo");
        } else {

            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }

        System.out.println(contador);
    }
}

//Solicite um número entre 0 e 10 para o usuário.
//Tente advinhar o número digitado através de números randômicos.
//A cada iteração exiba o número sorteado. 
//Quando acontecer o “acerto” se a quantidade de vezes necessárias for: 
//          Até 3: exiba "Você é MUITO sortudo"
//          Entre 4 e 10: exiba "Você é sortudo"
//          Mais de 10: exiba "É melhor você parar de apostar e ir trabalhar"
