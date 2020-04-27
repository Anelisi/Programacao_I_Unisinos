package Tarefa_Modulo_3;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 30);
        Pessoa p2 = new Pessoa("Ani", 33);

            if (p1.getIdade() > p2.getIdade()) {
                System.out.println("O mais velho é " + p1.getNome());
            } else {
                System.out.println("O mais velho é " + p2.getNome());
            }
            if (p1.getIdade() == p2.getIdade()) {
                System.out.println("Ambo tem a mesma idade");
            }
    }
}
