import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de X: ");
        double x = scanner.nextDouble();

        System.out.print("Valor de Y: ");
        double y = scanner.nextDouble();

        CoordenadasCartesianas ponto = new CoordenadasCartesianas(x, y);

        System.out.println(ponto.getQuadrante());

        scanner.close();
    }
}

class CoordenadasCartesianas {
    private double x;
    private double y;

    public CoordenadasCartesianas(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getQuadrante() {
        if (x == 0 && y == 0) {
            return "Origem";
        } else if (x == 0) {
            return "Eixo Y";
        } else if (y == 0) {
            return "Eixo X";
        } else if (x > 0 && y > 0) {
            return "Q1";
        } else if (x < 0 && y > 0) {
            return "Q2";
        } else if (x < 0 && y < 0) {
            return "Q3";
        } else { // x > 0 e y < 0
            return "Q4";
        }
    }
}