import java.util.Scanner;

public class Scanner_exemplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro, um número com virgula e um nome composto em série: ");
        String texto= sc.nextLine();

        String[] partes = texto.split(" ");

        int numInt = Integer.parseInt(partes[0]);

        double numDecimal = Double.parseDouble(partes[1].replace(",", "."));

        String nome = "";
        for(int i = 2; i < partes.length; i++){
            nome += partes[i];
            if(i < partes.length - 1) nome += " ";
        }

        System.out.println("Número inteiro: " + numInt);
        System.out.println("Número decimal: " + numDecimal);
        System.out.println("Nome composto: " + nome);

        sc.close();

    }
}