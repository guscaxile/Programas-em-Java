package com.mycompany.exercicioheranca;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    
    private List<VendedorComissao> vendedores;
    
    public Departamento(){
        
        vendedores = new ArrayList<>();
    }
    
    public void adicionarVendedor(VendedorComissao vendedor){
        
        this.vendedores.add(vendedor);
    }
    
    public Double calcularTotalSalario(){
        
        Double total = 0.0;
        
        for (VendedorComissao vendedor : vendedores) {
            
            total += vendedor.calcularSalario();
        }
        
        return total;
    }
    
    public void exibeTodos(){
        
        for(VendedorComissao vendedor : vendedores){
            
            System.out.println(vendedor);
        }
    }
    
    public void exibeSomenteVendedorComSalarioFixo(){
        
        System.out.println("Somente 'mais fixo'\n\n");
        
        for(VendedorComissao vendedor : vendedores){
            
            if(vendedor instanceof VendedorComissaoMaisFixo){
                
                System.out.println(vendedor);
            }
        }
    }
}
