import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o salario da pessoa: ");
        double salarioAtual = scanner.nextDouble();

        CalculadorAumento salarios = new CalculadorAumento(salarioAtual);

        System.out.println("Novo salario R$ " + df.format(salarios.getNovoSalario()));
        System.out.println("Aumento R$ " + df.format(salarios.getValorAumento()));
        System.out.println("Porcentagem = " + df.format(salarios.getPorcentagemAumento()) + "%");

        scanner.close();
    }
}

class CalculadorAumento {
    private double salarioAtual;
    private double novoSalario;
    private double valorAumento;
    private double porcentagemAumento;

    public CalculadorAumento(double salarioAtual) {
        this.salarioAtual = salarioAtual;
        calcularAumento();
    }

    private void calcularAumento() {
        if (salarioAtual <= 1000.00) {
            porcentagemAumento = 20.0;
        } else if (salarioAtual <= 3000.00) {
            porcentagemAumento = 15.0;
        } else if (salarioAtual <= 8000.00) {
            porcentagemAumento = 10.0;
        } else {
            porcentagemAumento = 5.0;
        }

        valorAumento = salarioAtual * (porcentagemAumento / 100.0);
        novoSalario = salarioAtual + valorAumento;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public double getValorAumento() {
        return valorAumento;
    }

    public double getPorcentagemAumento() {
        return porcentagemAumento;
    }
}