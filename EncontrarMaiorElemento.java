

import java.util.Scanner;

public class EncontrarMaiorElemento {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.printf(String.format("Quantos arrays vc que criar: "));
        int quantidade = numero.nextInt();

        int[] dados = new int[quantidade];
        int maiorValor = 0;

        for(int i = 0; i < quantidade; i++) {
            System.out.printf(String.format("Digite o numero da posição %d do array: ",i));
            dados[i] = numero.nextInt();
            if(maiorValor <= dados[i]){
                maiorValor = dados[i];
            } 
        }

        System.out.println("O maior valor no array é: " + maiorValor);

    }
}
