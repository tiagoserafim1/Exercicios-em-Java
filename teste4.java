import java.util.Scanner;


public class teste4 {
    public static void main(String[] args) {
        System.out.println("Qual seu time? 1-Corinthians 2- Sao paulo 3-Palmeiras 4-Santos");
        Scanner scaneia = new Scanner(System.in);
        int time = scaneia.nextInt();

        if (time == 1) {
            System.out.println("vai Corinthians");
        }  else if (time == 2) {
            System.out.println("vai São Paulo");
        }  else if (time == 3) {
            System.out.println("vai Palmeiras");
        }  else if (time == 4) {
            System.out.println("vai Santos");
        }  else {
        System.out.println("Opcao invalida");
        }
        scaneia.close();
    }

}
