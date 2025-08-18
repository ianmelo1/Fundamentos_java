import java.util.Scanner;

public class Strings_exemplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = sc.nextLine();

        // 1. Normaliza: minúsculas e remove caracteres especiais
        String textoLowerE = texto.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // 2. Verificação comparando extremos
        boolean ehPalindromo = true; // assume que é palíndromo

        int inicio = 0;
        int fim = textoLowerE.length() - 1;

        while (inicio < fim) {
            if (textoLowerE.charAt(inicio) != textoLowerE.charAt(fim)) {
                ehPalindromo = false;
                break; // sai na primeira diferença
            }
            inicio++;
            fim--;
        }

        // 3. Saída
        if (ehPalindromo) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo!");
        }

        sc.close();
    }
}
