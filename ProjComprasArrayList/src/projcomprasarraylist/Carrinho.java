package projcomprasarraylist;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> listaDeProduto;

    public Carrinho() {
        this.listaDeProduto = new ArrayList<>();
    }

    public ArrayList<Produto> getListaDeProduto() {
        return listaDeProduto;
    }

    public void setListaDeProduto(ArrayList<Produto> listaDeProduto) {
        this.listaDeProduto = listaDeProduto;
    }

    public String mostrarTodosOsProdutos() {
        String produtos = "┌-----------------------------┐\n"
                + "│Lista de produtos no carrinho│\n"
                + "└-----------------------------┘\n";
        for (int i = 0; i < this.listaDeProduto.size(); i++) {
            produtos += "\n┌---------┐\n"
                    + "│PRODUTO " + (i + 1) + "│\n"
                    + "└---------┘" + this.listaDeProduto.get(i) + "\n";
        }
        return produtos;
    }

    public double calcularVenda() {
        double valorTotal = 0;
        for (int i = 0; i < this.listaDeProduto.size(); i++) {
            valorTotal += this.listaDeProduto.get(i).getValor();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "\n"
                + "Lista de Produto: " + this.mostrarTodosOsProdutos();
    }

}
