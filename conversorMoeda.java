

import java.util.Locale;
import java.util.Scanner;

public class conversorMoeda {
    public static void main(String[] args) {
        // 🚨 CORREÇÃO: Força o Scanner a usar o padrão do Brasil (vírgula como decimal)
        Scanner dados = new Scanner(System.in).useLocale(new Locale("pt", "BR"));;

        // Scanner dados = new Scanner(System.in).useLocale(Locale.US);
        // Quando eu for digitar (com ponto) tipo: 250.50

        System.out.println("Digite o valor em real que  vc quer converter: ");
        double real = dados.nextDouble(); // Pegar o valo em real

        // Valor de 1 dolar em real.
        final double DOLAR_EM_REAL = 5.32; // Melhor Prática: Constante em maiúsculas com 'final'

        // Converte o valor em real para Dolar
        double dolar = real / DOLAR_EM_REAL;

        System.out.println(String.format("R$%.2f convertendo para dolar é U$%.2f.",real,dolar));

        // Fechar o Scanner para liberar recurso
        dados.close();

    }
}
