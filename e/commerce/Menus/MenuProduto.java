package e.commerce.Menus;

import java.util.Scanner;

public class MenuProduto {

    public static String Abrir(String opcao) {

        if ("EXIBIR".equals(opcao)) {
            return "PRODUTO";
        }

        System.out.println("--------------------------------------------");
        System.out.println("ESCOLHA O PRODUTO");
        System.out.println("1 - " + opcao + " CAMISA");
        System.out.println("2 - " + opcao + " BERMUDA");
        System.out.println("3 - " + opcao + " BONÉ");
        System.out.println("4 - " + opcao + " TENIS");
        System.out.println("--------------------------------------------");

        Scanner scan = new Scanner(System.in);

        try {
            switch (Integer.parseInt(scan.nextLine())) {
                case 1:
                    return "CASMISA";
                case 2:
                    return "BERMUDA";

                case 3:
                    return "BONE";

                case 4:
                    return "TENIS";
                default:
                    System.out.println("\nDIGITE UMA EXPRESSÃO VÁLIDA!\n");
                    return Abrir(opcao);
            }
        } catch (NumberFormatException e) {
            System.out.println("\nERRO: " + e + "\nDIGITE UMA EXPRESSÃO VÁLIDA!\n");
            return Abrir(opcao);
        }

    }
}
