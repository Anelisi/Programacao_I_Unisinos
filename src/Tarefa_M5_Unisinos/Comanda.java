package Tarefa_M5_Unisinos;

public class Comanda {
    private String serviço;
    private double valor;
    private double gorgeta;

    public String getServiço() {
        return serviço;
    }

    public void setServiço(String serviço) {
        this.serviço = serviço;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getGorgeta() {
        return gorgeta;
    }

    public void setGorgeta(double gorgeta) {
        this.gorgeta = gorgeta;
    }

    public void gorgeta(){
        this.gorgeta = valor * 0.1;
        setValor(valor + gorgeta);

    }
}

