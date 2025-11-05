import java.util.Scanner;
public class Questao27 {
    public static void main(String[] args) {
        int numero, soma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número para verificar se é perfeito: ");
        numero = sc.nextInt();

        for(int i = 1; i <= numero/2 ; i++){
            if(numero % i == 0) {
                soma += i;
            }
        }if (soma == numero){
            System.out.print("O número é perfeito.");
        }else
            System.out.print("O número não é perfeito.");
    }
}
