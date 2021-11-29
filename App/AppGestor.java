package App;

import Produtos.*;
import Clientes_e_Fornecedores.*;
import Menus.MenuProduto;
import Menus.Menus;
import Transacoes.Compras;
import Transacoes.Vendas;
import e.commerce.Enum;
import e.commerce.Metodos;

import java.util.Scanner;

public class AppGestor {

    public static void appGestor(Produtos produtos, Fornecedores fornecedores, Clientes clientes, Compras compras,
            Vendas vendas) {

        Scanner scan = new Scanner(System.in);
        String escolhas[];
        int index;

        do {

            escolhas = Menus.abrir();

            try {
                switch (escolhas[0]) {

                    case Enum.CADASTRAR:

                        switch (escolhas[1]) {

                            case Camisa.STRING:
                                produtos.camisas.add(Camisa.createCamisa());
                                break;

                            case Bermuda.STRING:
                                produtos.bermudas.add(Bermuda.createBermuda());
                                break;

                            case Bone.STRING:
                                produtos.bones.add(Bone.createBone());
                                break;

                            case Tenis.STRING:
                                produtos.tenis.add(Tenis.createTenis());
                                break;

                            case Fornecedores.STRING:
                                fornecedores.cadastrar();
                                break;

                            case Clientes.STRING:
                                clientes.cadastrar();
                                break;

                            case Compras.STRING:

                                System.out.println(Enum.LINHA);
                                System.out.println(Produtos.INFORME_STRING_DA_COMPRA);
                                String compra = MenuProduto.abrir(Compras.STRING_DE);

                                switch (compra) {

                                    case Camisa.STRING:
                                        if (!produtos.camisas.isEmpty()) {
                                            produtos.camisas.forEach((camisa) -> {
                                                Camisa.list(camisa,
                                                        produtos.camisas.indexOf(camisa));
                                            });
                                            System.out.println(Camisa.INFORME_STRING_DA_COMPRA);
                                            index = Integer.parseInt(scan.nextLine());
                                            if (index <= produtos.camisas.size()) {
                                                compras.cadastrar(Camisa.STRING,
                                                        fornecedores.fornecedores,
                                                        produtos.camisas.get(index - 1).getPreco());
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
                                                Bermuda.list(bermuda,
                                                        produtos.bermudas.indexOf(bermuda));
                                            });
                                            System.out.println(Bermuda.INFORME_STRING_DA_COMPRA);
                                            index = Integer.parseInt(scan.nextLine());
                                            if (index <= produtos.bermudas.size()) {
                                                compras.cadastrar(Bermuda.STRING,
                                                        fornecedores.fornecedores,
                                                        produtos.bermudas.get(index - 1)
                                                                .getPreco());
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
                                            System.out.println(Bone.INFORME_STRING_DA_COMPRA);
                                            index = Integer.parseInt(scan.nextLine());
                                            if (index <= produtos.bones.size()) {
                                                compras.cadastrar(Bone.STRING,
                                                        fornecedores.fornecedores,
                                                        produtos.bones.get(index - 1).getPreco());
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
                                            System.out.println(Tenis.INFORME_STRING_DA_COMPRA);
                                            index = Integer.parseInt(scan.nextLine());
                                            if (index <= produtos.tenis.size()) {
                                                compras.cadastrar(Tenis.STRING,
                                                        fornecedores.fornecedores,
                                                        produtos.tenis.get(index - 1).getPreco());
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

                            case Vendas.STRING:

                                System.out.println(Enum.LINHA);
                                System.out.println(Produtos.INFORME_STRING_DA_VENDA);
                                String venda = MenuProduto.abrir(Vendas.STRING_DE);

                                switch (venda) {

                                    case Camisa.STRING:
                                        if (!produtos.camisas.isEmpty()) {
                                            produtos.camisas.forEach((camisa) -> {
                                                Camisa.list(camisa,
                                                        produtos.camisas.indexOf(camisa));
                                            });
                                            System.out.println(Camisa.INFORME_STRING_DA_VENDA);
                                            index = Integer.parseInt(scan.nextLine());
                                            if (index <= produtos.camisas.size()) {
                                                vendas.cadastrar(Camisa.STRING, clientes.clientes,
                                                        produtos.camisas.get(index - 1).getPreco());
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
                                                Bermuda.list(bermuda,
                                                        produtos.bermudas.indexOf(bermuda));
                                            });
                                            System.out.println(Bermuda.INFORME_STRING_DA_VENDA);
                                            index = Integer.parseInt(scan.nextLine());
                                            if (index <= produtos.bermudas.size()) {
                                                vendas.cadastrar(Bermuda.STRING, clientes.clientes,
                                                        produtos.bermudas.get(index - 1)
                                                                .getPreco());
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
                                            System.out.println(Bone.INFORME_STRING_DA_VENDA);
                                            index = Integer.parseInt(scan.nextLine());
                                            if (index <= produtos.bones.size()) {
                                                vendas.cadastrar(Bone.STRING, clientes.clientes,
                                                        produtos.bones.get(index - 1).getPreco());
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
                                            System.out.println(Tenis.INFORME_STRING_DA_VENDA);
                                            index = Integer.parseInt(scan.nextLine());
                                            if (index <= produtos.tenis.size()) {
                                                vendas.cadastrar(Tenis.STRING, clientes.clientes,
                                                        produtos.tenis.get(index - 1).getPreco());
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
                        break;

                    case Enum.EXIBIR:

                        switch (escolhas[1]) {

                            case Produtos.STRING:
                                produtos.print();
                                break;

                            case Fornecedores.STRING:
                                fornecedores.print();
                                break;

                            case Clientes.STRING:
                                clientes.print();
                                break;

                            case Compras.STRING:
                                compras.print();
                                break;

                            case Vendas.STRING:
                                vendas.print();
                                break;
                        }
                        break;

                    case Enum.ALTERAR:

                        switch (escolhas[1]) {

                            case Camisa.STRING:
                                if (!produtos.camisas.isEmpty()) {
                                    produtos.camisas.forEach((camisa) -> {
                                        Camisa.list(camisa, produtos.camisas.indexOf(camisa));
                                    });
                                    System.out.println(Camisa.INFORME_STRING_PARA_ALTERAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtos.camisas.size()) {
                                        Metodos.alterar(produtos.camisas, index,
                                                Camisa.createCamisa());
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
                                        Metodos.alterar(produtos.bermudas, index,
                                                Bermuda.createBermuda());
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
                                        Metodos.alterar(produtos.bones, index, Bone.createBone());
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
                                        Metodos.alterar(produtos.tenis, index, Tenis.createTenis());
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Tenis.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Tenis.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Fornecedores.STRING:
                                if (!fornecedores.fornecedores.isEmpty()) {
                                    fornecedores.fornecedores.forEach((fornecedor) -> {
                                        Fornecedores.list(fornecedor,
                                                fornecedores.fornecedores.indexOf(fornecedor));
                                    });
                                    System.out.println(Fornecedores.INFORME_STRING_PARA_ALTERAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= fornecedores.fornecedores.size()) {
                                        Metodos.alterar(fornecedores.fornecedores, index,
                                                Fornecedores.createFornecedor());
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Fornecedores.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Fornecedores.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Clientes.STRING:
                                if (!clientes.clientes.isEmpty()) {
                                    clientes.clientes.forEach((cliente) -> {
                                        Clientes.list(cliente, clientes.clientes.indexOf(cliente));
                                    });
                                    System.out.println(Clientes.INFORME_STRING_PARA_ALTERAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= clientes.clientes.size()) {
                                        Metodos.alterar(clientes.clientes, index,
                                                Clientes.createCliente());
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Clientes.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Clientes.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Compras.STRING:
                                if (compras.getSizeCompras() != 0) {
                                    compras.list();
                                    System.out.println(Compras.INFORME_STRING_PARA_ALTERAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= compras.getSizeCompras()) {
                                        System.out.println(Produtos.INFORME_STRING_DA_COMPRA_ALTERAR);
                                        String compra = MenuProduto.abrir(Compras.STRING_DE);

                                        switch (compra) {

                                            case Camisa.STRING:
                                                if (!produtos.camisas.isEmpty()) {
                                                    produtos.camisas.forEach((camisa) -> {
                                                        Camisa.list(camisa, produtos.camisas.indexOf(camisa));
                                                    });
                                                    System.out.println(Camisa.INFORME_STRING_DA_COMPRA_ALTERAR);
                                                    index = Integer.parseInt(scan.nextLine());
                                                    Metodos.alterar(compras.getCompras(), index,
                                                            compras.cadastrar(Camisa.STRING,
                                                                    fornecedores.fornecedores,
                                                                    produtos.camisas.get(index - 1)
                                                                            .getPreco()));
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
                                                    System.out.println(Bermuda.INFORME_STRING_DA_COMPRA_ALTERAR);
                                                    index = Integer.parseInt(scan.nextLine());
                                                    Metodos.alterar(compras.getCompras(), index,
                                                            compras.cadastrar(Bermuda.STRING, fornecedores.fornecedores,
                                                                    produtos.bermudas.get(index - 1).getPreco()));
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
                                                    System.out.println(Bone.INFORME_STRING_DA_COMPRA_ALTERAR);
                                                    index = Integer.parseInt(scan.nextLine());
                                                    Metodos.alterar(compras.getCompras(), index,
                                                            compras.cadastrar(Bone.STRING, fornecedores.fornecedores,
                                                                    produtos.bones.get(index - 1).getPreco()));
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
                                                    System.out.println(Tenis.INFORME_STRING_DA_COMPRA_ALTERAR);
                                                    index = Integer.parseInt(scan.nextLine());
                                                    Metodos.alterar(compras.getCompras(), index,
                                                            compras.cadastrar(Tenis.STRING, fornecedores.fornecedores,
                                                                    produtos.tenis.get(index - 1).getPreco()));
                                                } else {
                                                    System.out.println(Enum.LINHA);
                                                    System.out.println(Tenis.NENHUMA_STRING_CADASTRADA);
                                                }
                                                break;
                                        }
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Compras.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Compras.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Vendas.STRING:
                                if (vendas.getSizeVendas() != 0) {
                                    vendas.print();
                                    System.out.println(Vendas.INFORME_STRING_PARA_ALTERAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= vendas.getSizeVendas()) {
                                        System.out.println(Produtos.INFORME_STRING_DA_VENDA_ALTERAR);
                                        String venda = MenuProduto.abrir(Vendas.STRING_DE);

                                        switch (venda) {

                                            case Camisa.STRING:
                                                if (!produtos.camisas.isEmpty()) {
                                                    produtos.camisas.forEach((camisa) -> {
                                                        Camisa.list(camisa, produtos.camisas.indexOf(camisa));
                                                    });
                                                    System.out.println(Camisa.INFORME_STRING_DA_VENDA_ALTERAR);
                                                    index = Integer.parseInt(scan.nextLine());
                                                    if (index <= produtos.camisas.size()) {
                                                        Metodos.alterar(vendas.getVendas(), index,
                                                                vendas.cadastrar(Camisa.STRING, clientes.clientes,
                                                                        produtos.camisas.get(index - 1).getPreco()));
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
                                                    System.out.println(Bermuda.INFORME_STRING_DA_VENDA_ALTERAR);
                                                    index = Integer.parseInt(scan.nextLine());
                                                    if (index <= produtos.bermudas.size()) {
                                                        Metodos.alterar(vendas.getVendas(), index,
                                                                vendas.cadastrar(Bermuda.STRING, clientes.clientes,
                                                                        produtos.bermudas.get(index - 1).getPreco()));
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
                                                    System.out.println(Bone.INFORME_STRING_DA_VENDA_ALTERAR);
                                                    index = Integer.parseInt(scan.nextLine());
                                                    if (index <= produtos.bones.size()) {
                                                        Metodos.alterar(vendas.getVendas(), index,
                                                                vendas.cadastrar(Bone.STRING, clientes.clientes,
                                                                        produtos.bones.get(index - 1).getPreco()));
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
                                                    System.out.println(Tenis.INFORME_STRING_DA_VENDA_ALTERAR);
                                                    index = Integer.parseInt(scan.nextLine());
                                                    if (index <= produtos.tenis.size()) {
                                                        Metodos.alterar(vendas.getVendas(), index,
                                                                vendas.cadastrar(Tenis.STRING, clientes.clientes,
                                                                        produtos.tenis.get(index - 1).getPreco()));
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
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Vendas.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Vendas.NENHUMA_STRING_CADASTRADA);
                                }
                                break;
                        }
                        break;

                    case Enum.DELETAR:

                        switch (escolhas[1]) {

                            case Camisa.STRING:
                                if (!produtos.camisas.isEmpty()) {
                                    produtos.camisas.forEach((camisa) -> {
                                        Camisa.list(camisa, produtos.camisas.indexOf(camisa));
                                    });
                                    System.out.println(Camisa.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtos.camisas.size()) {
                                        Metodos.deletar(produtos.camisas, index);
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
                                    System.out.println(Bermuda.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtos.bermudas.size()) {
                                        Metodos.deletar(produtos.bermudas, index);
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
                                    System.out.println(Bone.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtos.bones.size()) {
                                        Metodos.deletar(produtos.bones, index);
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
                                    System.out.println(Tenis.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= produtos.tenis.size()) {
                                        Metodos.deletar(produtos.tenis, index);
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Tenis.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Tenis.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Fornecedores.STRING:
                                if (!fornecedores.fornecedores.isEmpty()) {
                                    fornecedores.fornecedores.forEach((fornecedor) -> {
                                        Fornecedores.list(fornecedor,
                                                fornecedores.fornecedores.indexOf(fornecedor));
                                    });
                                    System.out.println(Fornecedores.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= fornecedores.fornecedores.size()) {
                                        Metodos.deletar(fornecedores.fornecedores, index);
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Fornecedores.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Fornecedores.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Clientes.STRING:
                                if (!clientes.clientes.isEmpty()) {
                                    clientes.clientes.forEach((cliente) -> {
                                        Clientes.list(cliente, clientes.clientes.indexOf(cliente));
                                    });
                                    System.out.println(Clientes.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= clientes.clientes.size()) {
                                        Metodos.deletar(fornecedores.fornecedores, index);
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Clientes.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Clientes.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Compras.STRING:
                                if (compras.getSizeCompras() != 0) {
                                    compras.list();
                                    System.out.println(Compras.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= compras.getSizeCompras()) {
                                        Metodos.deletar(compras.getCompras(), index);
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Compras.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Compras.NENHUMA_STRING_CADASTRADA);
                                }
                                break;

                            case Vendas.STRING:
                                if (vendas.getSizeVendas() != 0) {
                                    vendas.print();
                                    System.out.println(Vendas.INFORME_STRING_PARA_DELETAR);
                                    index = Integer.parseInt(scan.nextLine());
                                    if (index <= vendas.getSizeVendas()) {
                                        Metodos.deletar(vendas.getVendas(), index);
                                    } else {
                                        System.out.println(Enum.LINHA);
                                        System.out.println(Vendas.STRING_NAO_CADASTRADA);
                                    }
                                } else {
                                    System.out.println(Enum.LINHA);
                                    System.out.println(Vendas.NENHUMA_STRING_CADASTRADA);
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
