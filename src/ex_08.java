import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int num, maior = 0, menor = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Insira o " + i + "º número: ");
            num = leitura.nextInt();

            if (i == 1) {
                maior = num;
                menor = num;
            } else {

                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        }
        System.out.println("O maior número foi: " + maior);
        System.out.println("O menor número foi: " + menor);
    }
}
