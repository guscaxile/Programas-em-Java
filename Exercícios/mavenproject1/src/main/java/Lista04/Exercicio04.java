package Lista04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        TesteExercicio04 temp = new TesteExercicio04();

        temp.temperaturaAtual = 24.0;
        temp.temperaturaMax = 24.0;
        temp.temperaturaMin = 24.0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {

            System.out.println(
                    "\nDigite o que deseja: \n\n1 - Adicionar o quanto aumentou "
                            + "a temperatura \n\n2 - Subtrair o quanto diminuiu "
                            + "a temperatura \n\n3 - Mostrar a temperatura atual "
                            + "em Fahreinheit \n\n4 - Mostrar a temperatura máxima "
                            + "alcançada \n\n5 - Mostrar a temperatura mínima alcançada");

            Integer opcaoEscolhida = leitor.nextInt();

            if (opcaoEscolhida == 1) {

                System.out.println("\nInsira o quanto aumentou a temperatura: ");

                Double temperaturaDigitada = leitor.nextDouble();

                temp.aumentaTemperatura(temperaturaDigitada);
            } else if (opcaoEscolhida == 2) {

                System.out.println("\nInsira o quanto diminuiu a temperatura: ");

                Double temperaturaDigitada = leitor.nextDouble();

                temp.diminuiTemperatura(temperaturaDigitada);
            } else if (opcaoEscolhida == 3) {

                temp.exibeFahreinheit();
            } else if (opcaoEscolhida == 4) {

                System.out.println("\nA temperatura máxima alcançada foi de: " + temp.temperaturaMax + "°C\n\n\n\n");
            } else if (opcaoEscolhida == 5) {

                System.out.println("\n\nA temperatura mínima alcançada foi de: " + temp.temperaturaMin + "°C\n\n\n\n");
            }
        }
    }
}
