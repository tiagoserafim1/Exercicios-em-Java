import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        System.out.println("Qual sua idade?");
        Scanner sca = new Scanner(System.in);
        int idade = sca.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade, pode passar");
        } else {
            System.out.println("Menor de idade, não pode passar");
        }

        sca.close();
    }
}

