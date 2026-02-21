import java.util.Scanner;

public class teste6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos números quer somar:");
        int vzs = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= vzs; i++) {
            System.out.println("Digite um número:");
            int numero = sc.nextInt();
            soma = soma + numero;
        }
        System.out.println("O resultado da soma é:" + soma);
        sc.close();
    }
}
