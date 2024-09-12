import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int op;
        double num1, resultado = 0;

        System.out.println("=== Calculadora de Temperatura ===");
        System.out.println("Selecione a temperatura: ");
        System.out.println("(1) C -> K , (2) C -> F , (3) K -> C, (4) K -> F,(5) F -> K, (6) F -> C");
        op = leitura.nextInt();

        System.out.println("Digite a tempertura a ser convertida: ");
        num1 = leitura.nextDouble();


        if (op == 1) {
            resultado = (num1 + 273.15);
        } else if (op == 2) {
            resultado = ((num1 * 9/5) + 32);
        } else if (op == 3) {
            resultado = (num1 - 273.15);
        } else if (op == 4) {
            resultado = ((num1 - 273.15) * 9/5 + 32) ;
        } else if (op == 5) {
            resultado = ((num1 - 32) * 5/9 + 273.15);
        } else if (op == 6) {
            resultado = ((num1 - 32) * 5/9);
        }

        System.out.println("Resultado: " + resultado);
        leitura.close();
    }
}


