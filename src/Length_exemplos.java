import java.util.Scanner;

public class Length_exemplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra para saber seu ultimo caracter: ");
        String texto = sc.nextLine();

        int posicao = -1;
        char ultimoCaracter = texto.charAt(texto.length() - 1);
        char ultimaVogal = ' ';

        for (int i = texto.length() - 1; i >= 0; i--) {
            char c =Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                posicao = i;
                ultimaVogal = texto.charAt(i);
                break;
            }
        }

        System.out.println("O último Caracter é a letra: " + ultimoCaracter);

        if (posicao != -1) {
            System.out.println("E a ultima vogal é a letra: " + ultimaVogal);
        } else {
            System.out.println("A String não tem vogal!");
        }
        sc.close();
    }
}
