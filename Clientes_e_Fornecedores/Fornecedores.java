package Clientes_e_Fornecedores;

import java.util.ArrayList;
import java.util.Scanner;

public class Fornecedores extends Dados {

    private String CNPJ;
    private double valorVendas;

    public ArrayList<Fornecedores> fornecedores = new ArrayList();

    public Fornecedores() {
    }

    public Fornecedores(String CNPJ, double valorVendas) {
        this.CNPJ = CNPJ;
        this.valorVendas = valorVendas;
    }

    public Fornecedores(String CNPJ, double valorVendas, String nome, String CEP, String telefone) {
        super(nome, CEP, telefone);
        this.CNPJ = CNPJ;
        this.valorVendas = valorVendas;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public static Fornecedores createFornecedor() {

        Scanner scan = new Scanner(System.in);

        try {
            Fornecedores fornecedor = new Fornecedores();
            fornecedor.setDados();
            System.out.println("Informe o CNPJ do Fornecedor: ");
            fornecedor.setCNPJ(scan.nextLine());
            System.out.println("Informe o Valor de Vendas do Fornecedor: ");
            fornecedor.setValorVendas(Double.parseDouble(scan.nextLine()));
            return fornecedor;
        } catch (NumberFormatException e) {
            System.out.println("\nERRO: " + e + "\nDIGITE UMA EXPRESSÃO VÁLIDA!\n");
            return createFornecedor();
        }
    }

    public void printFornecedores() {
        super.printDados();
        System.out.println("CNPJ do Fornecedor: " + getCNPJ());
        System.out.println("Valor de Vendas do Fornecedor: R$ " + String.format("%,.2f", getValorVendas()));
    }

    public void Cadastrar() {
        Fornecedores fornecedor = createFornecedor();
        fornecedores.add(fornecedor);
    }

    public void Print() {
        if (!fornecedores.isEmpty()) {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("FORNECEDORES CADASTRADOS:\n");
            fornecedores.forEach((fornecedor) -> {
                System.out.println("Fornecedor " + (fornecedores.lastIndexOf(fornecedor) + 1));
                fornecedor.printFornecedores();
            });
        } else {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("NENHUM FORNECEDOR CADASTRADO\n");
        }
    }

    public static void print(Fornecedores fornecedor, int index) {
        System.out.println("Fornecedor " + (index + 1) + " CNPJ: " + fornecedor.getCNPJ() + " Valor de Vendas: R$ "
                + String.format("%,.2f", fornecedor.getValorVendas()));
    }
}
