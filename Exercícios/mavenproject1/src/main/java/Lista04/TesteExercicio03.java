package Lista04;

public class TesteExercicio03 {

    String tamanho; //(Ex: P, M ou G) 
    String enderecoRemetente; //(Ex: Rua Santos da Glória, 18)
    String enderecoDestinatario; //(Ex: Av Dr. Pedro, 255) 
    Double distancia; //(Ex: 42.2)
    Double valor; //(Ex: 87.50) 
    Double valorFrete;
    String tamanhoLongo;

    void calcularFrete(Double valor) {

        if (tamanho.equals("p") && distancia <= 50) {

            valorFrete = ((valor / 100) * 1) + 3;
        } else if (tamanho.equals("m") && distancia <= 50) {

            valorFrete = ((valor / 100) * 3) + 3;
        } else if (tamanho.equals("g") && distancia <= 50) {

            valorFrete = ((valor / 100) * 5) + 3;
        } else if (tamanho.equals("p") && distancia > 50 && distancia <= 200) {

            valorFrete = ((valor / 100) * 1) + 5;
        } else if (tamanho.equals("m") && distancia > 50 && distancia <= 200) {

            valorFrete = ((valor / 100) * 3) + 5;
        } else if (tamanho.equals("g") && distancia > 50 && distancia <= 200) {

            valorFrete = ((valor / 100) * 5) + 5;
        } else if (tamanho.equals("p") && distancia > 200) {

            valorFrete = ((valor / 100) * 1) + 7;
        } else if (tamanho.equals("m") && distancia > 200) {

            valorFrete = ((valor / 100) * 3) + 7;
        } else if (tamanho.equals("g") && distancia > 200) {

            valorFrete = ((valor / 100) * 5) + 7;
        }
    }

    void emitirEtiqueta() {
        System.out.println("\n\n\nEtiqueta para envio: 402581342\nEndereço do remetente: " + enderecoRemetente
                + "\nEndereço do destinatário: " + enderecoDestinatario + "\nTamanho: " + tamanhoLongo
                + "\n\n--------------------------------------------------\n" + "\nValor encomenda R$: " + valor
                + "\nValor frete R$: " + valorFrete + "\n\n--------------------------------------------------\n"
                + "\nValor total R$: " + (valorFrete + valor) + "\n\n");
    }
}
