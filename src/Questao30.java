import java.util.Scanner;

public class Questao30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja escrever? ");
        int tamanho = sc.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do vetor: ");
            numeros[i] = sc.nextInt();
        }
        int maiorNumero = numeros[0];
        int menorNumero = numeros[0];

        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }
        }
        System.out.println("O maior número do vetor é: " + maiorNumero + " e o menor é: " + menorNumero);
    }
}