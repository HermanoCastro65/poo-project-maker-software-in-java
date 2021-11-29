package Produtos;

import java.util.ArrayList;
import java.util.Scanner;
import e.commerce.Enum;

public class Produtos {

    private int tamanho;
    private double preco;
    private String marca;
    private String tipo;
    private String cor;
    private String codigo;

    public ArrayList<Camisa> camisas = new ArrayList<Camisa>();
    public ArrayList<Bermuda> bermudas = new ArrayList<Bermuda>();
    public ArrayList<Bone> bones = new ArrayList<Bone>();
    public ArrayList<Tenis> tenis = new ArrayList<Tenis>();

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

        try {
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
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
            setProduto();
        }
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
        System.out.println(Enum.LINHA);
        System.out.println(ESCOLHA_PRODUTO);
        System.out.println("1 - " + Camisa.STRING);
        System.out.println("2 - " + Bermuda.STRING);
        System.out.println("3 - " + Bone.STRING);
        System.out.println("4 - " + Tenis.STRING);
        System.out.println(Enum.LINHA);

        Scanner scan = new Scanner(System.in);

        try {
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
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
            Cadastrar();
        }
    }

    public void print() {

        if (!camisas.isEmpty()) {
            System.out.println(Enum.LINHA);
            System.out.println(Camisa.STRINGS_CADASTRADAS);
            camisas.forEach((camisa) -> {
                System.out.println(Camisa.STRING + (camisas.lastIndexOf(camisa) + 1));
                camisa.printCamisa();
            });
        } else {
            System.out.println(Enum.LINHA);
            System.out.println(Camisa.NENHUMA_STRING_CADASTRADA);
        }

        if (!bermudas.isEmpty()) {
            System.out.println(Enum.LINHA);
            System.out.println(Bermuda.STRINGS_CADASTRADAS);
            bermudas.forEach((bermuda) -> {
                System.out.println(Bermuda.STRING + (bermudas.lastIndexOf(bermuda) + 1));
                bermuda.printBermuda();
            });
        } else {
            System.out.println(Enum.LINHA);
            System.out.println(Bermuda.NENHUMA_STRING_CADASTRADA);
        }

        if (!bones.isEmpty()) {
            System.out.println(Enum.LINHA);
            System.out.println(Bone.STRINGS_CADASTRADAS);
            bones.forEach((bone) -> {
                System.out.println(Bone.STRING + (bones.lastIndexOf(bone) + 1));
                bone.printBone();
            });
        } else {
            System.out.println(Enum.LINHA);
            System.out.println(Bone.NENHUMA_STRING_CADASTRADA);
        }

        if (!tenis.isEmpty()) {
            System.out.println(Enum.LINHA);
            System.out.println(Tenis.STRINGS_CADASTRADAS);
            tenis.forEach((tenisObj) -> {
                System.out.println(Tenis.STRING + (tenis.lastIndexOf(tenisObj) + 1));
                tenisObj.printTenis();
            });
        } else {
            System.out.println(Enum.LINHA);
            System.out.println(Tenis.NENHUMA_STRING_CADASTRADA);
        }
    }

    public static final String STRING = " PRODUTO ";
    public static final String INFORME_STRING_DA_COMPRA = "\n\nInforme o Produto da Compra:";
    public static final String INFORME_STRING_DA_VENDA = "\n\nInforme o Produto da Venda:";
    public static final String INFORME_STRING_DA_COMPRA_ALTERAR = "Informe o Produto da Compra para Alterar:";
    public static final String INFORME_STRING_DA_VENDA_ALTERAR = "Informe o Produto da Venda para Alterar:";
    public static final String ESCOLHA_PRODUTO = "ESCOLHA O PRODUTO:";
}