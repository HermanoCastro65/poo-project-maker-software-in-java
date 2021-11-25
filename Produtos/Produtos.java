package Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {

    private int tamanho;
    private double preco;
    private String marca;
    private String tipo;
    private String cor;
    private String codigo;

    public ArrayList<Camisa> camisas = new ArrayList();
    public ArrayList<Bermuda> bermudas = new ArrayList();
    public ArrayList<Bone> bones = new ArrayList();
    public ArrayList<Tenis> tenis = new ArrayList();

    public Produtos() {
    }

    public Produtos(int tamanho, double preco, String marca, String tipo, String cor, String codigo) {
        this.tamanho = tamanho;
        this.preco = preco;
        this.marca = marca;
        this.tipo = tipo;
        this.cor = cor;
        this.codigo = codigo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setProduto() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o Código do Produto: ");
        setCodigo(scan.nextLine());
        System.out.println("Informe a Cor do Produto: ");
        setCor(scan.nextLine());
        System.out.println("Informe a Marca do Produto: ");
        setMarca(scan.nextLine());
        System.out.println("Informe o Preço do Produto: ");
        setPreco(Double.parseDouble(scan.nextLine()));
        System.out.println("Informe o Tamanho do Produto: ");
        setTamanho(Integer.parseInt(scan.nextLine()));
        System.out.println("Informe o Tipo do Produto: ");
        setTipo(scan.nextLine());
    }

    public void printProduto() {
        System.out.println("Código do Produto: " + getCodigo());
        System.out.println("Cor do Produto: " + getCor());
        System.out.println("Marca do Produto: " + getMarca());
        System.out.println("Preço do Produto: R$ " + String.format("%,.2f", getPreco()));
        System.out.println("Tamanho do Produto: " + getTamanho());
        System.out.println("Tipo do Produto: " + getTipo());
    }

    public void Cadastrar() {
        System.out.println("--------------------------------------------");
        System.out.println("ESCOLHA O PRODUTO");
        System.out.println("1 - CAMISA");
        System.out.println("2 - BERMUDA");
        System.out.println("3 - BONÉ");
        System.out.println("4 - TENIS");
        System.out.println("--------------------------------------------");

        Scanner scan = new Scanner(System.in);

        switch (Integer.parseInt(scan.nextLine())) {
        case 1:
            Camisa camisa = Camisa.createCamisa();
            camisas.add(camisa);
            break;
        case 2:
            Bermuda bermuda = Bermuda.createBermuda();
            bermudas.add(bermuda);
            break;
        case 3:
            Bone bone = Bone.createBone();
            bones.add(bone);
            break;
        case 4:
            Tenis tenisObj = Tenis.createTenis();
            tenis.add(tenisObj);
            break;
        }
    }

    public void Print() {

        if (!camisas.isEmpty()) {
            System.out.println("\n--------------------------------------------\n");
            camisas.forEach((camisa) -> {
                System.out.println("Camisa " + (camisas.lastIndexOf(camisa) + 1));
                camisa.printCamisa();
            });
        } else {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("NENHUMA CAMISAS CADASTRADA\n");
        }

        if (!bermudas.isEmpty()) {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("BERMUDAS CADASTRADAS:\n");
            bermudas.forEach((bermuda) -> {
                System.out.println("Bermuda " + (bermudas.lastIndexOf(bermuda) + 1));
                bermuda.printBermuda();
            });
        } else {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("NENHUMA BERMUDA CADASTRADA\n");
        }

        if (!bones.isEmpty()) {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("BONÉS CADASTRADOS:\n");
            bones.forEach((bone) -> {
                System.out.println("Boné " + (bones.lastIndexOf(bone) + 1));
                bone.printBone();
            });
        } else {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("NENHUM BONÉ CADASTRADO\n");
        }

        if (!tenis.isEmpty()) {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("TENIS CADASTRADOS:\n");
            tenis.forEach((tenisObj) -> {
                System.out.println("Bermuda " + (tenis.lastIndexOf(tenis) + 1));
                tenisObj.printTenis();
            });
        } else {
            System.out.println("\n--------------------------------------------\n");
            System.out.println("NENHUM TENIS CADASTRADO\n");
        }
    }
}
