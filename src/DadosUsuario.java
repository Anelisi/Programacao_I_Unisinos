
import java.util.Scanner;

public class DadosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá, " + nome + "! Digite, por gentileza, a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Ótimo, " + idade + " anos! Agora, " + nome + ", nos informe qual a sua altura: ");
        float altura = sc.nextFloat();

        System.out.println("Conferindo as informações, você, " + nome + " tem " + idade + " anos de idade e " + altura + " de altura. Muito obrigada pelas informações!");

        System.out.println(nome + ", digite a sua data de nascimento começando pelo dia(ENTER), mês(ENTER) e por fim o ano(ENTER):");
        short diaNasc = sc.nextShort();
        short mesNasc = sc.nextShort();
        int anoNasc = sc.nextInt();
        String dataNasc = (diaNasc + "/" + mesNasc + "/" + anoNasc);
        System.out.println("\nSua data de nascimento é " + dataNasc);

        Scanner scan = new Scanner(System.in);
        System.out.println("\nPassaremos às informações residenciais ");

        System.out.println("\nNos informe o nome da sua rua seguida do nº da sua casa/apto: ");
        String end = scan.nextLine();

        System.out.println("Certo! " + end + ". Fica em qual bairo, mesmo?! ");
        String bairro = scan.nextLine();

        System.out.println("Entendi! E qual é o CEP de lá?! ");
        String cep = scan.nextLine();

        System.out.println("Seu e-mail, por favor! ");
        String email = scan.nextLine();

        System.out.println("Perfeito! Apenas confirmando seus dados");
        System.out.println("Nome: " + nome);
        System.out.println("Você nasceu dia: " + dataNasc + "  e tem " + idade + "anos de idade");
        System.out.println("Mora na Rua " + end + " no bairro " + bairro + " - CEP: " + cep);
        System.out.println("Email: " + email);


        sc.close();
        scan.close();
    }
}

