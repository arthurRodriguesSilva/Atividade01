import java.util.Scanner;
public class questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean numeroPrimo = true;

        System.out.print("Digite o número: ");
        numero = sc.nextInt();

        if (numero <= 1){
            System.out.print("Número não é primo.");
        }else if (numero == 2){
            System.out.print("Número é primo.");
        }else if (numero %2 == 0){
            System.out.print("Número não é primo.");
        }else {
            int limite = (int) Math.sqrt(numero);

            for(int i = 3;i <= limite; i += 2) {

                if(numero %i == 0){
                    numeroPrimo = false;
                    break;
                }
            }
        }
        if(numeroPrimo){
            System.out.print("Número é primo.");
        }else{
            System.out.print("Número não é primo.");
        }
        sc.close();
    }
}
