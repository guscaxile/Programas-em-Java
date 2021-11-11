package com.mycompany.exercicioheranca;

public class VendedorComissao {

    private Integer codigo;
    private String nome;
    private Double vendas;
    private Double taxa;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double calcularSalario() {

        return this.vendas * (this.taxa / 100);
    }

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public String toString() {

        String texto = "\nCódigo: %d\nNome: %s\nTotal vendido: R$%.2f"
                + "\nTaxa: %d\nTotal a receber: R$%2.f";

        return "VendedorComissao{" + "codigo=" + codigo + ", nome=" + nome + ", vendas=" + vendas + ", taxa=" + taxa + '}';
    }
}
