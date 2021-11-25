package Clientes_e_Fornecedores;

import java.util.ArrayList;
import java.util.Scanner;

public class Clientes extends Dados {

    private String CPF;
    private int idade;
    private double valorCompras;

    public ArrayList<Clientes> clientes = new ArrayList();

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

        try {
            Clientes cliente = new Clientes();
            cliente.setDados();
            System.out.println("Informe o CPF do Cliente: ");
            cliente.setCPF(scan.nextLine());
            System.out.println("Informe a Idade do Cliente: ");
            cliente.setIdade(Integer.parseInt(scan.nextLine()));
            System.out.println("Informe o Valor de Compras do Cliente: ");
            cliente.setValorCompras(Double.parseDouble(scan.nextLine()));
            return cliente;
        } catch (NumberFormatException e) {
            System.out.println("\nERRO: " + e + "\nDIGITE UMA EXPRESSÃO VÁLIDA!\n");
            return createCliente();
        }
    }

    public void printClientes() {
        super.printDados();
        System.out.println("CPF do Cliente: " + getCPF());
        System.out.println("Idade do Cliente: " + getIdade());
        System.out.println("Valor de Compras do Cliente: R$ " + String.format("%,.2f", getValorCompras()));
    }

    public void Cadastrar() {
        Clientes cliente = createCliente();
        clientes.add(cliente);
    }

    public void Print() {
        if (!clientes.isEmpty()) {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("CLIENTES CADASTRADOS:\n");
            clientes.forEach((cliente) -> {
                System.out.println("Cliente " + (clientes.lastIndexOf(cliente) + 1));
                cliente.printClientes();
            });
        } else {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("NENHUM ClIENTE CADASTRADO\n");
        }
    }

    public static void print(Clientes cliente, int index) {
        System.out.println("Cliente " + (index + 1) + " CPF: " + cliente.getCPF() + " Idade" + cliente.getIdade()
                + " Valor de Compras: R$ " + String.format("%,.2f", cliente.getValorCompras()));
    }

}
