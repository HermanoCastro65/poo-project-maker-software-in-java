package Transacoes;

public abstract class Transacoes {

    public Data data = new Data();
    private String ente;
    private String produto;
    private int quantidade;
    private double valor;

    public Transacoes(String ente, String produto, int quantidade, double valor) {
        this.ente = ente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Transacoes() {
    }

    public abstract void print();

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getEnte() {
        return ente;
    }

    public void setEnte(String ente) {
        this.ente = ente;
    }
}
