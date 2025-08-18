
import java.util.Scanner;

public class Strings_Manipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma String para invertela: ");
        String texto = sc.nextLine();

        char[] charArray = texto.toCharArray();

        int inicio = 0;
        int fim = charArray.length - 1;

        while (inicio <= fim) {
            char temp = charArray[inicio];
            charArray[inicio] = charArray[fim];
            charArray[fim] = temp;

            inicio++;
            fim--;
        }

        String invertida = String.valueOf(charArray);

        System.out.println("String invertida: " + invertida);

        sc.close();

    }
}

