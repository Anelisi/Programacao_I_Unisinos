package Tarefa_M5_Unisinos;

public class main {
    public static void main(String[] args) {
        Funcionario [] funcionarios = new Funcionario[4];
        Bistro bistro1 = new Bistro("Honest Food");

        funcionarios[0] = new Funcionario("Livia","Av.Azenha","Azenha",30,"9999.9999","Atendente", 2500.00,"Manhã/Tarde",bistro1);
        funcionarios[1] = new Funcionario("João","Av.Azenha","Azenha",30,"9999.9999","Atendente", 2500.00,"Tarde/Noite",bistro1);
        funcionarios[2] = new Funcionario("Tieta","Rua Lopo Gonçalves","Cidade Baixa",34,"8787.8787","Caixa", 5800.00,"Manhã/Tarde",bistro1);
        funcionarios[3] = new Funcionario("Joana","Rua Lopo Gonçalves","Cidade Baixa",34,"8787.8787","Caixa", 5800.00,"Tarde/Noite",bistro1);
        funcionarios[0].comerNoBistro();
        funcionarios[2].comerNoBistro();

        Cliente cliente = new Cliente("Anelisi", "Avenida André da Rocha", "Centro Histórico", 33, "8888.8888",bistro1);
        cliente.comerNoBistro();
        cliente.pagarComanda();

        bistro1.exibeDados();
        funcionarios[0].exibeDados();
        funcionarios[2].exibeDados();
        cliente.exibeDados();
    }
}