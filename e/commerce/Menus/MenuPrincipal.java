package e.commerce.Menus;

import java.util.Scanner;

public class MenuPrincipal {

    public MenuPrincipal() {
    }

    public static String[] Abrir() {
        System.out.println("--------------------------------------------");
        System.out.println("ESCOLHA UMA OPÇÃO:");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - EXIBIR");
        System.out.println("3 - ALTERAR");
        System.out.println("4 - DELETAR");
        System.out.println("5 - SAIR");
        System.out.println("--------------------------------------------");

        Scanner scan = new Scanner(System.in);
        try {
            switch (Integer.parseInt(scan.nextLine())) {
                case 1:
                    return MenuEscolha.Abrir("CADASTRAR");
                case 2:
                    return MenuEscolha.Abrir("EXIBIR");
                case 3:
                    return MenuEscolha.Abrir("ALTERAR");
                case 4:
                    return MenuEscolha.Abrir("DELETAR");
                case 5:
                    return null;
                default:
                    System.out.println("\nDIGITE UMA EXPRESSÃO VÁLIDA!\n");
                    return Abrir();
            }
        } catch (NumberFormatException e) {
            System.out.println("\nERRO: " + e + "\nDIGITE UMA EXPRESSÃO VÁLIDA!\n");
            Abrir();
        }
        return null;
    }
}
