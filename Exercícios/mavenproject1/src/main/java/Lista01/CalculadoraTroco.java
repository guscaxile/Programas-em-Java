
package Lista01;

import java.util.Scanner;

public class CalculadoraTroco {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor unitário do produto:");
        Double valorUnitario = leitor.nextDouble();
        
        System.out.println("Informe a quantidade vendida do produto:");
        Double totalProduto = leitor.nextDouble();
        
        System.out.println("Informe o valor pago pelo cliente:");
        Double valorPago = leitor.nextDouble();
        
        Double troco = valorPago - (valorUnitario * totalProduto);
        
        System.out.println(String.format("Seu troco será de R$ %.2f", troco));
    }
}

//Seja executável.
//Solicite o valor unitário de um produto.
//Solicite a quantidade vendida.
//Solicite o valor pago pelo cliente.
//Calcule e exiba o troco com a seguinte frase: "Seu troco será de R$ X", onde "X" é o valor a ser devolvido ao cliente.
