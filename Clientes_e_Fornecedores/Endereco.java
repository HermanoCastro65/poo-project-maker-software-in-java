package Clientes_e_Fornecedores;

import java.util.Scanner;
import e.commerce.Enum;

public class Endereco {

    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    public Endereco() {
    }

    public Endereco(String estado, String cidade, String bairro, String rua, int numero) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEndereco() {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Informações do Enereço:");
            System.out.println("Informe o Estado: ");
            setEstado(scan.nextLine());
            System.out.println("Informe a Cidade: ");
            setCidade(scan.nextLine());
            System.out.println("Informe o Bairro: ");
            setBairro(scan.nextLine());
            System.out.println("Informe a Rua: ");
            setRua(scan.nextLine());
            System.out.println("Informe o Número: ");
            setNumero(Integer.parseInt(scan.nextLine()));
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
            setEndereco();
        }
    }

    public void printEndereco() {
        System.out.println("Enereço:");
        System.out.println("Estado: " + getEstado() + ", Cidade: " + getCidade() + ", Bairro: " + getBairro());
        System.out.println(getRua() + ", " + getNumero());
    }
}
