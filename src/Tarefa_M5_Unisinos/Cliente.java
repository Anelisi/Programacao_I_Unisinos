package Tarefa_M5_Unisinos;

import java.util.Scanner;

public class Cliente extends Pessoa {
    Scanner sc = new Scanner(System.in);

    private String pedido;
    private double valorComanda;
    Bistro bistro;

    public Cliente(String nome, String endereço, String bairro, int idade, String telefone, Bistro bistro) {
        super(nome, endereço, bairro, idade, telefone);
        this.bistro = bistro;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public void comerNoBistro(){
        this.fazerPedido();
        this.setPedido(bistro.getServico());
    }

    public void fazerPedido(){
        bistro.atender();

    }

    public void pagarComanda(){
        System.out.printf("\nOlá!\nO valor da sua comanda é R$ %.2f", bistro.comanda.getValor());
        System.out.println("\nQuer pagar com 10%? S/N");
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("S")){
            bistro.comanda.gorgeta();
            valorComanda =  bistro.comanda.getValor();
            bistro.setEntradaDinheiro(valorComanda);
            System.out.println("\nMuito obrigada pela preferência.\n Volte Sempre!");

        }else {
            valorComanda =  bistro.comanda.getValor();
            bistro.setEntradaDinheiro(bistro.comanda.getValor());
            System.out.println("\nMuito obrigada pela preferência. \nVolte Sempre!");
        }
    }
    public void exibeDados(){
        System.out.println("======================== CLIENTE ==============================");
        System.out.printf("Nome: %s \nRestaurante: %s \nPedido: %s \nValor da Comanda: R$ %.2f", this.getNome(), this.bistro.getNomeBistro(), this.getPedido(), this.valorComanda);
        System.out.println("\n===============================================================");
    }

}

