import java.util.Scanner;
public class Questao25 {
    public static void main(String[] args) {
        int numero, soma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        for(int i = 0; i < numero; i++){
            if (i %2 == 0){
                soma += i;
            }
        }
        System.out.print("A soma dos números pares de 0 até " + numero+ " é: " +soma);
        sc.close();



    }
}
