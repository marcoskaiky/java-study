import java.util.Scanner;
public class ex_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número e vamos ver se é primo ou NÃO");
        int number = sc.nextInt();
        if(meuPrimo(number)) { /* Verdadeiro */
            System.out.println(number + " é SIM!!!!!!!!!!!! número primo");
        }
        else{ /* Falso */
            System.out.println(number + " NÃO!!!!!!!! é número primo");
        }
    }
    static boolean meuPrimo(int num)    {
        if(num<=1)        {
            return false;
        }

        for(int i=2;i<=num/2;i++)        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
}
