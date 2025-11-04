import java.util.Scanner;
import java.util.Random;
public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        int numero, sorteio;

        sorteio = gerador.nextInt(100)+1;

        boolean acertou = false;
        while(acertou != true){
            System.out.print("Digite o chute!");
            numero = sc.nextInt();

            if (numero == sorteio){
                System.out.print("Parabéns, você acertou! ");
                acertou = true;
            }else{
                System.out.println("Você errou, tente novamente!");
                if(sorteio > numero){
                    System.out.println("O número sorteado é maior.");
                }else{
                    System.out.println("O número sorteado é menor.");
                }
            }
        }
        sc.close();
    }
}
