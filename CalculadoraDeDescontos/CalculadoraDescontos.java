package CalculadoraDeDescontos;

public class CalculadoraDescontos {
    public void calcula20() {
    double precoProduto;
    precoProduto = 200;
    int desconto = 20;
    double precoComDesconto = precoProduto - (precoProduto*desconto/100);
    System.out.println ("O valor do produto com desconto é " + precoComDesconto + " Reais");
}
public void calcula30() {
    double precoProduto;
    precoProduto = 200;
    int desconto = 30;
    double precoComDesconto = precoProduto - (precoProduto*desconto/100);
    System.out.println ("O valor do produto com desconto é " + precoComDesconto + " Reais");
    
    
}
}
