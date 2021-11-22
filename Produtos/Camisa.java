package Produtos;

import java.util.Scanner;

public class Camisa{
    
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
    
    public static Camisa createCamisa(){   
        try{    
            Scanner scan = new Scanner(System.in);

            Camisa camisa = new Camisa();
            camisa.roupa.setRoupa();
            System.out.println("Informe o Tipo de Manga da Camisa: ");
            camisa.setTipoManga(scan.nextLine());
            System.out.println("Informe se a Camisa tem Gola: ");
            camisa.setGola(Boolean.parseBoolean(scan.nextLine()));
            return camisa;
        }catch(Exception e){
            System.out.println("Digite uma expressão válida!");
            return createCamisa();
        }
    
    }
    public void printCamisa(){
        this.roupa.printRoupa();
        System.out.println("Tipo de Manga de Camisa: " + getTipoManga());
        System.out.println("Gola: " + isGola() + "\n");
    }
    
}
