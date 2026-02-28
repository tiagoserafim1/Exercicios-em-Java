import java.util.Scanner;

public class Teste3mod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da tabuada que deseja:");
        int n = sc.nextInt();
        System.out.println("Digite até quando deseja repetir:");
        int x = sc.nextInt();
        if(x<=0){
            System.out.println("Número invalido");
        } else {
        for (int i = 1; i <= x; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
        sc.close();
}

}
