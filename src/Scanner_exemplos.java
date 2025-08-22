import java.util.Scanner;

public class Scanner_exemplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
        System.out.print("Digite um número inteiro, um número com virgula e um nome composto em série: ");
        String texto= sc.nextLine();

        String[] partes = texto.split(" ");

        int numInt = Integer.parseInt(partes[0]);

        double numDecimal = Double.parseDouble(partes[1].replace(",", "."));

=======
    System.out.print("Digite um número inteiro, um número com virgula e um nome composto em série: ");
    String texto= sc.nextLine();

        String[] partes = texto.split(" ");
        
        int numInt = Integer.parseInt(partes[0]);
      
        double numDecimal = Double.parseDouble(partes[1].replace(",", "."));
        
>>>>>>> 4534f1bbebc700316936ef64eb813c22ca11762d
        String nome = "";
        for(int i = 2; i < partes.length; i++){
            nome += partes[i];
            if(i < partes.length - 1) nome += " ";
        }
<<<<<<< HEAD
=======
        
        System.out.println("Número inteiro: " + numInt);
        System.out.println("Número decimal: " + numDecimal);
        System.out.println("Nome composto: " + nome);
>>>>>>> 4534f1bbebc700316936ef64eb813c22ca11762d

        System.out.println("Número inteiro: " + numInt);
        System.out.println("Número decimal: " + numDecimal);
        System.out.println("Nome composto: " + nome);

        sc.close();

    }
}