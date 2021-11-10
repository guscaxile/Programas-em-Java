package Lista01;

import java.util.Scanner;

public class CalculadoraSalario {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o seu salário: ");
        Double salario = leitor.nextDouble();
        
        System.out.println("Informe a porcentagem de imposto de renda que vai pagar: ");
        Double impostoRenda =  leitor.nextDouble();
        
        Double salarioLiquido = (salario * (impostoRenda / 100));
        Double totalSalario = salario - salarioLiquido;
        
        System.out.println(String.format("O seu salário líquido é de: R$ %.2f", totalSalario));
    }
}
