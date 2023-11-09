
package com.mycompany.pedido;

public class Main {

    public static void main(String[] args) {
        
        Pedido pedido = new Pedido();
        Produto produto = new Produto();
        Item[] itens = new Item[10];
        
        
        pedido.setNumero_pedido(1234567);
        
        pedido.getPessoa().setNome("Roberta Kamilly");
        pedido.getPessoa().setEmail("roohkmagalhaes@gmail.com");
        pedido.getPessoa().setEndereco("Rua: São Paulo, Nº: 78, Bairro: BNH, Cidade: Coxim - MS");
        pedido.getItens();
        produto.setNome("Papete");
        produto.setValor(189.99);
        
        System.out.println("Número do Pedido: " + pedido.getNumero_pedido());
        System.out.println("Nome do Cliente: " + pedido.getPessoa().getNome() + 
                "\nEmail do Cliente: " + pedido.getPessoa().getEmail() +
                "\nEndereço do Cliente: " + pedido.getPessoa().getEndereco());
        System.out.println("Produto: " + produto.getNome()+ 
                "\nValor do Produto: R$ " + produto.getValor());
        
        for(int i = 0; i < itens.length; i++){
           itens[i] = new Item();
           
        System.out.println(pedido.getItens()[i].getProduto().getNome());
        System.out.println(pedido.getItens()[i].getProduto().getValor());
            
        }
       
    }
    
}
