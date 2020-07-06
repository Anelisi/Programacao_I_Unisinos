package Tarefa_M5_Unisinos;

import java.util.Calendar;

public class Bistro {
    Calendar hoje = Calendar.getInstance();
    int hora = hoje.get(Calendar.HOUR_OF_DAY);
    private String nomeBistro;
    Refeicao[] refeicao = new Refeicao[4];
    public String servico;
    Comanda comanda = new Comanda();
    private double entradaDinheiro;


    public Bistro(String nomeBistro) {
        this.nomeBistro = nomeBistro;
    }

    public void menu(){
        if (hora < 7 || hora > 23){
            System.out.println("************** FECHADO **************\n Horário de atendimento é das 7h às 23h\n *********** Volte Sempre! ***********");
        }
        else if (hora < 11){
            this.servico = "Café da Manhã";
            refeicao[0] = new Refeicao ("Café", false, true, 1,1.50);
            refeicao[1] = new Refeicao("Frutas", true, false, 3, 2.50);
            refeicao[2] = new Refeicao("Torrada", false, false, 1, 3.50);
            refeicao[3] = new Refeicao("Suco", true, true, 1, 2.00);
            this.comanda.setValor(9.50);
        } else if (hora < 14){
            this.servico = "Almoço";
            refeicao[0] = new Refeicao ("Ala minuta", false, false, 1, 8.50);
            refeicao[1] = new Refeicao("Suco", true, true, 1, 2.00);
            refeicao[2] = new Refeicao("Frutas", true, false, 3, 2.50);
            refeicao[3] = new Refeicao("Café", false, true, 1,1.50);
            this.comanda.setValor(14.50);
        } else if (hora < 19) {
            this.servico = "Lanche";
            refeicao[0] = new Refeicao ("Iogurte", false, true, 1,1.00);
            refeicao[1] = new Refeicao("Bolo", true, false, 1, 3.00);
            refeicao[2] = new Refeicao("Torrada", false, false, 1, 3.50);
            refeicao[3] = new Refeicao("Suco", true, true, 1, 2.00);
            this.comanda.setValor(9.50);
        } else {
            this.servico = "Janta";
            refeicao[0] = new Refeicao ("Vinho", true, true, 1,19.50);
            refeicao[1] = new Refeicao("Risoto", false, false, 1, 12.50);
            refeicao[2] = new Refeicao("Tiramisu", true, false, 1, 4.50);
            refeicao[3] = new Refeicao("Água Mineral sem gás", true, true, 1, 1.50);
            this.comanda.setValor(38.00);
        }
    }

    public String getNomeBistro() {
        return nomeBistro;
    }

    public void setNomeBistro(String nomeBistro) {
        this.nomeBistro = nomeBistro;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public double getEntradaDinheiro() {
        return entradaDinheiro;
    }

    public void setEntradaDinheiro(double entradaDinheiro) {
        this.entradaDinheiro = entradaDinheiro;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public  void atender(){
        this.menu();
        comanda.setServiço(servico);
    }
    public void exibeDados(){
        System.out.println("========================= BISTRÔ ==============================");
        System.out.printf("Nome: %s \nEntrada de dinheiro no dia: %.2f", this.getNomeBistro(), this.getEntradaDinheiro());
        System.out.println("\n===============================================================");
    }

    public void menuPedido() {
        System.out.println("======================== MENU DO PEDIDO =======================");
        System.out.println(this.servico + ":");
        for (int i = 0; i < refeicao.length; i++){
            System.out.println(refeicao[i].getQuantidade() + " " + refeicao[i].getNome());
        }
        System.out.println("\n==============================================================");
    }
}


