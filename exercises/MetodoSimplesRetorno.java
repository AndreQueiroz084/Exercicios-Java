

import java.util.Scanner;

public class MetodoSimplesRetorno {

    public static double calcularArea(double altura, double largura) {
        return altura * largura;
    }
    public static void main(String[] args) {

    Scanner dados = new Scanner(System.in);

    // Vai pegar o valor da altura
    System.out.println("Digite a altura: ");
    double altura = dados.nextDouble();

    // Vai pegar o valor da largura
    System.out.println("Digite a largura: ");
    double largura = dados.nextDouble();

    // coloca o valor da função calcularArea para valor a operação fora do main
    double resultado = calcularArea(altura, largura);

    // A área do retângulo com largura 5.0 e altura 8.0 é 40.0
    System.out.println(String.format("A área do retângulo com largura %.1f e altura %.1f é %.1f",largura,altura,resultado));
        
    }
}
