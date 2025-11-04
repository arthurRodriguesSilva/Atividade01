import java.util.Scanner;
public class questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada inversa: ");
        int numero = sc.nextInt();

        System.out.println("=== TABUADA INVERSA DO " + numero + " ===");
        for(int i = 10; i > 0; i--){
            System.out.println(numero + " x " + (i) + " = " + (numero * i));
        }
        sc.close();

    }
}
