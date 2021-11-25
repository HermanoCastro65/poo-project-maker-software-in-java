package e.commerce;

import Produtos.*;
import Clientes_e_Fornecedores.Clientes;
import Clientes_e_Fornecedores.Fornecedores;
import Produtos.Camisa;
import Transacoes.Compras;
import Transacoes.Vendas;
import e.commerce.Menus.Menus;
import e.commerce.Menus.MenuProduto;
import java.util.Scanner;

public class ECommerce {

    Produtos produtos = new Produtos();
    Fornecedores fornecedores = new Fornecedores();
    Clientes clientes = new Clientes();
    Compras compras = new Compras();
    Vendas vendas = new Vendas();

    public void ECommerce() {

        String[] escolhas = new String[2];
        Scanner scan = new Scanner(System.in);

        do {

            escolhas = Menus.Abrir();
            int index;

            try {
                switch (escolhas[0]) {

                case "CADASTRAR":

                    switch (escolhas[1]) {

                    case "CASMISA":
                        produtos.camisas.add(Camisa.createCamisa());
                        break;

                    case "BERMUDA":
                        produtos.bermudas.add(Bermuda.createBermuda());
                        break;

                    case "BONE":
                        produtos.bones.add(Bone.createBone());
                        break;

                    case "TENIS":
                        produtos.tenis.add(Tenis.createTenis());
                        break;

                    case "FORNECEDOR":
                        fornecedores.Cadastrar();
                        break;

                    case "CLIENTE":
                        clientes.Cadastrar();
                        break;

                    case "COMPRA":

                        System.out.println("\n--------------------------------------------\n");
                        System.out.println("Informe o Produto da Compra:");
                        String compra = MenuProduto.Abrir("COMPRA DE");

                        switch (compra) {
                        case "CASMISA":
                            produtos.camisas.forEach((camisa) -> {
                                Camisa.print(camisa, produtos.camisas.indexOf(camisa));
                            });
                            System.out.println("\n\nInforme a Camisa da Compra:");
                            index = Integer.parseInt(scan.nextLine());
                            compras.Cadastrar("Camisa", fornecedores.fornecedores,
                                    produtos.camisas.get(index - 1).getPreco());
                            break;

                        case "BERMUDA":
                            produtos.bermudas.forEach((bermuda) -> {
                                Bermuda.print(bermuda, produtos.bermudas.indexOf(bermuda));
                            });
                            System.out.println("\n\nInforme a Bermuda da Compra:");
                            index = Integer.parseInt(scan.nextLine());
                            compras.Cadastrar("Bermuda", fornecedores.fornecedores,
                                    produtos.bermudas.get(index - 1).getPreco());
                            break;

                        case "BONE":
                            produtos.bones.forEach((bone) -> {
                                Bone.print(bone, produtos.bones.indexOf(bone));
                            });
                            System.out.println("\n\nInforme o Boné da Compra:");
                            index = Integer.parseInt(scan.nextLine());
                            compras.Cadastrar("Boné", fornecedores.fornecedores,
                                    produtos.bones.get(index - 1).getPreco());
                            break;

                        case "TENIS":
                            produtos.tenis.forEach((tenis) -> {
                                Tenis.print(tenis, produtos.tenis.indexOf(tenis));
                            });
                            System.out.println("\n\nInforme o Tenis da Compra:");
                            index = Integer.parseInt(scan.nextLine());
                            compras.Cadastrar("Tenis", fornecedores.fornecedores,
                                    produtos.tenis.get(index - 1).getPreco());
                            break;
                        }
                    case "VENDA":

                        System.out.println("\n--------------------------------------------\n");
                        System.out.println("Informe o Produto da Venda:");
                        String venda = MenuProduto.Abrir("COMPRA DE");

                        switch (venda) {
                        case "CASMISA":
                            produtos.camisas.forEach((camisa) -> {
                                Camisa.print(camisa, produtos.camisas.indexOf(camisa));
                            });
                            System.out.println("\n\nInforme a Camisa da Venda:");
                            index = Integer.parseInt(scan.nextLine());
                            vendas.Cadastrar("Camisa", clientes.clientes, produtos.camisas.get(index - 1).getPreco());
                            break;

                        case "BERMUDA":
                            produtos.bermudas.forEach((bermuda) -> {
                                Bermuda.print(bermuda, produtos.bermudas.indexOf(bermuda));
                            });
                            System.out.println("\n\nInforme a Bermuda da Venda:");
                            index = Integer.parseInt(scan.nextLine());
                            vendas.Cadastrar("Bermuda", clientes.clientes, produtos.bermudas.get(index - 1).getPreco());
                            break;

                        case "BONE":
                            produtos.bones.forEach((bone) -> {
                                Bone.print(bone, produtos.bones.indexOf(bone));
                            });
                            System.out.println("\n\nInforme o Boné da Venda:");
                            index = Integer.parseInt(scan.nextLine());
                            vendas.Cadastrar("Boné", clientes.clientes, produtos.bones.get(index - 1).getPreco());
                            break;

                        case "TENIS":
                            produtos.tenis.forEach((tenis) -> {
                                Tenis.print(tenis, produtos.tenis.indexOf(tenis));
                            });
                            System.out.println("\n\nInforme o Tenis da Venda:");
                            index = Integer.parseInt(scan.nextLine());
                            vendas.Cadastrar("Tenis", clientes.clientes, produtos.tenis.get(index - 1).getPreco());
                            break;
                        }
                        break;
                    }
                    break;

                case "EXIBIR":

                    switch (escolhas[1]) {

                    case "PRODUTO":
                        produtos.Print();
                        break;

                    case "FORNECEDOR":
                        fornecedores.Print();
                        break;

                    case "CLIENTE":
                        clientes.Print();
                        break;

                    case "COMPRA":
                        compras.Print();
                        break;

                    case "VENDA":
                        vendas.Print();
                        break;
                    }
                    break;

                case "ALTERAR":

                    switch (escolhas[1]) {

                    case "CASMISA":
                        produtos.bermudas.forEach((bermuda) -> {
                            Bermuda.print(bermuda, produtos.bermudas.indexOf(bermuda));
                        });
                        System.out.println("\n\nInforme a Camisa para Alterar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.alterar(produtos.camisas, index, Camisa.createCamisa());
                        break;

                    case "BERMUDA":
                        produtos.bermudas.forEach((bermuda) -> {
                            Bermuda.print(bermuda, produtos.bermudas.indexOf(bermuda));
                        });
                        System.out.println("\n\nInforme a Bermuda para Alterar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.alterar(produtos.bermudas, index, Bermuda.createBermuda());
                        break;

                    case "BONE":
                        produtos.bones.forEach((bone) -> {
                            Bone.print(bone, produtos.bones.indexOf(bone));
                        });
                        System.out.println("\n\nInforme o Boné para Alterar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.alterar(produtos.bones, index, Bone.createBone());
                        break;

                    case "TENIS":
                        produtos.tenis.forEach((tenis) -> {
                            Tenis.print(tenis, produtos.tenis.indexOf(tenis));
                        });
                        System.out.println("\n\nInforme o Tenis para Alterar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.alterar(produtos.tenis, index, Tenis.createTenis());
                        break;

                    case "FORNECEDOR":
                        fornecedores.fornecedores.forEach((fornecedor) -> {
                            Fornecedores.print(fornecedor, fornecedores.fornecedores.indexOf(fornecedor));
                        });
                        System.out.println("\n\nInforme o Fornecedor para Alterar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.alterar(fornecedores.fornecedores, index, Fornecedores.createFornecedor());
                        break;

                    case "CLIENTE":
                        clientes.clientes.forEach((cliente) -> {
                            Clientes.print(cliente, clientes.clientes.indexOf(cliente));
                        });
                        System.out.println("\n\nInforme o Cliente para Alterar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.alterar(clientes.clientes, index, Clientes.createCliente());
                        break;

                    case "COMPRA":
                        break;

                    case "VENDA":
                        break;
                    }
                    break;

                case "DELETAR":

                    switch (escolhas[1]) {

                    case "CASMISA":
                        produtos.camisas.forEach((camisa) -> {
                            Camisa.print(camisa, produtos.camisas.indexOf(camisa));
                        });
                        System.out.println("\n\nInforme a Camisa para Deletar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.deletar(produtos.camisas, index);
                        break;

                    case "BERMUDA":
                        produtos.bermudas.forEach((bermuda) -> {
                            Bermuda.print(bermuda, produtos.bermudas.indexOf(bermuda));
                        });
                        System.out.println("\n\nInforme a Bermuda para Deletar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.deletar(produtos.bermudas, index);
                        break;

                    case "BONE":
                        produtos.bones.forEach((bone) -> {
                            Bone.print(bone, produtos.bones.indexOf(bone));
                        });
                        System.out.println("\n\nInforme o Boné para Deletar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.deletar(produtos.bones, index);
                        break;

                    case "TENIS":
                        produtos.tenis.forEach((tenis) -> {
                            Tenis.print(tenis, produtos.tenis.indexOf(tenis));
                        });
                        System.out.println("\n\nInforme o Tenis para Deletar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.deletar(produtos.tenis, index);
                        break;

                    case "FORNECEDOR":
                        fornecedores.fornecedores.forEach((fornecedor) -> {
                            Fornecedores.print(fornecedor, fornecedores.fornecedores.indexOf(fornecedor));
                        });
                        System.out.println("\n\nInforme o Fornecedor para Deletar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.deletar(fornecedores.fornecedores, index);
                        break;

                    case "CLIENTE":
                        clientes.clientes.forEach((cliente) -> {
                            Clientes.print(cliente, clientes.clientes.indexOf(cliente));
                        });
                        System.out.println("\n\nInforme o Cliente para Deletar:");
                        index = Integer.parseInt(scan.nextLine());
                        Metodos.deletar(fornecedores.fornecedores, index);
                        break;

                    case "COMPRA":
                        break;

                    case "VENDA":
                        break;
                    }
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("\nERRO: " + e);
            }
        } while (escolhas != null);

    }

    public static void main(String[] args) {
        ECommerce ecommerce = new ECommerce();
        ecommerce.ECommerce();
    }

}
