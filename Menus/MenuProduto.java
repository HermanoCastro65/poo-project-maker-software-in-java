package Menus;

import java.util.Scanner;

import Produtos.Bermuda;
import Produtos.*;
import e.commerce.Enum;

public class MenuProduto {

    public static String abrir(String opcao) {

        if (Enum.EXIBIR.equals(opcao)) {
            return Produtos.STRING;
        }

        System.out.println(Enum.LINHA);
        System.out.println(Produtos.ESCOLHA_PRODUTO);
        System.out.println("1 - " + opcao + " " + Camisa.STRING);
        System.out.println("2 - " + opcao + Bermuda.STRING);
        System.out.println("3 - " + opcao + Bone.STRING);
        System.out.println("4 - " + opcao + Tenis.STRING);
        System.out.println(Enum.LINHA);

        Scanner scan = new Scanner(System.in);
        try {
            switch (Integer.parseInt(scan.nextLine())) {
                case 1:
                    return Camisa.STRING;
                case 2:
                    return Bermuda.STRING;
                case 3:
                    return Bone.STRING;
                case 4:
                    return Tenis.STRING;
                default:
                    System.out.println(Enum.DIGITE_EXPRESSAO_VALIDA);
                    return abrir(opcao);
            }
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
        }
        return abrir(opcao);
    }
}
