package Menus;

import java.util.Scanner;
import e.commerce.Enum;

public class MenuPrincipal {

    public MenuPrincipal() {
    }

    public static String[] abrir() {

        String[] escolha = new String[2];

        System.out.println(Enum.LINHA);
        System.out.println(Enum.ESCOLHA_UMA_OPCAO);
        System.out.println("1 - " + Enum.CADASTRAR);
        System.out.println("2 - " + Enum.EXIBIR);
        System.out.println("3 - " + Enum.ALTERAR);
        System.out.println("4 - " + Enum.DELETAR);
        System.out.println("5 - " + Enum.SAIR);
        System.out.println(Enum.LINHA);

        Scanner scan = new Scanner(System.in);
        try {
            switch (Integer.parseInt(scan.nextLine())) {
                case 1:
                    return MenuEscolha.abrir(Enum.CADASTRAR);
                case 2:
                    return MenuEscolha.abrir(Enum.EXIBIR);
                case 3:
                    return MenuEscolha.abrir(Enum.ALTERAR);
                case 4:
                    return MenuEscolha.abrir(Enum.DELETAR);
                case 5:
                    escolha[0] = Enum.SAIR;
                    return escolha;
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
