package CalculadoraDeDescontos;

public class CalculadoraDescontos {
    System.out.println ("======================");
    Double precoProduto = 115.O;
    System.out.println("O preço do produto é " + Double precoProduto + " reais " );
    Double percentualDesconto = 10.0;
    System.out.println("O desconto será de" + percentualDesconto + "% ");
    Double desconto = precoProduto * percentualDesconto /100;
    double precoComDesconto = precoProduto - desconto;
    System.out.println ("Com desconto, o produto sai" + "por R$" + precoComDesconto + ".");
System.out.println("Fim!");
System.out.println ("===========================")


}
