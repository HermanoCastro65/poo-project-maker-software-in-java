package Produtos;

import java.util.Scanner;
import e.commerce.Enum;

public class Bermuda extends Produtos {

    private boolean elastico;
    private String tipoCorte;

    private Roupas roupa = new Roupas();

    public Bermuda() {
    }

    public Bermuda(boolean elastico, String tipoCorte) {
        this.elastico = elastico;
        this.tipoCorte = tipoCorte;
    }

    public boolean isElastico() {
        return elastico;
    }

    public void setElastico(boolean elastico) {
        this.elastico = elastico;
    }

    public String getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(String tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    public Roupas getRoupa() {
        return roupa;
    }

    public void setRoupa(Roupas bermuda) {
        this.roupa = bermuda;
    }

    public static Bermuda createBermuda() {

        Scanner scan = new Scanner(System.in);
        try {
            Bermuda bermuda = new Bermuda();
            bermuda.roupa.setRoupa();
            System.out.println("Informe o Tipo de Corte da Bermuda: ");
            bermuda.setTipoCorte(scan.nextLine());
            System.out.println("Informe se a Bermuda tem Elástico: ");
            bermuda.setElastico(Boolean.parseBoolean(scan.nextLine()));
            return bermuda;
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
            return createBermuda();
        }
    }

    public void printBermuda() {
        this.roupa.printRoupa();
        System.out.println("Tipo de Corte da Bermuda: " + getTipoCorte());
        System.out.println("Elástico: " + isElastico() + "\n");
    }

    public static void list(Bermuda bermuda, int index) {
        System.out.println(
                "Bermuda " + (index + 1) + " Corte: " + bermuda.getTipoCorte() + " Elástico" + bermuda.isElastico());
    }

    public static final String STRING = " BERMUDA ";
    public static final String STRINGS_CADASTRADAS = "BERMUDAS CADASTRADAS:\n";
    public static final String STRING_NAO_CADASTRADA = "BERMUDA NÃO CADASTRADA\n";
    public static final String NENHUMA_STRING_CADASTRADA = "NENHUMA BERMUDA CADASTRADA\n";
    public static final String INFORME_STRING_DA_COMPRA = "\n\nInforme a Bermuda da Compra:";
    public static final String INFORME_STRING_DA_VENDA = "\n\nInforme a Bermuda da Venda:";
    public static final String INFORME_STRING_PARA_ALTERAR = "\n\nInforme a Bermuda para Alterar:";
    public static final String INFORME_STRING_DA_COMPRA_ALTERAR = "\n\nInforme a Bermuda da Compra para Alterar:";
    public static final String INFORME_STRING_DA_VENDA_ALTERAR = "\n\nInforme a Bermuda da Venda para Alterar:";
    public static final String INFORME_STRING_PARA_DELETAR = "\n\nInforme a Bermuda para Deletar:";
}
