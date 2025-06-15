import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = scanner.nextDouble();

        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(a, b, c);
        equacao.resolver();

        scanner.close();
    }
}

class EquacaoSegundoGrau {
    private final double a, b, c;
    private double delta;
    private double x1, x2;
    private boolean temRaizesReais;

    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void resolver() {
        if (a == 0) {
            System.out.println("Nao e uma equacao do segundo grau.");
            return;
        }

        calcularDelta();

        if (!temRaizesReais) {
            System.out.println("A equacao nao possui raizes reais.");
            return;
        }

        calcularRaizes();
        exibirRaizes();
    }

    private void calcularDelta() {
        delta = Math.pow(b, 2) - 4 * a * c;
        temRaizesReais = delta >= 0;
    }

    private void calcularRaizes() {
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
    }

    private void exibirRaizes() {
        System.out.printf("X1 = %.4f\n", x1);
        System.out.printf("X2 = %.4f\n", x2);
    }
}