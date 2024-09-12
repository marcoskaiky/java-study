import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("=== Média de Notas ===");
        System.out.print("Insira a primeira nota: ");
        nota1 = leitura.nextDouble();
        System.out.print("Insira a segunda nota: ");
        nota2 = leitura.nextDouble();
        System.out.print("Insira a terceira nota: ");
        nota3 = leitura.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aluno aprovado! Média: " + media);
        } else {
            System.out.println("Aluno reprovado! Média: " + media);
        }
    }
}
