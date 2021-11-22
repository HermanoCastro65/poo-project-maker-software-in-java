package Produtos;

import java.util.Scanner;

public class Bermuda {
    
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
    
    public static Bermuda createBermuda(){   
        
        Scanner scan = new Scanner(System.in);
        
        try{
            Bermuda bermuda = new Bermuda();
            bermuda.roupa.setRoupa();
            System.out.println("Informe o Tipo de Corte da Bermuda: ");
            bermuda.setTipoCorte(scan.nextLine());
            System.out.println("Informe se a Bermuda tem Elástico: ");
            bermuda.setElastico(Boolean.parseBoolean(scan.nextLine()));
            return bermuda;
        }catch(Exception e){
            System.out.println("Digite uma expressão válida!");
            return createBermuda();
        }
    }
        
    public void printBermuda(){
        this.roupa.printRoupa();
        System.out.println("Tipo de Corte da Bermuda: " + getTipoCorte());
        System.out.println("Elástico: " + isElastico() + "\n");
    }
}
