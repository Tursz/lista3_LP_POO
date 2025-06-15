import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = scanner.nextInt();

        System.out.print("Hora final: ");
        int horaFinal = scanner.nextInt();

        CalculadorDuracaoJogo duracaoJogo = new CalculadorDuracaoJogo(horaInicial, horaFinal);

        System.out.println("O JOGO DUROU " + duracaoJogo.getDuracaoEmHoras() + " HORA(S)");

        scanner.close();
    }
}

class CalculadorDuracaoJogo {
    private int horaInicial;
    private int horaFinal;
    private int duracaoEmHoras;

    public CalculadorDuracaoJogo(int horaInicial, int horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        calcularDuracao();
    }

    private void calcularDuracao() {
        if (horaFinal > horaInicial) {
            duracaoEmHoras = horaFinal - horaInicial;
        } else {
            duracaoEmHoras = (24 - horaInicial) + horaFinal;
        }
    }

    public int getDuracaoEmHoras() {
        return duracaoEmHoras;
    }
}