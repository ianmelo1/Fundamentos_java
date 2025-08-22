package elevadorzin;

public class Main {
    public static void main(String[] args){
        Elevador elevador = new Elevador(5, 10);


        elevador.entrar(3);
        elevador.sair(4);
        elevador.subir(3);
        elevador.descer(2);
        elevador.subir(8);
        elevador.entrar(20);

    }
}
