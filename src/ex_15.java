import java.util.Scanner;

public class ex_15 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num, positivo = 0, negativo = 0, zero = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um número: ");
            num = leitura.nextInt();

            if (num > 0) {
                positivo = positivo + 1;
            } else if (num < 0) {
                negativo = negativo + 1;
            } else {
                zero = zero + 1;
            }
        }
        System.out.println("Números positivos: " + positivo);
        System.out.println("Números negativos: " + negativo);
        System.out.println("Zeros: " + zero);
    }
}
