import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;
        System.out.println("Insira um número ai parça");
        numero = leitura.nextInt();
        for (int i = 1; i <=numero ; i++) {
            if (i % 3==0 && i % 5==0){
                System.out.println(i);
            }

        }
    }
}
