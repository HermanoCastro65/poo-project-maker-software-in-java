package Produtos;

import java.util.Scanner;
import e.commerce.Enum;

public class Bone extends Produtos {

    private boolean velcro;
    private String tipoAba;

    private Acessorios acessorio = new Acessorios();

    public Bone() {
    }

    public Bone(boolean velcro, String tipoAba) {
        this.velcro = velcro;
        this.tipoAba = tipoAba;
    }

    public boolean isVelcro() {
        return velcro;
    }

    public void setVelcro(boolean velcro) {
        this.velcro = velcro;
    }

    public String getTipoAba() {
        return tipoAba;
    }

    public void setTipoAba(String tipoAba) {
        this.tipoAba = tipoAba;
    }

    public Acessorios getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorios bone) {
        this.acessorio = bone;
    }

    public static Bone createBone() {

        Scanner scan = new Scanner(System.in);
        try {
            Bone bone = new Bone();
            bone.acessorio.setAcessorio();
            System.out.println("Informe o Tipo da Aba do Boné: ");
            bone.setTipoAba(scan.nextLine());
            System.out.println("Informe se o Boné tem Velcro: ");
            bone.setVelcro(Boolean.parseBoolean(scan.nextLine()));
            return bone;
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
            return createBone();
        }
    }

    public void printBone() {
        this.acessorio.printAcessorio();
        System.out.println("Tipo da Aba do Boné: " + getTipoAba());
        System.out.println("Velcro: " + isVelcro() + "\n");
    }

    public static void list(Bone bone, int index) {
        System.out.println("Bone " + (index + 1) + " Aba: " + bone.getTipoAba() + " Velcro" + bone.isVelcro());
    }

    public static final String STRING = " BONÉ ";
    public static final String STRINGS_CADASTRADAS = "BONÉS CADASTRADOS:\n";
    public static final String STRING_NAO_CADASTRADA = "BONÉ NÃO CADASTRADO\n";
    public static final String NENHUMA_STRING_CADASTRADA = "NENHUM BONÉ CADASTRADO\n";
    public static final String INFORME_STRING_DA_COMPRA = "\n\nInforme o Boné da Compra:";
    public static final String INFORME_STRING_DA_VENDA = "\n\nInforme o Boné da Venda:";
    public static final String INFORME_STRING_PARA_ALTERAR = "\n\nInforme o Boné para Alterar:";
    public static final String INFORME_STRING_DA_COMPRA_ALTERAR = "\n\nInforme o Boné da Compra para Alterar:";
    public static final String INFORME_STRING_DA_VENDA_ALTERAR = "\n\nInforme o Boné da Venda para Alterar:";
    public static final String INFORME_STRING_PARA_DELETAR = "\n\nInforme o Boné para Deletar:";
}