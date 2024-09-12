import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String senha = "coxinha123", tentativa;



        for (int i = 1; i <=5 ; i++) {
            System.out.println("Por gentileza insira um senha ");
            tentativa = leitura.nextLine();

           if (senha.equals(tentativa)){       //Anotar o equals plizi
              System.out.println("Senha correta");
              i = 6;
          } else {

              System.out.println("Senha Incorreta");

          }
        }
    }
}
