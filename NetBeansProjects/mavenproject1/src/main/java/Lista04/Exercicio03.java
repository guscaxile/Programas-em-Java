package Lista04;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        TesteExercicio03 camiseta = new TesteExercicio03();

        camiseta.enderecoRemetente = "Rua Japão 125";
        camiseta.enderecoDestinatario = "Rua Jamaica 472";
        camiseta.distancia = 60.72;

        Scanner leitorTamanho = new Scanner(System.in);
        Scanner leitorValor = new Scanner(System.in);

        System.out.println("\nInsira o tamanho da camiseta (P, M ou G):");

        String tamanhoDigitado = leitorTamanho.nextLine();

        camiseta.tamanho = tamanhoDigitado;

        if (tamanhoDigitado.equals("p") || tamanhoDigitado.equals("P")) {

            camiseta.tamanhoLongo = "Pequeno";
        } else if (tamanhoDigitado.equals("m") || tamanhoDigitado.equals("M")) {

            camiseta.tamanhoLongo = "Médio";
        } else {

            camiseta.tamanhoLongo = "Grande";
        }

        System.out.println("\nInsira o valor da camiseta: ");
        camiseta.valor = leitorValor.nextDouble();

        camiseta.calcularFrete(camiseta.valor);

        camiseta.emitirEtiqueta();
    }
}
