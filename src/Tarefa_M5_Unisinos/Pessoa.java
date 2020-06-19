package Tarefa_M5_Unisinos;

public abstract class Pessoa {
    private String nome;
    private String endereço;
    private String bairro;
    private int idade;
    private String telefone;

    public Pessoa(String nome, String endereço, String bairro, int idade, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.bairro = bairro;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

