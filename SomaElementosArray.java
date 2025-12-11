

public class SomaElementosArray {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        int soma = 0;

        System.out.printf("O array é [");
        for(int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
            System.out.printf("%d%s", numeros[i], (i < numeros.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        System.out.println(String.format("A soma de todos os elementos é: %d",soma));
    }
}
