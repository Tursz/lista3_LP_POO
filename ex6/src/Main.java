import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double glicose = scanner.nextDouble();

        MedidorGlicose medidor = new MedidorGlicose(glicose);
        System.out.println("Classificacao: " + medidor.classificar());

        scanner.close();
    }
}

class MedidorGlicose {
    private double nivel;

    public MedidorGlicose(double nivel) {
        this.nivel = nivel;
    }

    public String classificar() {
        if (nivel <= 100.0) {
            return "normal";
        } else if (nivel <= 140.0) {
            return "elevado";
        } else {
            return "diabetes";
        }
    }
}
