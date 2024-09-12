import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int op;
        double num1, num2, resultado = 0;

        System.out.println("=== Calculadora Simples ===");
        System.out.println("Selecione o operador: ");
        System.out.println("(1) Adição , (2) Subtração , (3) Multiplicação , (4) Divisão");
        op = leitura.nextInt();

        System.out.println("Digite o primeiro número: ");
        num1 = leitura.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = leitura.nextDouble();

        if (op == 1) {
            resultado = num1 + num2;
        } else if (op == 2) {
            resultado = num1 - num2;
        } else if (op == 3) {
            resultado = num1 * num2;
        } else if (op == 4) {
            resultado = num1 / num2;
        }

        System.out.println("Resultado: " + resultado);
        leitura.close();
    }
}
