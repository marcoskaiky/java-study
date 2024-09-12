import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
    double num1 , media , somador=0 , par=0 ;

        for (int i = 1; i <= 20 ; i++) {
            System.out.println("Insira o "+ i + " número");
            num1 = leitura.nextDouble();
            if (num1 % 2 == 0) {
                par = par + 1;
                somador = somador + num1;
            }

    }
        media = somador / par;
        System.out.println("A média dos números pares foi "+ media);
}}
