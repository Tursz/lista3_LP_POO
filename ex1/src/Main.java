import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota do primeiro semestre: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota do segundo semestre: ");
        double nota2 = scanner.nextDouble();

        AlunoNotas aluno = new AlunoNotas(nota1, nota2);
        aluno.exibirResultado();

        scanner.close();
    }
}

class AlunoNotas {
    private double nota1;
    private double nota2;

    public AlunoNotas(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularNotaFinal() {
        return nota1 + nota2;
    }

    public void exibirResultado() {
        double notaFinal = calcularNotaFinal();
        System.out.printf("Nota final: %.1f\n", notaFinal);

        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");
        }
    }
}