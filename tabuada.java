

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite um numero que você queira saber a tabuada: ");
        int numero = dados.nextInt();

        for(int i = 1; i <= 10; i++){
            int soma = numero * i;
            // Usando o String.format() podemos fazer que né o "C" faz.     
            System.out.println(String.format("%d x %d = %d",numero,i,soma));
            // System.out.println(numero + " x " + i + " = " + soma);
        }


    }
}
