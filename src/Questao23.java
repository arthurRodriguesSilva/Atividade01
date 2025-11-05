import java.util.Scanner;

public class Questao23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.println("Os primeiros " + N + " números da sequência de Fibonacci são:");

        for (int i = 1; i <= N; i++) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}
