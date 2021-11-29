package Clientes_e_Fornecedores;

import java.util.ArrayList;
import java.util.Scanner;
import e.commerce.Enum;

public class Clientes extends Dados {

    private String CPF;
    private int idade;
    private double valorCompras;

    public ArrayList<Clientes> clientes = new ArrayList<Clientes>();

    public Clientes() {
    }

    public Clientes(String CPF, int idade, double valorCompras) {
        this.CPF = CPF;
        this.idade = idade;
        this.valorCompras = valorCompras;
    }

    public Clientes(String CPF, int idade, double valorCompras, String nome, String CEP, String telefone) {
        super(nome, CEP, telefone);
        this.CPF = CPF;
        this.idade = idade;
        this.valorCompras = valorCompras;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorCompras() {
        return valorCompras;
    }

    public void setValorCompras(double valorCompras) {
        this.valorCompras = valorCompras;
    }

    public static Clientes createCliente() {
        Scanner scan = new Scanner(System.in);
        Clientes cliente = new Clientes();
        try {
            cliente.setDados();
            System.out.println("Informe o CPF do Cliente: ");
            cliente.setCPF(scan.nextLine());
            System.out.println("Informe a Idade do Cliente: ");
            cliente.setIdade(Integer.parseInt(scan.nextLine()));
            System.out.println("Informe o Valor de Compras do Cliente: ");
            cliente.setValorCompras(Double.parseDouble(scan.nextLine()));

        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
            return createCliente();
        }

        return cliente;

    }

    public void printClientes() {
        super.printDados();
        System.out.println("CPF do Cliente: " + getCPF());
        System.out.println("Idade do Cliente: " + getIdade());
        System.out.println("Valor de Compras do Cliente: R$ " + String.format("%,.2f", getValorCompras()));
    }

    public void cadastrar() {
        Clientes cliente = createCliente();
        clientes.add(cliente);
    }

    public void print() {
        if (!clientes.isEmpty()) {
            System.out.println(Enum.LINHA);
            System.out.println(STRINGS_CADASTRADAS);
            clientes.forEach((cliente) -> {
                System.out.println("Cliente " + (clientes.lastIndexOf(cliente) + 1));
                cliente.printClientes();
            });
        } else {
            System.out.println(Enum.LINHA);
            System.out.println(NENHUMA_STRING_CADASTRADA);
        }
    }

    public static void list(Clientes cliente, int index) {
        System.out.println(STRING + (index + 1) + " CPF: " + cliente.getCPF() + " Idade" + cliente.getIdade()
                + " Valor de Compras: R$ " + String.format("%,.2f", cliente.getValorCompras()));
    }

    public static final String STRING = " CLIENTE ";
    public static final String STRINGS_CADASTRADAS = "CLIENTES CADASTRADOS:\n";
    public static final String STRING_NAO_CADASTRADA = "CLIENTE NÃO CADASTRADO\n";
    public static final String NENHUMA_STRING_CADASTRADA = "NENHUM CLIENTE CADASTRADO\n";
    public static final String INFORME_STRING_DA_VENDA = "\n\nInforme o Cliente da Venda:";
    public static final String INFORME_STRING_PARA_ALTERAR = "\n\nInforme o Cliente para Alterar:";
    public static final String INFORME_STRING_PARA_DELETAR = "\n\nInforme o Cliente para Deletar:";
}
