package com.mycompany.pedido;

public class Pedido {
    private int numero_pedido;
    private Pessoa pessoa;
    private Item[] itens = new Item[10];
    
    public Pedido() {
        pessoa = new Pessoa();
        itens = new Item[10];
        
    }
    
    public void adicionarItem(Item item) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                return;
            }
        }
    }
    
    public void listarItem() {
        System.out.println("Número do Pedido: " + getNumero_pedido());
        for (Item item : itens) {
            if (item != null && item.getSelecionado()) {
                Produto produto = item.getProduto();
                System.out.println("Produto Selecionado - Nome: " + produto.getNome() +
                ", Valor: " + produto.getValor());
            }
        }
    }
    

    public int getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
   
}
