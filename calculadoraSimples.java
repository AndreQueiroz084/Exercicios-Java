

import java.util.Scanner;

public class calculadoraSimples {
    
    public static void main(String[] args){
        // Você precisa instanciar a classe Scanner, passando o fluxo de entrada padrão (System.in) como argumento. Isso conecta o Scanner ao teclado.
        Scanner dados = new Scanner(System.in);

        // Printa na tela uma mensagem
        System.out.println("Digiteum numero: ");
        double primeiroNumero = dados.nextDouble(); // Aqui diz o tipo, e colocar um valor double na (Scanner dados)

        System.out.println("Digite outro número: ");
        double segundoNumero = dados.nextDouble();

        System.out.println("qual das Operações vc quer fazer: ");
        String entradachar = dados.next(); // Pega uma String
        char operador = entradachar.charAt(0); // Pega somente a posição 0 da String

        switch (operador) {
            case '+':
                double soma = primeiroNumero + segundoNumero;
                System.out.println("A soma de " + primeiroNumero +" mais " + segundoNumero + " é igual á " + soma);
                
                break;
            case '-':
                double subtracao = primeiroNumero - segundoNumero;
                System.out.println("A soma de " + primeiroNumero +" menos " + segundoNumero + " é igual á " + subtracao);
                
                break;
            case '*':
                double multipicacao = primeiroNumero * segundoNumero;
                System.out.println("A soma de " + primeiroNumero +" mais " + segundoNumero + " é igual á " + multipicacao);
                
                break;
            case '/':
                if((primeiroNumero != 0) && (segundoNumero != 0)){
                    double dividir = primeiroNumero / segundoNumero;
                    System.out.println("A soma de " + primeiroNumero +" mais " + segundoNumero + " é igual á " + dividir);
                } else {
                    System.out.println("O número não pode ser Dividido por 0, tente novamente!");
                }
                
                break;
        
            default:
                System.out.println("Algo deu errado por fazer tente novamente.");
                break;
        }

    }
}
