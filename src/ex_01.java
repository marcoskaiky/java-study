import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner Teste = new Scanner(System.in);
        int soma = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i  + "º número: ");
            int numero = Teste.nextInt();
            soma += numero;
        }


        Teste.close();


        System.out.println("A soma dos números é: " + soma);
    }

}
