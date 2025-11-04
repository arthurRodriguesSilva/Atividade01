import java.util.Scanner;
public class questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, contadorPar = 0, contadorImpar = 0;

        System.out.print("Digite o número: ");
        numero = sc.nextInt();
        for(int i = 1;i <= numero; i++){
            if (i%2==0){
                contadorPar++;
            }
            else{
                contadorImpar++;
            }
        }
        System.out.print("Temos " + contadorPar + " números pares e " + contadorImpar+ " números ímpares.");
    }
}
