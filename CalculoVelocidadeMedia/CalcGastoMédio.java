package CalculoVelocidadeMedia;
public class CalcGastoMédio {
    public static void main(String[] args)
    {  
        System.out.println("===Calculadora de Custo de Viagem===");
        int distanciaPiPf = 300;
        int tempoPiPf = 3;
        double consumoMedCarro = 10.8f;
        double preçoDaGaso = 5.50f;
        double custoPedagio = 52.5f;
        double gasoUsada = distanciaPiPf/consumoMedCarro;
        double custoGaso = gasoUsada*preçoDaGaso;
        double custoFinal = custoGaso+custoPedagio;
        System.out.println("Distancia Percorrida= "+ distanciaPiPf+" km/h");
        System.out.println("Tempo gasto= " + tempoPiPf + " horas");
        System.out.println("Custo final= " + custoFinal+ " reais");
    }
}


