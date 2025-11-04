import java.util.Scanner;
public class Questao21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int potencia, numero, resultado = 1;


        System.out.print("Digite o número:");
        numero = sc.nextInt();

        System.out.print("Digite a potência: ");
        potencia = sc.nextInt();

        for(int i = 0; i < potencia; i++){
            resultado *= numero;
        }
        System.out.print("O resultado é: " + resultado);

    }



}
