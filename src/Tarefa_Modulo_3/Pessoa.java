package Tarefa_Modulo_3;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public void classificaPessoa (Pessoa p1, Pessoa p2)
    {
        if (p1.getIdade() > p2.getIdade()){
            System.out.println ("O mais velho é: "+ p1.getNome());
        }

        else if (p2.getIdade() > p1.getIdade()){
            System.out.println ("O mais velho é: "+ p2.getNome());

        } else System.out.println ("As duas pessoas tem a mesma idade");

    }
}



