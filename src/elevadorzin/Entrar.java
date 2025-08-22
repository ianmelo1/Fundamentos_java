package elevadorzin;

public class Entrar {
    public static void main(String[] args){
        Elevador elevador = new Elevador(5, 10);


        elevador.entrar(3);
        elevador.sair(4);
        elevador.entrar(20);

    }
}
