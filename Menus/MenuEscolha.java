package Menus;

import java.util.Scanner;

import Clientes_e_Fornecedores.Clientes;
import Clientes_e_Fornecedores.Fornecedores;
import e.commerce.Enum;
import Produtos.Produtos;
import Transacoes.Compras;
import Transacoes.Vendas;

public class MenuEscolha {

    private String[] opcoes = new String[2];

    public MenuEscolha() {
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    public static String[] abrir(String opcao) {
        System.out.println(Enum.LINHA);
        System.out.println(Enum.ESCOLHA_UMA_OPCAO_PARA + opcao + " :");
        System.out.println("1 - " + opcao + Produtos.STRING);
        System.out.println("2 - " + opcao + Fornecedores.STRING);
        System.out.println("3 - " + opcao + Clientes.STRING);
        System.out.println("4 - " + opcao + Compras.STRING);
        System.out.println("5 - " + opcao + Vendas.STRING);
        System.out.println(Enum.LINHA);

        Scanner scan = new Scanner(System.in);
        MenuEscolha escolha = new MenuEscolha();
        escolha.opcoes[0] = opcao;

        try {
            switch (Integer.parseInt(scan.nextLine())) {
                case 1:
                    escolha.opcoes[1] = MenuProduto.abrir(opcao);
                    return escolha.getOpcoes();
                case 2:
                    escolha.opcoes[1] = Fornecedores.STRING;
                    return escolha.getOpcoes();
                case 3:
                    escolha.opcoes[1] = Clientes.STRING;
                    return escolha.getOpcoes();
                case 4:
                    escolha.opcoes[1] = Compras.STRING;
                    return escolha.getOpcoes();
                case 5:
                    escolha.opcoes[1] = Vendas.STRING;
                    return escolha.getOpcoes();
                default:
                    System.out.println(Enum.DIGITE_EXPRESSAO_VALIDA);
                    break;
            }
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
        }
        return abrir(opcao);
    }

}
