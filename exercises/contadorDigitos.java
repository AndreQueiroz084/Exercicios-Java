

import java.util.Scanner;

public class contadorDigitos {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("digite um valor: ");
        int numero = dados.nextInt();

        int numeroImprimir = numero;

        int contador = 0;

        while (numero > 0) {
            contador++;
            numero = numero / 10;
        }

        System.out.println(String.format("O número %d possui %d Dígitos.",numeroImprimir,contador));
    }
}
