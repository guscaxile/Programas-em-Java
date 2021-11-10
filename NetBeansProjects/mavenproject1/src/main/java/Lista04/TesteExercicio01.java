package Lista04;

public class TesteExercicio01 {

    String sabor;
    Double valor;
    Integer quantidadeVendida = 0;

    void comprarBolo(Integer quantidadeCompras) {

        Integer quantidadeVendidaDia = quantidadeVendida + quantidadeCompras;

        if (quantidadeVendida > 100) {

            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        } else {

            quantidadeVendida = quantidadeVendidaDia;
        }
    }

    void exibirRelatorio() {
        
        Double totalVendas = quantidadeVendida * valor;

        System.out.println(String.format("O bolo sabor %s, foi comprado %d "
                + "vezes hoje, totalizando R$ %.2f", sabor, quantidadeVendida, totalVendas));
    }
}

//A confeitaria da Dona Maria, precisa de um sistema para gestão dos bolos 
//vendidos em sua loja, que possibilite a geração de um relatório de vendas 
//para cada tipo de bolo, para implementação do sistema em Java com OO (orientação a objetos), crie: 
//
//1. Uma classe Bolo que contenha os atributos: 
//
//sabor (chocolate, morango ou abacaxi) 
//valor (entre 30.00 e 50.00) 
//quantidadeVendida (até 100 por dia) 
//A classe deve conter os seguintes métodos: 
//
//comprarBolo: recebe a quantidade desejada do bolo, e exibe a frase 
//"Seu pedido ultrapassou nosso limite diário para esse bolo." caso a 
//quantidade seja maior que 100, caso contrário, a quantidade de bolos vendidos deve ser atualizada. 
//exibirRelatorio: exibe a frase "O bolo sabor X, foi comprado Y vezes hoje, totalizando R$ Z"
//2. Crie uma classe executável chamada App, que: 
//
//Crie 3 bolos, com preço e sabor de sua preferência, 
//Compre pelo menos 5 vezes qualquer um dos bolos, 
//Exiba o relatório de cada um dos bolos criados.