import java.util.Scanner;

public class teste8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        while (opc != 4) {
            System.out.println("""
                        Selecione a operação:
                        1 - Somar vários números
                        2 - Calcular fatorial
                        3 - Calcular média de vários números
                        4 - Sair
                    """);
            opc = sc.nextInt();
            if (opc == 1) {
                somarNumeros(sc);
            } else if (opc == 2) {
                fatorial(sc);
            } else if (opc == 3) {
                media(sc);
            } else if (opc == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida");
            }
        }
        sc.close();
    }

    static void somarNumeros(Scanner sc) {
        System.out.println("Digite a quantidade de numeros a serem somados:");
        int vzs = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= vzs; i++) {
            System.out.println("Digite um número:");
            int numero = sc.nextInt();
            soma = soma + numero;
        }
        System.out.println("O resultado da soma é:" + soma);
    }

    static void fatorial(Scanner sc) {
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
    }
    static void media(Scanner sc) {
        System.out.println("Digite a quantidade de numeros para a media:");
        int vzs = sc.nextInt();
        if (vzs <= 0) {
            System.out.println("Opção inválida");
            return;
        }
        int somadamedia = 0;
        for (int i = 1; i <= vzs; i++) {
            System.out.println("Digite um número:");
            int numero = sc.nextInt();
            somadamedia = somadamedia + numero;
        }
        double media = (double) somadamedia / vzs;
        System.out.println("A média é: " + media);
    }
}


