import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int num;
        double resto;

        System.out.println("=== Verificador de número par e ímpar");
        System.out.print("Digite um número: ");
        num = leitura.nextInt();
        resto = num % 2;

        if (resto == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    leitura.close();
    }
}
