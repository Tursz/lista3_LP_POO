import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutosUsados = scanner.nextInt();

        PlanoTelefonia plano = new PlanoTelefonia(minutosUsados);
        System.out.printf("Valor a pagar: R$ %.2f\n", plano.calcularValor());

        scanner.close();
    }
}

class PlanoTelefonia {
    private int minutos;
    private final double valorBase = 50.00;
    private final int franquia = 100;
    private final double custoExcedente = 2.00;

    public PlanoTelefonia(int minutos) {
        this.minutos = minutos;
    }

    public double calcularValor() {
        if (minutos <= franquia) {
            return valorBase;
        } else {
            int excedente = minutos - franquia;
            return valorBase + (excedente * custoExcedente);
        }
    }
}
