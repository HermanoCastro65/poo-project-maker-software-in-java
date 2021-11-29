package Produtos;

import java.util.Scanner;
import e.commerce.Enum;

public class Camisa extends Produtos {

    private boolean gola;
    private String tipoManga;

    private Roupas roupa = new Roupas();

    public Camisa() {
    }

    public Camisa(boolean gola, String tipoManga) {
        this.gola = gola;
        this.tipoManga = tipoManga;
    }

    public boolean isGola() {
        return gola;
    }

    public void setGola(boolean gola) {
        this.gola = gola;
    }

    public String getTipoManga() {
        return tipoManga;
    }

    public void setTipoManga(String tipoManga) {
        this.tipoManga = tipoManga;
    }

    public Roupas getRoupa() {
        return roupa;
    }

    public void setRoupa(Roupas camisa) {
        this.roupa = camisa;
    }

    public static Camisa createCamisa() {
        try {
            Scanner scan = new Scanner(System.in);

            Camisa camisa = new Camisa();
            camisa.roupa.setRoupa();
            System.out.println("Informe o Tipo de Manga da Camisa: ");
            camisa.setTipoManga(scan.nextLine());
            System.out.println("Informe se a Camisa tem Gola: ");
            camisa.setGola(Boolean.parseBoolean(scan.nextLine()));
            return camisa;
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
            return createCamisa();
        }

    }

    public void printCamisa() {
        this.roupa.printRoupa();
        System.out.println("Tipo de Manga de Camisa: " + getTipoManga());
        System.out.println("Gola: " + isGola() + "\n");
    }

    public static void list(Camisa camisa, int index) {
        System.out.println("Camisa " + (index + 1) + " Manga: " + camisa.getTipoManga() + " Gola: " + camisa.isGola());
    }

    public static final String STRING = " CASMISA ";
    public static final String STRINGS_CADASTRADAS = "CAMISAS CADASTRADAS:\n";
    public static final String STRING_NAO_CADASTRADA = "CAMISA NÃO CADASTRADA\n";
    public static final String NENHUMA_STRING_CADASTRADA = "NENHUMA CAMISA CADASTRADA\n";
    public static final String INFORME_STRING_DA_COMPRA = "\n\nInforme a Camisa da Compra:";
    public static final String INFORME_STRING_DA_VENDA = "\n\nInforme a Camisa da Venda:";
    public static final String INFORME_STRING_PARA_ALTERAR = "\n\nInforme a Camisa para Alterar:";
    public static final String INFORME_STRING_DA_COMPRA_ALTERAR = "\n\nInforme a Camisa da Compra para Alterar:";
    public static final String INFORME_STRING_DA_VENDA_ALTERAR = "\n\nInforme a Camisa da Venda para Alterar:";
    public static final String INFORME_STRING_PARA_DELETAR = "\n\nInforme a Camisa para Deletar:";
}
