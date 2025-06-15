import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Dinheiro recebido: ");
        double recebido = scanner.nextDouble();

        Venda venda = new Venda(preco, quantidade, recebido);
        venda.imprimirResultado();

        scanner.close();
    }
}

class Venda {
    private double precoUnitario;
    private int quantidade;
    private double valorRecebido;

    public Venda(double precoUnitario, int quantidade, double valorRecebido) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.valorRecebido = valorRecebido;
    }

    public void imprimirResultado() {
        double total = precoUnitario * quantidade;
        if (valorRecebido >= total) {
            double troco = valorRecebido - total;
            System.out.printf("TROCO = %.2f\n", troco);
        } else {
            double falta = total - valorRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f\n", falta);
        }
    }
}
