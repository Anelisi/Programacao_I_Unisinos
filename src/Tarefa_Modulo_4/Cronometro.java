package Tarefa_Modulo_4;

public class Cronometro {
    public static void main(String[] args) {
        int hora = 0, min = 0, seg = 0, i = 0;

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
            System.out.printf("%02d:%02d:%02d\n", hora, min, seg);
        } while (hora < 24);
    }

}
