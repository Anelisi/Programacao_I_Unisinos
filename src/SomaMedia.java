import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1º número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite 2º número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite 3º número: ");
        int num3 = sc.nextInt();
        System.out.println("Digite 4º número: ");
        int num4 = sc.nextInt();
        System.out.println("Digite 5º número: ");
        int num5 = sc.nextInt();

        int soma = num1 + num2 + num3 + num4 + num5;
        System.out.println("A soma dos números informados é " + soma);

        double media = soma / 5;
        System.out.println("A média destes números é " + media);

    }
}
