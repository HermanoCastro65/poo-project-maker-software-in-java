package Menus;

import java.util.Scanner;
import e.commerce.Enum;

public class MenuApp {

    public MenuApp() {
    }

    public static String abrir() {
        System.out.println(Enum.LINHA);
        System.out.println(Enum.ESCOLHA_UMA_OPCAO);
        System.out.println("1 - " + Enum.GESTOR);
        System.out.println("2 - " + Enum.CLIENTE);
        System.out.println(Enum.LINHA);

        Scanner scan = new Scanner(System.in);
        try {
            switch (Integer.parseInt(scan.nextLine())) {
                case 1:
                    return Enum.GESTOR;
                case 2:
                    return Enum.CLIENTE;
                default:
                    System.out.println(Enum.DIGITE_EXPRESSAO_VALIDA);
                    return abrir();
            }
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
        }
        return abrir();
    }
}
