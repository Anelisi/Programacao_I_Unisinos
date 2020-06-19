package Tarefa_M5_Unisinos;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private String turnoTrabalho;
    private String pedido;
    private double caixinha;
    private double salarioLiquido;
    Bistro bistro;


    public Funcionario(String nome, String endereço, String bairro, int idade, String telefone, String cargo, double salario, String turnoTrabalho, Bistro bistro) {
        super(nome, endereço, bairro, idade, telefone);
        this.cargo = cargo;
        this.salario = salario;
        this.turnoTrabalho = turnoTrabalho;
        this.bistro = bistro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurnoTrabalho() {
        return turnoTrabalho;
    }

    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }

    public double getCaixinha() {
        return caixinha;
    }

    public void setCaixinha(double caixinha) {
        this.caixinha = caixinha;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void comerNoBistro(){
        this.fazerPedido();
        this.setPedido(bistro.getServico());
    }
    public void fazerPedido(){
        bistro.atender();
    }
    public void gorgeta(){
        caixinha = bistro.comanda.getGorgeta();
    }
    public void salarioLiquido(){
        this.gorgeta();
        this.setSalarioLiquido(this.getSalario() + this.getCaixinha());
    }
    public void exibeDados(){
        this.salarioLiquido();
        System.out.println("====================== FUNCIONÁRIO ============================");
        System.out.printf( "Nome: %s\nEmpresa: %s\nCargo: %s \nSalário Bruto: R$%.2f \nSalário Líquido: R$%.2f \nPedido: %s", this.getNome(), this.bistro.getNomeBistro(), this.cargo, this.salario, this.getSalarioLiquido(),  this.getPedido());
        System.out.println("\n===============================================================");
    }

}

