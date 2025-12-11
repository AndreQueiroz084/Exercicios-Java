

import java.util.Scanner;

public class InversaoString {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.printf("Digite um nome: ");
        String palavra = dado.nextLine();

        String palavraInvertida = palavra;
        System.out.printf("Palavra original: %s\n",palavra);
        System.out.printf("Palavra invertida: ");

        for(int i = palavra.length() - 1; i >= 0; i--){
            System.out.printf("%s",palavraInvertida.charAt(i));
        }

    }
}
