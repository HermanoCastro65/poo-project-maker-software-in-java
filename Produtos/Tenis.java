package Produtos;

import java.util.Scanner;

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
            System.out.println("\nERRO: " + e + "\nDIGITE UMA EXPRESSÃO VÁLIDA!\n");
            return createTenis();
        }
    }

    public void printTenis() {
        this.acessorio.printAcessorio();
        System.out.println("Tipo do Solado do Tenis: " + getTipoSolado());
        System.out.println("Cadarço: " + isCadarco() + "\n");
    }

    public static void print(Tenis tenis, int index) {
        System.out
                .println("Tenis " + (index + 1) + " Solado: " + tenis.getTipoSolado() + " Cadarço" + tenis.isCadarco());
    }
}
