import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        System.out.println("Qual seu nome?");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("olá, " + nome + "!");
    }

}
