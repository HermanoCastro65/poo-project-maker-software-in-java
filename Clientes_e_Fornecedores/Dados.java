package Clientes_e_Fornecedores;

import java.util.Scanner;

public class Dados {

    private String nome;
    private String CEP;
    private String telefone;
    private Endereco endereco = new Endereco();

    public Dados() {
    }

    public Dados(String nome, String CEP, String telefone) {
        this.nome = nome;
        this.CEP = CEP;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDados() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o Nome: ");
        setNome(scan.nextLine());
        System.out.println("Informe o Telefone: ");
        setTelefone(scan.nextLine());
        System.out.println("Informe o CEP: ");
        setCEP(scan.nextLine());
        endereco.setEndereco();
    }

    public void printDados() {
        endereco.printEndereco();
        System.out.println("CEP: " + getCEP());
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
    }
}
