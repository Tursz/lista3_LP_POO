import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int a = scanner.nextInt();

        System.out.print("Segundo valor: ");
        int b = scanner.nextInt();

        System.out.print("Terceiro valor: ");
        int c = scanner.nextInt();

        MenorNumero menor = new MenorNumero(a, b, c);
        System.out.println("MENOR = " + menor.calcularMenor());

        scanner.close();
    }
}

class MenorNumero {
    private int n1, n2, n3;

    public MenorNumero(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int calcularMenor() {
        int menor = n1;

        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        return menor;
    }
}
