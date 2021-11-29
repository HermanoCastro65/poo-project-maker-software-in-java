package App;

import java.util.Scanner;

import Menus.MenuCliente;
import Produtos.Bermuda;
import Produtos.Bone;
import Produtos.Camisa;
import Produtos.Produtos;
import Produtos.Tenis;
import e.commerce.Enum;
import e.commerce.Metodos;

public class AppCliente {

    public static void appCliente(Produtos produtos, Produtos produtosCliente) {

        Scanner scan = new Scanner(System.in);
        String escolhas[];
        int index;

        do {

            escolhas = MenuCliente.abrir();
            try {
                switch (escolhas[0]) {

                    case Enum.COMPRAR:

                        switch (escolhas[1]) {

                            case Camisa.STRING:
                                if (!produtos.camisas.isEmpty()) {
                                    produtos.camisas.forEach((camisa) -> {
                                        Camisa.list(camisa, produtos.camisas.indexOf(camisa));
                                    });
                                    System.out.println(Camisa.INFORME_STRING_PARA_ALTERAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtos.camisas.size()) {
                                        produtosCliente.camisas.add(produtos.camisas.get(index - 1));
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Camisa.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Camisa.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Bermuda.STRING:
                                if (!produtos.bermudas.isEmpty()) {
                                    produtos.bermudas.forEach((bermuda) -> {
                                        Bermuda.list(bermuda, produtos.bermudas.indexOf(bermuda));
                                    });
                                    System.out.println(Bermuda.INFORME_STRING_PARA_ALTERAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtos.bermudas.size()) {
                                        produtosCliente.bermudas.add(produtos.bermudas.get(index - 1));
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Bermuda.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Bermuda.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Bone.STRING:
                                if (!produtos.bones.isEmpty()) {
                                    produtos.bones.forEach((bone) -> {
                                        Bone.list(bone, produtos.bones.indexOf(bone));
                                    });
                                    System.out.println(Bone.INFORME_STRING_PARA_ALTERAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtos.bones.size()) {
                                        produtosCliente.bones.add(produtos.bones.get(index - 1));
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Bone.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Bone.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Tenis.STRING:
                                if (!produtos.tenis.isEmpty()) {
                                    produtos.tenis.forEach((tenis) -> {
                                        Tenis.list(tenis, produtos.tenis.indexOf(tenis));
                                    });
                                    System.out.println(Tenis.INFORME_STRING_PARA_ALTERAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtos.tenis.size()) {
                                        produtosCliente.tenis.add(produtos.tenis.get(index - 1));
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Tenis.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Tenis.NENHUMA_STRING_CADASTRADA);
                                }
                                break;
                        }
                        break;

                    case Enum.EXIBIR:
                        produtosCliente.print();
                        break;

                    case Enum.DELETAR:

                        switch (escolhas[1]) {

                            case Camisa.STRING:
                                if (!produtosCliente.camisas.isEmpty()) {
                                    produtosCliente.camisas.forEach((camisa) -> {
                                        Camisa.list(camisa, produtosCliente.camisas.indexOf(camisa));
                                    });
                                    System.out.println(Camisa.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtosCliente.camisas.size()) {
                                        Metodos.deletar(produtosCliente.camisas, index);
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Camisa.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Camisa.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Bermuda.STRING:
                                if (!produtosCliente.bermudas.isEmpty()) {
                                    produtosCliente.bermudas.forEach((bermuda) -> {
                                        Bermuda.list(bermuda, produtosCliente.bermudas.indexOf(bermuda));
                                    });
                                    System.out.println(Bermuda.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtosCliente.bermudas.size()) {
                                        Metodos.deletar(produtosCliente.bermudas, index);
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Bermuda.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Bermuda.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Bone.STRING:
                                if (!produtosCliente.bones.isEmpty()) {
                                    produtosCliente.bones.forEach((bone) -> {
                                        Bone.list(bone, produtosCliente.bones.indexOf(bone));
                                    });
                                    System.out.println(Bone.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtosCliente.bones.size()) {
                                        Metodos.deletar(produtosCliente.bones, index);
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Bone.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Bone.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Tenis.STRING:
                                if (!produtosCliente.tenis.isEmpty()) {
                                    produtosCliente.tenis.forEach((tenis) -> {
                                        Tenis.list(tenis, produtosCliente.tenis.indexOf(tenis));
                                    });
                                    System.out.println(Tenis.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtosCliente.tenis.size()) {
                                        Metodos.deletar(produtosCliente.tenis, index);
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Tenis.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Tenis.NENHUMA_STRING_CADASTRADA);
                                }
                                break;
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println(Enum.ERRO + e);
            }
        } while (escolhas[0] != Enum.SAIR);
    }
}
