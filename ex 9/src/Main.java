import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Codigo do produto comprado: ");
        int codigo = scanner.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        Lanchonete lanchonete = new Lanchonete(codigo, quantidade);

        System.out.println("Valor a pagar: R$ " + df.format(lanchonete.calcularValorTotal()));

        scanner.close();
    }
}

class Lanchonete {
    private int codigoProduto;
    private int quantidade;

    public Lanchonete(int codigoProduto, int quantidade) {
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
    }

    public double getPrecoPorCodigo() {
        switch (codigoProduto) {
            case 1:
                return 5.00;
            case 2:
                return 3.50;
            case 3:
                return 4.80;
            case 4:
                return 8.90;
            case 5:
                return 7.32;
            default:
                return 0.00; // Caso de código inválido
        }
    }

    public double calcularValorTotal() {
        double precoUnitario = getPrecoPorCodigo();
        return precoUnitario * quantidade;
    }
}