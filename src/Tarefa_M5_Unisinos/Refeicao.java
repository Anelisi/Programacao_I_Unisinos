package Tarefa_M5_Unisinos;

public class Refeicao {
    private String nome;
    private boolean alimentoFrio = true;
    private boolean alimentoLiquido = true;
    private int quantidade;
    private double valor;

    public Refeicao(String nome, boolean alimentoFrio, boolean alimentoLiquido, int porcao, double valor) {
        this.nome = nome;
        this.alimentoFrio = alimentoFrio;
        this.alimentoLiquido = alimentoLiquido;
        this.quantidade = porcao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}


