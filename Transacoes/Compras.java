package Transacoes;

import java.util.ArrayList;
import java.util.Scanner;
import Clientes_e_Fornecedores.Fornecedores;
import e.commerce.Metodos;

public class Compras extends Transacoes {

    ArrayList<Compras> compras = new ArrayList();

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

    public Compras Cadastrar(String nomeProduto, ArrayList<Fornecedores> fornecedores, double precoProduto) {

        Scanner scan = new Scanner(System.in);

        try {
            Compras transacao = new Compras();

            transacao.data.setData();
            transacao.setProduto(nomeProduto);
            System.out.println("Escolha o Fornecedor da Compra: ");
            fornecedores.forEach((fornecedor) -> {
                Fornecedores.print(fornecedor, fornecedores.indexOf(fornecedor));
            });
            int index = Integer.parseInt(scan.nextLine());
            System.out.println("Informe a Quantidade da Compra: ");
            transacao.setQuantidade(Integer.parseInt(scan.nextLine()));

            Fornecedores fornecedorEscolhido = transacao.getFornecedor(fornecedores, index);
            transacao.setEnte(fornecedorEscolhido.getNome());
            transacao.setValor(precoProduto * transacao.getQuantidade());

            return transacao;
        } catch (NumberFormatException e) {
            System.out.println("\nERRO: " + e + "\nDIGITE UMA EXPRESSÃO VÁLIDA!\n");
            return Cadastrar(nomeProduto, fornecedores, precoProduto);
        }
    }

    @Override
    public void Print() {

        if (!compras.isEmpty()) {
            System.out.println("\n--------------------------------------------\n");
            compras.forEach((compra) -> {
                System.out.println("Compra " + (compras.lastIndexOf(compra) + 1));
                compra.printCompra();
            });
        } else {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("NENHUMA COMPRA CADASTRADA\n");
        }
    }

}
