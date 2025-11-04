import java.util.Scanner;
public class Questao20 {
    public static void main(String[] args) {
        double cotacao, real, euro = 6.19, dolar = 5.39;
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o valor em reais: ");
        real = sc.nextDouble();

        System.out.print("Deseja saber o valor em dólar ou euro? (1 para Dólar e 2 para Euro)");
        cotacao = sc.nextDouble();

        if (cotacao == 1){
            System.out.print("Você tem " + real/dolar + " dólares.");
        }else if (cotacao == 2){
            System.out.print("Você tem " + real/euro + " euros.");
        }

    }
}
