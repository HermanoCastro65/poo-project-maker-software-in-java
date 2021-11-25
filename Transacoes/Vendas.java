package Transacoes;

import Clientes_e_Fornecedores.Clientes;
import java.util.ArrayList;
import java.util.Scanner;
import e.commerce.Metodos;

public class Vendas extends Transacoes {

    ArrayList<Vendas> vendas = new ArrayList();

    public Vendas() {
    }

    public Clientes getCliente(ArrayList<Clientes> cliente, int index) {
        return cliente.get(index - 1);
    }

    public void printVenda() {
        super.data.printData();
        System.out.println("Cliente: " + getEnte());
        System.out.println("Produto: " + getProduto());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Valor: " + getValor());
    }

    public Vendas Cadastrar(String nomeProduto, ArrayList<Clientes> clientes, double precoProduto) {

        Scanner scan = new Scanner(System.in);

        try {
            Vendas transacao = new Vendas();

            transacao.data.setData();
            transacao.setProduto(nomeProduto);
            System.out.println("Escolha o Cliente da venda: ");
            clientes.forEach((cliente) -> {
                Clientes.print(cliente, clientes.indexOf(cliente));
            });
            int index = Integer.parseInt(scan.nextLine());
            System.out.println("Informe a Quantidade da Venda: ");
            transacao.setQuantidade(Integer.parseInt(scan.nextLine()));

            Clientes clienteEscolhido = transacao.getCliente(clientes, index);
            transacao.setEnte(clienteEscolhido.getNome());
            transacao.setValor(precoProduto * transacao.getQuantidade());

            return transacao;
        } catch (NumberFormatException e) {
            System.out.println("\nERRO: " + e + "\nDIGITE UMA EXPRESSÃO VÁLIDA!\n");
            return Cadastrar(nomeProduto, clientes, precoProduto);
        }
    }

    @Override
    public void Print() {

        if (!vendas.isEmpty()) {
            System.out.println("\n--------------------------------------------\n");
            vendas.forEach((venda) -> {
                System.out.println("Compra " + (vendas.lastIndexOf(venda) + 1));
                venda.printVenda();
            });
        } else {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("NENHUMA COMPRA CADASTRADA\n");
        }
    }

}
