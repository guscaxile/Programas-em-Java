package Lista04;

public class TesteExercicio04 {

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    void aumentaTemperatura(Double temperaturaDigitada) {
        temperaturaAtual = temperaturaAtual + temperaturaDigitada;

        if (temperaturaAtual > temperaturaMax) {
            temperaturaMax = temperaturaAtual;
        }

        System.out.println("\n\n\n\n");
    }

    void diminuiTemperatura(Double temperaturaDigitada) {
        temperaturaAtual = temperaturaAtual - temperaturaDigitada;

        if (temperaturaAtual < temperaturaMin) {
            temperaturaMin = temperaturaAtual;
        }

        System.out.println("\n\n\n\n");
    }

    void exibeFahreinheit() {
        Double tempF = (temperaturaAtual * (9 / 5)) + 32;

        if (temperaturaAtual < temperaturaMin) {
            temperaturaMin = temperaturaAtual;
        }

        System.out.println("\n\nA temperatura atual em Fahreinheit é: " + tempF + "°F\n\n\n\n");
    }
}
