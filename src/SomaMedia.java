import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        float media = 0;
        for(int i=1; i<6; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int num = sc.nextInt();
            soma += num;
            media = soma / 5;
        }

        System.out.println("A soma dos números informados é " + soma);
        System.out.printf("%s %.2f", "A média destes números é ", media);

    }
}
