package Transacoes;

import java.util.ArrayList;
import java.util.Scanner;

import Clientes_e_Fornecedores.Clientes;
import Clientes_e_Fornecedores.Fornecedores;
import e.commerce.Enum;

public class Compras extends Transacoes {

    ArrayList<Compras> compras = new ArrayList<Compras>();

    public Compras() {
    }

    public Fornecedores getFornecedor(ArrayList<Fornecedores> fornecedor, int index) {
        return fornecedor.get(index - 1);
    }

    public void printCompra() {
        super.data.printData();
        System.out.println("Fornecedor: " + getEnte());
        System.out.println("Produto: " + getProduto());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Valor: " + getValor());
    }

    public Compras cadastrar(String nomeProduto, ArrayList<Fornecedores> fornecedores, double precoProduto) {
        if (!fornecedores.isEmpty()) {
            Scanner scan = new Scanner(System.in);

            try {
                Compras transacao = new Compras();

                transacao.data.setData();
                transacao.setProduto(nomeProduto);
                System.out.println(Fornecedores.INFORME_STRING_DA_COMPRA);
                fornecedores.forEach((fornecedor) -> {
                    Fornecedores.list(fornecedor, fornecedores.indexOf(fornecedor));
                });
                int index = Integer.parseInt(scan.nextLine());
                System.out.println("Informe a Quantidade da Compra: ");
                transacao.setQuantidade(Integer.parseInt(scan.nextLine()));

                Fornecedores fornecedorEscolhido = transacao.getFornecedor(fornecedores, index);
                transacao.setEnte(fornecedorEscolhido.getNome());
                transacao.setValor(precoProduto * transacao.getQuantidade());
                return transacao;
            } catch (Exception e) {
                System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
                return cadastrar(nomeProduto, fornecedores, precoProduto);
            }
        } else {
            System.out.println(Enum.LINHA);
            System.out.println(NAO_E_POSSIVEL_CADASTRAR + Clientes.NENHUMA_STRING_CADASTRADA);
            return null;
        }
    }

    @Override
    public void print() {

        if (!compras.isEmpty()) {
            System.out.println(Enum.LINHA);
            compras.forEach((compra) -> {
                System.out.println(STRING + (compras.lastIndexOf(compra) + 1));
                compra.printCompra();
            });
        } else {
            System.out.println(Enum.LINHA);
            System.out.println(NENHUMA_STRING_CADASTRADA);
        }
    }

    public void list() {
        compras.forEach((compra) -> {
            System.out.println("Compra " + (compras.lastIndexOf(compra) + 1) + " Ente: " + compra.getEnte()
                    + " Produto: " + compra.getProduto() + " Quantidade: " + compra.getQuantidade() + " Total: "
                    + compra.getValor());
        });
    }

    public ArrayList<Compras> getCompras() {
        return compras;
    }

    public int getSizeCompras() {
        return compras.size();
    }

    public static final String STRING = " COMPRA ";
    public static final String STRING_DE = "COMPRA DE";
    public static final String STRINGS_CADASTRADAS = "COMPRAS CADASTRADAS:\n";
    public static final String STRING_NAO_CADASTRADA = "COMPRA NÃO CADASTRADA\n";
    public static final String NENHUMA_STRING_CADASTRADA = "NENHUMA COMPRA CADASTRADA\n";
    public static final String INFORME_STRING_PARA_ALTERAR = "\n\nInforme a Compra para Alterar:";
    public static final String INFORME_STRING_PARA_DELETAR = "\n\nInforme a Compra para Deletar:";
    public static final String NAO_E_POSSIVEL_CADASTRAR = "NÃO É POSSÍVEL CADASTRAR UMA COMPRA - ";
}
