import java.util.Scanner;
public class Questao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,contagem;

        System.out.print("Escreva o número para fazermos a contagem regressiva: ");
        numero = sc.nextInt();

        for(int i = numero; i >= 0; i--){
            System.out.println("Contagem regressiva em: " + i);
        }

    }
}
