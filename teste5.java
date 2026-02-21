
import java.util.Scanner;

public class teste5 {
    public static void main(String[] args) {
        System.out.println("Digite o número que deseja calcular o fatorial:");
        Scanner sc = new Scanner(System.in);
        int fato = sc.nextInt();
        if (fato < 0) {
            System.out.println("Número inválido");
        } else{
           long multiplo = 1;
            for (int i = 1; i <= fato; i++) {
                multiplo = multiplo * i;
            }
            System.out.println("O fatorial de " + fato + " é " + multiplo);
        }

        sc.close();
    }
}
