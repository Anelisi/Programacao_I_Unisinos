package CategoriaAtleta;

import java.util.Scanner;

public class CatAtleta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atleta a1 = new Atleta();

        System.out.println("Digite o nome do Atleta: ");
        String nome = sc.nextLine();
        a1.setNome(nome);
        System.out.println("Informe o peso do Atleta: ");
        float peso = sc.nextFloat();
        a1.setPeso(peso);
        System.out.println("Informe a idade do Atleta: ");
        int idade = sc.nextInt();
        a1.setIdade(idade);
        a1.exibeDados();
    }

}


