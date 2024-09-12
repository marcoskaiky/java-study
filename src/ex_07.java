import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Boa Noite, Insira um número para o fatorial");
        int num1, acumulador;
        num1 = leitura.nextInt();
        acumulador = num1;
        for (int i = num1 - 1;i >= 1 ; i--) {
            acumulador = acumulador * i;

        }
        System.out.println("O Fatorial foi: "+ acumulador);
    }

}
