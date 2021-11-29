package Produtos;

import java.util.Scanner;
import e.commerce.Enum;

public class Tenis extends Produtos {

    private boolean cadarco;
    private String tipoSolado;

    private Acessorios acessorio = new Acessorios();

    public Tenis() {
    }

    public Tenis(boolean cadarco, String tipoSolado) {
        this.cadarco = cadarco;
        this.tipoSolado = tipoSolado;
    }

    public boolean isCadarco() {
        return cadarco;
    }

    public void setCadarco(boolean cadarco) {
        this.cadarco = cadarco;
    }

    public String getTipoSolado() {
        return tipoSolado;
    }

    public void setTipoSolado(String tipoSolado) {
        this.tipoSolado = tipoSolado;
    }

    public Acessorios getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorios tenis) {
        this.acessorio = tenis;
    }

    public static Tenis createTenis() {

        Scanner scan = new Scanner(System.in);
        try {
            Tenis tenis = new Tenis();
            tenis.acessorio.setAcessorio();
            System.out.println("Informe o Tipo do Solado do Tenis: ");
            tenis.setTipoSolado(scan.nextLine());
            System.out.println("Informe se o tenis tem Cadarço: ");
            tenis.setCadarco(Boolean.parseBoolean(scan.nextLine()));
            return tenis;
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
            return createTenis();
        }
    }

    public void printTenis() {
        this.acessorio.printAcessorio();
        System.out.println("Tipo do Solado do Tenis: " + getTipoSolado());
        System.out.println("Cadarço: " + isCadarco() + "\n");
    }

    public static void list(Tenis tenis, int index) {
        System.out
                .println("Tenis " + (index + 1) + " Solado: " + tenis.getTipoSolado() + " Cadarço" + tenis.isCadarco());
    }

    public static final String STRING = " TÊNIS ";
    public static final String STRINGS_CADASTRADAS = "TÊNIS CADASTRADOS:\n";
    public static final String STRING_NAO_CADASTRADA = "TÊNIS  NÃO CADASTRADO\n";
    public static final String NENHUMA_STRING_CADASTRADA = "NENHUM TÊNIS  CADASTRADO\n";
    public static final String INFORME_STRING_DA_COMPRA = "\n\nInforme o Tênis da Compra:";
    public static final String INFORME_STRING_DA_VENDA = "\n\nInforme o Tênis da Venda:";
    public static final String INFORME_STRING_PARA_ALTERAR = "\n\nInforme o Tênis para Alterar:";
    public static final String INFORME_STRING_DA_COMPRA_ALTERAR = "\n\nInforme o Tênis da Compra para Alterar:";
    public static final String INFORME_STRING_DA_VENDA_ALTERAR = "\n\nInforme o Tênis da Venda para Alterar:";
    public static final String INFORME_STRING_PARA_DELETAR = "\n\nInforme o Tênis para Deletar:";
}
