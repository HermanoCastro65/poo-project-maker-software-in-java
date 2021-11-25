package e.commerce.Menus;

import java.util.Scanner;

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

    public static String[] Abrir(String opcao) {
        System.out.println("--------------------------------------------");
        System.out.println("ESCOLHA UMA OPÇÃO PARA " + opcao + " :");
        System.out.println("1 - " + opcao + " PRODUTO");
        System.out.println("2 - " + opcao + " FORNECEDOR");
        System.out.println("3 - " + opcao + " CLIENTE");
        System.out.println("4 - " + opcao + " COMPRA");
        System.out.println("5 - " + opcao + " VENDA");
        System.out.println("--------------------------------------------");

        Scanner scan = new Scanner(System.in);
        MenuEscolha escolha = new MenuEscolha();
        escolha.opcoes[0] = opcao;
        
        try {
            switch (Integer.parseInt(scan.nextLine())) {
                case 1:
                    escolha.opcoes[1] = MenuProduto.Abrir(opcao);
                    return escolha.getOpcoes();
                case 2:
                    escolha.opcoes[1] = "FORNECEDOR";
                    return escolha.getOpcoes();
                case 3:
                    escolha.opcoes[1] = "CLIENTE";
                    return escolha.getOpcoes();
                case 4:
                    escolha.opcoes[1] = "COMPRA";
                    return escolha.getOpcoes();
                case 5:
                    escolha.opcoes[1] = "VENDA";
                    return escolha.getOpcoes();
                default:
                    System.out.println("\nDIGITE UMA EXPRESSÃO VÁLIDA!\n");
                    Abrir(opcao);
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("\nERRO: " + e + "\nDIGITE UMA EXPRESSÃO VÁLIDA!\n");
            return Abrir(opcao);
        }
        return null;
    }

}
