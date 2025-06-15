import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as três distâncias:");

        double distancia1 = scanner.nextDouble();
        double distancia2 = scanner.nextDouble();
        double distancia3 = scanner.nextDouble();

        LancadorDardo lancador = new LancadorDardo(distancia1, distancia2, distancia3);

        System.out.println("MAIOR DISTANCIA = " + lancador.getMaiorDistancia());

        scanner.close();
    }
}

class LancadorDardo {
    private double d1;
    private double d2;
    private double d3;

    public LancadorDardo(double d1, double d2, double d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getMaiorDistancia() {
        double maior = Math.max(d1, d2);
        maior = Math.max(maior, d3);
        return maior;
    }
}