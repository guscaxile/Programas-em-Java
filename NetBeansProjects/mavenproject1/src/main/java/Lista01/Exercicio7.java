
package Lista01;

import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o seu salário bruto:");
        Double salarioBruto = leitor.nextDouble();
        
        Double inss = (salarioBruto * 0.1) / 100;
        Double ir = (salarioBruto  * 0.2) / 100;
        
        System.out.println("Informe a condução diária só ida:");
        Double conducaoDiaria = leitor.nextDouble();
        
        Double conducaoGasta = (conducaoDiaria * 2) * 22;
        
        Double salarioLiquido = salarioBruto - inss - ir - conducaoGasta;
        Double descontos = inss + ir + conducaoGasta;
        
        System.out.println(String.format("Seu salário bruto é R$ %.2f, tem um total de R$ %.2f em descontos e receberá um líquido de R$ %.2f", salarioBruto, descontos, salarioLiquido));
    }
}

//A classe deve ser executável
//O programa solicita o salário bruto
//O programa calcula o desconto do INSS, que é sempre de 10% sobre o bruto
//O programa calcula o desconto de IR, que é sempre de 20% sobre o bruto
//O programa pergunta quanto custa a condução diária só de ida da casa para o trabalho. 
//O desconto de VT é sempre o que o usuário gasta. Assim, calcula-se assim: Valor de condução ida x 2 x 22.
//Calcule o salário líquido, que é o bruto menos os descontos de INSS, IR e VT
//Exiba, usando interpolação e com os valores numéricos com 2 casas decimais, uma frase como esta: