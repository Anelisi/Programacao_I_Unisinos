package CategoriaAtleta;

public class Atleta {
    String nome;
    int idade;
    float peso;

    public void categoriaAtleta() {
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade < 17 && peso <= 50f) {
            System.out.println("Categoria Juvenil Leve");
        } else if (idade < 17 && peso > 50f) {
            System.out.println("Categoria Juvenil Pesado");
        } else if (idade < 25 && peso <= 60f) {
            System.out.println("Categoria Senior Leve");
        } else if (idade < 26 && peso > 60f) System.out.println("Categoria Senior Pesado");
        else {
            System.out.println("Categoria Veterano");
        }
    }
    public void exibeDados(){
        System.out.println("------------ DADOS DO ATLETA ------------");
        System.out.println("Nome:" + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Peso: " + this.getPeso());
        this.categoriaAtleta();
        System.out.println("-----------------------------------------");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
