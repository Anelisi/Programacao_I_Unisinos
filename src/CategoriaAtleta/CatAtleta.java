package CategoriaAtleta;

public class CatAtleta {
    public static void main(String[] args) {
        Atleta a1 = new Atleta(25, 58.5f);

        a1.categoriaAtleta();
    }

    public static class Atleta {
        int idade;
        float peso;

        public Atleta(int idade, float peso) {
            this.idade = idade;
            this.peso = peso;
        }

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
    }
}

