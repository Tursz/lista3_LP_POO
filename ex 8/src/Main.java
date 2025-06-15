import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
        String escalaEntrada = scanner.next().toUpperCase();

        System.out.print("Digite a temperatura em " + (escalaEntrada.equals("C") ? "Celsius" : "Fahrenheit") + ": ");
        double temperaturaEntrada = scanner.nextDouble();

        ConversorTemperatura conversor = new ConversorTemperatura(temperaturaEntrada, escalaEntrada);

        double temperaturaConvertida;
        String escalaSaida;

        if (escalaEntrada.equals("C")) {
            temperaturaConvertida = conversor.converterParaFahrenheit();
            escalaSaida = "Fahrenheit";
        } else {
            temperaturaConvertida = conversor.converterParaCelsius();
            escalaSaida = "Celsius";
        }

        System.out.println("Temperatura equivalente em " + escalaSaida + ": " + df.format(temperaturaConvertida));

        scanner.close();
    }
}

class ConversorTemperatura {
    private double temperatura;
    private String escalaOriginal;

    public ConversorTemperatura(double temperatura, String escalaOriginal) {
        this.temperatura = temperatura;
        this.escalaOriginal = escalaOriginal;
    }

    public double converterParaFahrenheit() {
        return temperatura * 9.0 / 5.0 + 32.0;
    }

    public double converterParaCelsius() {
        return (temperatura - 32.0) * 5.0 / 9.0;
    }
}