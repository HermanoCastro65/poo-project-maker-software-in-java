package Clientes_e_Fornecedores;

import java.util.ArrayList;
import java.util.Scanner;
import e.commerce.Enum;

public class Fornecedores extends Dados {

    private String CNPJ;
    private double valorVendas;

    public ArrayList<Fornecedores> fornecedores = new ArrayList<Fornecedores>();

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

        try {
            Scanner scan = new Scanner(System.in);
            Fornecedores fornecedor = new Fornecedores();
            fornecedor.setDados();
            System.out.println("Informe o CNPJ do Fornecedor: ");
            fornecedor.setCNPJ(scan.nextLine());
            System.out.println("Informe o Valor de Vendas do Fornecedor: ");
            fornecedor.setValorVendas(Double.parseDouble(scan.nextLine()));
            return fornecedor;
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
            return createFornecedor();
        }
    }

    public void printFornecedores() {
        super.printDados();
        System.out.println("CNPJ do Fornecedor: " + getCNPJ());
        System.out.println("Valor de Vendas do Fornecedor: R$ " + String.format("%,.2f", getValorVendas()));
    }

    public void cadastrar() {
        Fornecedores fornecedor = createFornecedor();
        fornecedores.add(fornecedor);
    }

    public void print() {
        if (!fornecedores.isEmpty()) {
            System.out.println(Enum.LINHA);
            System.out.println(STRINGS_CADASTRADAS);
            fornecedores.forEach((fornecedor) -> {
                System.out.println(STRING + (fornecedores.lastIndexOf(fornecedor) + 1));
                fornecedor.printFornecedores();
            });
        } else {
            System.out.println(Enum.LINHA);
            System.out.println(NENHUMA_STRING_CADASTRADA);
        }
    }

    public static void list(Fornecedores fornecedor, int index) {
        System.out.println("Fornecedor " + (index + 1) + " CNPJ: " + fornecedor.getCNPJ() + " Valor de Vendas: R$ "
                + String.format("%,.2f", fornecedor.getValorVendas()));
    }

    public static final String STRING = " FORNECEDOR ";
    public static final String STRINGS_CADASTRADAS = "FORNECEDORES CADASTRADOS:\n";
    public static final String STRING_NAO_CADASTRADA = "FORNECEDOR NÃO CADASTRADO\n";
    public static final String NENHUMA_STRING_CADASTRADA = "NENHUM FORNECEDOR CADASTRADO\n";
    public static final String INFORME_STRING_DA_COMPRA = "\n\nInforme o Fornecedor da Compra:";
    public static final String INFORME_STRING_PARA_ALTERAR = "\n\nInforme o Fornecedor para Alterar:";
    public static final String INFORME_STRING_PARA_DELETAR = "\n\nInforme o Fornecedor para Deletar:";
}
