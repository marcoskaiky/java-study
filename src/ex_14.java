import java.util.Scanner;

public class ex_14 {
    public static void main(String[] args) {
        int idade;

        Scanner leitura = new Scanner(System.in);
        do {
            System.out.println("Digite sua idade");
            idade = leitura.nextInt();
            if (idade >0 && idade <120){
                System.out.println("Idade Valida");
            } else {
                System.out.println("idade invalida");
            }
        }while (idade < 0 || idade > 120);
    }
}
