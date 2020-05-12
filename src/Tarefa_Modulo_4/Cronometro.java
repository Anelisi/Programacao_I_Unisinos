package Tarefa_Modulo_4;

import java.util.Scanner;

public class Cronometro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = 0, min = 0, seg = 0, i = 0;

        System.out.println("Digite em quantos minutos o cronômetro deverá finalizar a contagem: ");
        int c = sc.nextInt();

        System.out.println("==================   INÍCIO    ================== ");
        System.out.println("================== CRONÔMETRO  ================== ");

        do {

            i++;
            seg = i % 60;
            min = i / 60;
            hora = min / 60;

            min %= 60;

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.printf("                    %02d:%02d:%02d\n", hora, min, seg);
        } while (min < c);

        System.out.println("==================    FIM      ================== ");
        System.out.println ("================== CRONÔMETRO  ================== ");
    }

}
