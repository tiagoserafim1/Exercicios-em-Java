public class teste10 {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        p1.vida = 100;
        p1.nome = "Goku";
        Personagem p2 = new Personagem();
        p2.vida = 100;
        p2.nome = "Vegeta";
        Boss p3 = new Boss();
        p3.vida = 500;
        p3.nome = "Freeza";
        System.out.println(p1.nome + " tem " + p1.vida + " de vida.");
        System.out.println(p2.nome + " tem " + p2.vida + " de vida.");
        }
    }
