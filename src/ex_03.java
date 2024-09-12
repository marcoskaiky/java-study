import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);

        System.out.println("digite um número para a tablations(tabuada)");
        int number = Leia.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
        Leia.close();
    }
}
