package elevadorzin;
public class Elevador {
    private int andarAtual = 0;
    private int capacidadeMax;
    private int qntdPessoas = 0;
    private int totalAndares;
    public Elevador(int capacidadeMax, int totalAndares){
        this.capacidadeMax = capacidadeMax;
        this.totalAndares = totalAndares;
    }

    public void entrar(int qtd){
        if (qtd + qntdPessoas <= capacidadeMax){
            qntdPessoas += qtd;
            System.out.println(qtd + " Pessoas entraram no elevador, agora tem " + qntdPessoas + " Pessoa(s)");
        } else {
            qntdPessoas += qtd;
            System.out.println("Capacidade máxima atingida, o elevador caiu pq tinham " + qntdPessoas + " Pessoas dentro do elevador.");
        }
    }

    public void sair(int qtd){
        if  (qntdPessoas - qtd > 0){
            qntdPessoas -= qtd;
            System.out.println(qtd + " Pessoas sairam do elevador, agora tem " + qntdPessoas + " Pessoa(s)");
        } else if (qntdPessoas - qtd == 0) {
            qntdPessoas -= qtd;
            System.out.println(qtd + " Pessoas sairam do elevador, agora tem " + qntdPessoas + " Pessoa(s)");
        } else {
            int fantasmas = qntdPessoas - qtd;
            fantasmas *= -1;
            qntdPessoas = 0;
            System.out.println(qtd + " Pessoas saíram, e " + fantasmas + " Fantasma(s) Saíram logo em seguida \uD83D\uDC7B");
        }
    }

    public void subir(int qtd){
        if (andarAtual + qtd <= totalAndares){
            andarAtual += qtd;
            System.out.println("O elevador subiu para o andar: " + andarAtual);
        } else {
            System.out.println("Ja ta no ultimo andar bocó.");
        }
    }

    public void descer(int qtd){
        if (andarAtual - qtd > 0){
            andarAtual -= qtd;
            System.out.println("O elevador desceu para o andar: " + andarAtual);
        } else {
            System.out.println("O elevador parou no Térreo, não pode mais descer. ");
        }
    }


}





