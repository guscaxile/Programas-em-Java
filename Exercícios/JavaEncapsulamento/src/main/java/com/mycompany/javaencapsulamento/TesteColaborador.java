package com.mycompany.javaencapsulamento;

public class TesteColaborador {

    public static void main(String[] args) {

        Colaborador colaborador1 = new Colaborador("Gustavo Caxilé", "Engenheiro de Software", 8000.0);
        Colaborador colaborador2 = new Colaborador("Jon Ostermann", "Analista de Sistemas", 12_000.0);

        RecursosHumanos rh = new RecursosHumanos();

        System.out.println(colaborador1);
        System.out.println(colaborador2);

        rh.promoverColaborador(colaborador2, "Dev Senior", 10_000.0);
        rh.promoverColaborador(colaborador1, "Dev Especialista", 10_000.0);

        System.out.println(colaborador1);
        System.out.println(colaborador2);

        rh.reajustarSalario(colaborador1, 10.0);

        System.out.println(colaborador1);
    }
}
