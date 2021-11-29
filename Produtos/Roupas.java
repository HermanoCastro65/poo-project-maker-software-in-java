package Produtos;

import java.util.Scanner;
import e.commerce.Enum;

public class Roupas extends Produtos {

    private String tecido;
    private String modelo;

    public Roupas() {
    }

    public Roupas(String tecido, String modelo) {
        this.tecido = tecido;
        this.modelo = modelo;
    }

    public Roupas(String tecido, String modelo, int tamanho, double preco, String marca, String tipo, String cor,
            String codigo) {
        super(tamanho, preco, marca, tipo, cor, codigo);
        this.tecido = tecido;
        this.modelo = modelo;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setRoupa() {

        Scanner scan = new Scanner(System.in);
        try {
            super.setProduto();
            System.out.println("Informe o Tecido da Roupa: ");
            setTecido(scan.nextLine());
            System.out.println("Informe o Modelo da Roupa: ");
            setModelo(scan.nextLine());
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
            setRoupa();
        }
    }

    public void printRoupa() {
        super.printProduto();
        System.out.println("Tecido da Roupa: " + getTecido());
        System.out.println("Modelo da Roupa: " + getModelo());
    }

}
