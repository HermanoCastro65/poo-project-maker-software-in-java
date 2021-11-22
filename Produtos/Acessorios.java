package Produtos;

import java.util.Scanner;

public class Acessorios extends Produtos{
    
    private String material;
    private String qualidade;

    public Acessorios() {
    }

    public Acessorios(String material, String qualidade) {
        this.material = material;
        this.qualidade = qualidade;
    }

    public Acessorios(String material, String qualidade, int tamanho, double preco, String marca, String tipo, String cor, String codigo) {
        super(tamanho, preco, marca, tipo, cor, codigo);
        this.material = material;
        this.qualidade = qualidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }
    
    public void setAcessorio(){
        
        Scanner scan = new Scanner(System.in);
        
        super.setProduto();
        System.out.println("Informe o Material do Acessório: ");
        setMaterial(scan.nextLine());
        System.out.println("Informe a Qualidade do Acessório: ");
        setQualidade(scan.nextLine());
    }
    
    public void printAcessorio(){    
        super.printProduto();
        System.out.println("Material do Acessório: " + getMaterial());
        System.out.println("Qualidade do Acessório: " + getQualidade());
    }
    
}
