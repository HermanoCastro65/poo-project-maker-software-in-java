package Menus;

import java.util.Scanner;
import e.commerce.Enum;

public class MenuCliente {

    public static String[] abrir() {

        String[] escolha = new String[2];

        System.out.println(Enum.LINHA);
        System.out.println(Enum.ESCOLHA_UMA_OPCAO);
        System.out.println("1 - " + Enum.COMPRAR);
        System.out.println("2 - " + Enum.EXIBIR);
        System.out.println("3 - " + Enum.DELETAR);
        System.out.println("4 - " + Enum.SAIR);
        System.out.println(Enum.LINHA);

        Scanner scan = new Scanner(System.in);
        try {
            switch (Integer.parseInt(scan.nextLine())) {
                case 1:
                    escolha[0] = Enum.COMPRAR;
                    escolha[1] = MenuProduto.abrir(Enum.COMPRAR);
                    return escolha;
                case 2:
                    escolha[0] = Enum.EXIBIR;
                    escolha[1] = MenuProduto.abrir(Enum.EXIBIR);
                    return escolha;
                case 3:
                    escolha[0] = Enum.DELETAR;
                    escolha[1] = MenuProduto.abrir(Enum.DELETAR);
                    return escolha;
                case 4:
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
