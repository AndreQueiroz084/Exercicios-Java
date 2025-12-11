

import java.util.Scanner;

public class classifiqueTemperatura {
    
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite uma temperatura celsius: ");
        double temperatura = dados.nextDouble();

        if(temperatura < 15){
            System.out.println("Frio");
        } else if((temperatura >= 15) && (temperatura <= 25)){
            System.out.println("Agradavel");
        } else {
            System.out.println("Quente");
        }
    }
}
