package e.commerce;

import App.AppCliente;
import App.AppGestor;
import Clientes_e_Fornecedores.Clientes;
import Clientes_e_Fornecedores.Fornecedores;
import Menus.*;
import Produtos.*;
import Transacoes.Compras;
import Transacoes.Vendas;

public class ECommerce {

    public static void app(Produtos produtos, Produtos produtosCliente, Fornecedores fornecedores,
            Clientes clientes, Compras compras, Vendas vendas) {

        String person = MenuApp.abrir();

        try {
            switch (person) {

                case Enum.GESTOR:
                    AppGestor.appGestor(produtos, fornecedores, clientes, compras, vendas);
                    break;

                case Enum.CLIENTE:
                    AppCliente.appCliente(produtos, produtosCliente);
                    break;

                default:
                    System.out.println(Enum.DIGITE_EXPRESSAO_VALIDA);
                    break;
            }
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
        }
        app(produtos, produtosCliente, fornecedores, clientes, compras, vendas);
    }

    public static void appCliente() {

    }

    public static void main(String[] args) {

        Produtos produtos = new Produtos();
        Produtos produtosCliente = new Produtos();
        Fornecedores fornecedores = new Fornecedores();
        Clientes clientes = new Clientes();
        Compras compras = new Compras();
        Vendas vendas = new Vendas();

        app(produtos, produtosCliente, fornecedores, clientes, compras, vendas);
    }
}