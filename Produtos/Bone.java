package Produtos;

import java.util.Scanner;

public class Bone{
    
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

    public static Bone createBone(){
        
        Scanner scan = new Scanner(System.in);
        
        try{
            Bone bone = new Bone();
            bone.acessorio.setAcessorio();
            System.out.println("Informe o Tipo da Aba do Boné: ");
            bone.setTipoAba(scan.nextLine());
            System.out.println("Informe se o Boné tem Velcro: ");
            bone.setVelcro(Boolean.parseBoolean(scan.nextLine()));
            return bone;
        }catch(Exception e){
            System.out.println("Digite uma expressão válida!");
            return createBone();
        }
    }
    
    public void printBone(){
        this.acessorio.printAcessorio();
        System.out.println("Tipo da Aba do Boné: " + getTipoAba());
        System.out.println("Velcro: " + isVelcro() + "\n");
    }
    
}
