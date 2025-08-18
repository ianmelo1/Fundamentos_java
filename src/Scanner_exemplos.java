import java.util.Scanner;

public class Scanner_exemplos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int num = sc.nextInt();

    System.out.print("Digite um numero com vírgula: ");
    Double numDouble = sc.nextDouble();

    sc.nextLine();

    System.out.print("Digite um nome composto: ");
    String nome = sc.nextLine();

    System.out.println("O número inteiro que você digitou foi: " + num );
    System.out.println("O número de ponto flutuante que você digitou foi: " + numDouble);
    System.out.println("O nome composto que você digitou foi: " + nome);

    sc.close();

    }
}
