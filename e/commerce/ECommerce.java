package e.commerce;

import Produtos.*; 

public class ECommerce {
    public static void main(String[] args) {
        
        Produtos produtos = new Produtos();
        
        for(int i = 0; i < 3; i++){
            produtos.Cadastrar();
        }
        
        produtos.Print();
        
    }

}
