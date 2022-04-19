package com.mycompany.exercicioheranca;

public class App {
    
    public static void main(String[] args) {
        
        VendedorComissao vc1 = new VendedorComissao(111, "Gustavo", 1000.0, 10.0);
        
        VendedorComissaoMaisFixo vcm1 = new VendedorComissaoMaisFixo(222, "Flávio", 200.0, 10.0, 1000.0);
        
        System.out.println(vc1);
        System.out.println("-".repeat(15));
        System.out.println(vcm1);
        
//        VendedorComissao teste = new VendedorComissaoMaisFixo(333, "TESTE", 300.0, 20.0, 1000.0);
        
        Departamento dep = new Departamento();
        
        dep.adicionarVendedor(vc1);
        dep.adicionarVendedor(vcm1);
        
        System.out.println("Total a ser pago: " + dep.calcularTotalSalario());
    }
}
