//Linha em branco
public class Produto {//Declara uma classe com o nome produto com visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
    private String nome; // Declara um atributo com o nome de "nome" do tipo String com sua visibilidade privada, ou seja, pode ser acessada apenas para a classe em que este atributo se encontra
    private String descricao; // Declara um atributo com o nome "descricao" do tipo String com sua visibilidade privada, ou seja, pode ser acessada apenas para a classe em que este atributo se encontra
    private double valorUnitario; // Declara um atributo com o nome "valorUnitario" do tipo double com sua visibilidade privada, ou seja, pode ser acessada apenas para a classe em que este atributo se encontra
    private int quantidade; // Declara um atributo com o nome "quantidade" do tipo int com sua visibilidade privada, ou seja, pode ser acessada apenas para a classe em que este atributo se encontra
//Linha em branco
    public void setNome(String nome){//Declara um método modificador setter com o nome de "setNome" e com o parâmetro "nome" do tipo String, não retorna e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        this.nome = nome;// O atributo "nome" recebe o que tem dentro do parâmetro do método modificador "setNome" que veio da classe Main através do objProduto.setNome(leia.next()); e armazena no atributo "nome" 
    }//Fecha o corpo do método modificador "setNome"
    public String getNome(){// Declara um método acessor getter com o nome de "getNome" sem parâmetro que retorna uma String e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        return this.nome;// Retorna o que tem dentro do atributo "nome" em uma saída de dados na classe Main dentro do System.out.println("Nome: "+objProduto.getNome());
    }//Fecha o corpo do método acessor "getNome"
    public void setDescricao(String descricao){//Declara um método modificador setter com o nome de "setDescricao" e com o parâmetro "descricao" do tipo String, não retorna e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        this.descricao = descricao;// O atributo "descricao" recebe o que tem dentro do parâmetro do método modificador "setDescricao" que veio da classe Main através do objProduto.setDescricao(leia.next()); e armazena no atributo "descricao" 
    }//Fecha o corpo do método modificador "setDescricao"
    public String getDescricao(){// Declara um método acessor getter com o nome de "getDescricao" sem parâmetro que retorna uma String e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        return this.descricao;// Retorna o que tem dentro do atributo "descricao" em uma saída de dados na classe Main dentro do System.out.println("Descrição: "+objProduto.getDescricao());
    }//Fecha o corpo do método acessor "getDescricao"
    public void setValorUnitario(double valorUnitario){//Declara um método modificador setter com o nome de "setValorUnitario" e com o parâmetro "valorUnitario" do tipo double, não retorna e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        this.valorUnitario = valorUnitario;// O atributo "valorUnitario" recebe o que tem dentro do parâmetro do método modificador "setValorUnitario" que veio da classe Main através do objProduto.setValorUnitario(leia.next()); e armazena no atributo "valorUnitario" 
    }//Fecha o corpo do método modificador "setValorUnitario"
    public double getValorUnitario(){// Declara um método acessor getter com o nome de "getValorUnitario" sem parâmetro que retorna um double e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        return this.valorUnitario;// Retorna o que tem dentro do atributo "valorUnitario" em uma saída de dados na classe Main dentro do System.out.println("Valor unitário: "+objProduto.getValorUnitario());
    }//Fecha o corpo do método acessor "getValorUnitario"
    public void setQuantidade(int quantidade){//Declara um método modificador setter com o nome de "setQuantidade" e com o parâmetro "quantidade" do tipo int, não retorna e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        this.quantidade=quantidade;// O atributo "quantidade" recebe o que tem dentro do parâmetro do método modificador "setQuantidade" que veio da classe Main através do objProduto.setQuantidade(leia.next()); e armazena no atributo "quantidade" 
    }//Fecha o corpo do método modificador "setQuantidade"
    public int getQuantidade(){// Declara um método acessor getter com o nome de "getQuantidade" sem parâmetro que retorna um int e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        return this.quantidade;// Retorna o que tem dentro do atributo "quantidade" em uma saída de dados na classe Main dentro do System.out.println("Quantidade: "+objProduto.getQuantidade());
    }//Fecha o corpo do método acessor "getQuantidade"
    public double calcularValorTotal(){// Declara um método com o nome de "calcularValorTotal" sem parâmetro que retorna um double e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        return this.valorUnitario*this.quantidade;// Retorna o cálculo do (atributo "valorUnitario" * atributo "quantidade) em uma saída de dados na classe Main dentro do System.out.println("Valor total: "+objProduto.calcularValorTotal());
    }//Fecha o corpo do método "calcularValorTotal()"
    public double calcularValorTotalComDesconto(double desconto){// Declara um método com o nome de "calcularValorTotalComDesconto" e com parâmetro "desconto" do tipo double que retorna um double e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        return this.calcularValorTotal()*(1-desconto/100.0);// Retorna o cálculo do método acessor "calcularValorTotal()" * (1-desconto/100.0) em uma saída de dados na classe Main dentro do System.out.println("Valor total com desconto: "+objProduto.calcularValorTotalComDesconto(desconto));
    }//Fecha o corpo do método "calcularValorTotalComDesconto(double desconto)"
}//Fecha o corpo da class Produto
