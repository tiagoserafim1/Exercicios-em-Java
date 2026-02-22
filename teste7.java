import java.util.Scanner;

public class teste7 {
    public static void main(String[] args) {
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        while (opc != 3) {
            System.out.println("""
                    Selecione a operação:
                    1 - Somar vários números
                    2 - Calcular fatorial
                    3 - Sair""");
            opc = sc.nextInt();
            if (opc == 1) {
                System.out.println("Digite a quantidade de numeros a serem somados:");
                int vzs = sc.nextInt();
                int soma = 0;
                for (int i = 1; i <= vzs; i++) {
                    System.out.println("Digite um número:");
                    int numero = sc.nextInt();
                    soma = soma + numero;
                }
                System.out.println("O resultado da soma é:" + soma);

            } else if (opc == 2) {
                System.out.println("Digite um valor:");
                int fato = sc.nextInt();
                if (fato < 0) {
                    System.out.println("Número inválido");
                } else {
                    long multiplo = 1;
                    for (int i = 1; i <= fato; i++) {
                        multiplo = multiplo * i;
                    }
                    System.out.println("O fatorial de " + fato + " é " + multiplo);
            }
            } else if (opc == 3) {
                System.out.println("Saindo...");
        } else {
                System.out.println("opcao invalida");
            }
        }
        sc.close();
    }
}

