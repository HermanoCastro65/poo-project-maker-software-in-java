package Transacoes;

import Clientes_e_Fornecedores.Clientes;
import java.util.ArrayList;
import java.util.Scanner;
import e.commerce.Enum;

public class Vendas extends Transacoes {

    ArrayList<Vendas> vendas = new ArrayList<Vendas>();

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

    public Vendas cadastrar(String nomeProduto, ArrayList<Clientes> clientes, double precoProduto) {
        if (!clientes.isEmpty()) {
            Scanner scan = new Scanner(System.in);

            try {
                Vendas transacao = new Vendas();

                transacao.data.setData();
                transacao.setProduto(nomeProduto);
                System.out.println(Clientes.INFORME_STRING_DA_VENDA);
                clientes.forEach((cliente) -> {
                    Clientes.list(cliente, clientes.indexOf(cliente));
                });
                int index = Integer.parseInt(scan.nextLine());
                System.out.println("Informe a Quantidade da Venda: ");
                transacao.setQuantidade(Integer.parseInt(scan.nextLine()));

                Clientes clienteEscolhido = transacao.getCliente(clientes, index);
                transacao.setEnte(clienteEscolhido.getNome());
                transacao.setValor(precoProduto * transacao.getQuantidade());
                return transacao;
            } catch (Exception e) {
                System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
                return cadastrar(nomeProduto, clientes, precoProduto);
            }
        } else {
            System.out.println(Enum.LINHA);
            System.out.println(NAO_E_POSSIVEL_CADASTRAR + Clientes.NENHUMA_STRING_CADASTRADA);
            return null;
        }
    }

    @Override
    public void print() {

        if (!vendas.isEmpty()) {
            System.out.println(Enum.LINHA);
            vendas.forEach((venda) -> {
                System.out.println(STRING + (vendas.lastIndexOf(venda) + 1));
                venda.printVenda();
            });
        } else {
            System.out.println(Enum.LINHA);
            System.out.println(NENHUMA_STRING_CADASTRADA);
        }
    }

    public void list() {
        vendas.forEach((venda) -> {
            System.out.println("Compra " + (vendas.lastIndexOf(venda) + 1) + " Ente: " + venda.getEnte() + " Produto: "
                    + venda.getProduto() + " Quantidade: " + venda.getQuantidade() + " Total: " + venda.getValor());
        });
    }

    public ArrayList<Vendas> getVendas() {
        return vendas;
    }

    public int getSizeVendas() {
        return vendas.size();
    }

    public static final String STRING = "VENDA";
    public static final String STRING_DE = "VENDA DE";
    public static final String STRINGS_CADASTRADAS = "VENDAS CADASTRADAS:\n";
    public static final String STRING_NAO_CADASTRADA = "VENDA NÃO CADASTRADA\n";
    public static final String NENHUMA_STRING_CADASTRADA = "NENHUMA VENDA CADASTRADA\n";
    public static final String INFORME_STRING_PARA_ALTERAR = "\n\nInforme a Venda para Alterar:";
    public static final String INFORME_STRING_PARA_DELETAR = "\n\nInforme a Venda para Deletar:";
    public static final String NAO_E_POSSIVEL_CADASTRAR = "NÃO É POSSÍVEL CADASTRAR UMA VENDA - ";
}
