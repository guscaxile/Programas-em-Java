package com.mycompany.javaencapsulamento;

public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer salariosReajustados;

    public RecursosHumanos() {

        this.salariosReajustados = 0;
        this.totalPromovidos = 0;
    }

    public void reajustarSalario(Colaborador colaborador, Double valorReajuste) {

        Double valorReajustado = (colaborador.getSalario() * valorReajuste) / 100;
        Double novoSalario = colaborador.getSalario() + valorReajustado;
        colaborador.setSalario(valorReajuste);
        this.salariosReajustados++;
    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {

        if (novoSalario > colaborador.getSalario()) {

            colaborador.setSalario(novoSalario);
            colaborador.setCargo(novoCargo);

            this.totalPromovidos++;
        } else {

            System.out.println("Opção Inválida.");
        }
    }

    public Integer getTotalPromovidos() {

        return totalPromovidos;
    }

    public Integer getSalariosReajustados() {

        return salariosReajustados;
    }

    @Override
    public String toString() {
        return String.format("\nRH----\nSalários reajustados: %d\nPromovidos: %d",
                this.salariosReajustados,
                this.totalPromovidos
        );
    }
}
