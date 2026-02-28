import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        System.out.println("Digite o número da tabuada que deseja:");
        System.out.println("Digite até quando deseja repetir:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++)  {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}

