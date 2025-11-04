import java.util.Scanner;
public class questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota100, nota50, nota20, nota10, nota5, quantidade;

        System.out.print("Digite o número: ");
        quantidade = sc.nextInt();

        nota100 = quantidade/100;
        quantidade = quantidade%100;

        nota50 = quantidade/50;
        quantidade = quantidade%50;

        nota20 = quantidade/20;
        quantidade = quantidade%20;

        nota10 = quantidade/10;
        quantidade = quantidade%10;

        nota5 = quantidade/5;
        quantidade = quantidade%5;

        System.out.print("Foram necessárias: " + nota100 + " notas de 100, " + nota50 + " notas de 50, " + nota20 + " notas de 20, " + nota10 + "notas de 10 e " + nota5 + "notas de 5." );



    }
}
