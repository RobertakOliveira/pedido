
package com.mycompany.pedido;

public class Item {
    private boolean selecionado;
    private Produto produto;

    public Item() {
        this.selecionado = true;
        produto = new Produto();
    }

    public boolean getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado = true;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public void selecionar(Boolean Item) {
        if(Item == true){
            System.out.println("Selecionado");
        }else
            System.out.println("Nenhum produto selecionado!");
        
    }
}
