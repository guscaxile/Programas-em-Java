package com.mycompany.exercicioheranca;

public class VendedorComissaoMaisFixo extends VendedorComissao {

    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double salarioFixo, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public String toString() {
        return "VendedorComissaoMaisFixo{" + "salarioFixo=" + salarioFixo + '}';
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + salarioFixo;
    }
}
