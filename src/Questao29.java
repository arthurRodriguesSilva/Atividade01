import java.util.Scanner;
public class Questao29 {
    public static void main(String[] args) {
        String senha;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        senha = sc.nextLine();

        if(senha.length() < 6){
            System.out.print("Senha inválida.");
        }else
            System.out.print("Senha cadastrada com sucesso.");


    }
}
