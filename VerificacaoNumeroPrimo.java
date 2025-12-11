

import java.util.Scanner;

public class VerificacaoNumeroPrimo {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.printf("Digite um número inteiro: ");
        int numero = dado.nextInt();

        boolean ehPrimo = true;

        if(numero <= 1) {
            ehPrimo = false;
        } else {
            for(int i = 2; i < numero; i++) {
                if(numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if(ehPrimo) {
            System.out.println("O número " + numero + " é um número primo.");
        } else {
            System.out.println("O número " + numero + " NÃO é um número primo.");
        }
    }
}
