import java.util.Scanner;

public class Strings_exemplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = sc.nextLine();


        String textoLowerE = texto.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");


        boolean ehPalindromo = true;

        int inicio = 0;
        int fim = textoLowerE.length() - 1;

        while (inicio < fim) {
            if (textoLowerE.charAt(inicio) != textoLowerE.charAt(fim)) {
                ehPalindromo = false;
                break;
            }
            inicio++;
            fim--;
        }

        if (ehPalindromo) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo!");
        }

        sc.close();
    }
}
