package VelocidadeMedia;

public class VelocidadeMedia {
    public static void main(String[] args) {
    System.out.println("Calculadora de Velocidade Maxima");
    int distanciaPercorrida = 150;
    //obter distancia percorrida pelo usuario
    int tempoGasto = 2;
    /*obter tempo gasto pelo usuario*/
    float velocidadeMedia = distanciaPercorrida/tempoGasto;
    //calcular velocidade media
    System.out.println("A velocidade maxima foi de:");
    System.out.println(velocidadeMedia+"km/h");
    //Mostrar a velocidade Média
    }
}