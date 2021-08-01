import java.util.Scanner; //Importa a classe Scanner
//Linha em branco
public class Main {//Declara uma classe com o nome main com visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
//Linha em branco
    public static void main(String[] args) {// Declara um método com o nome "main", estático, ou seja, podendo chamar classes que sejam estática direto sem precisar criar um objeto, e com visibilidade pública que não retorna com parâmetro(String[] args)  
        Scanner leia = new Scanner(System.in); // Criar o objeto leia do tipo Scanner que passa como argumento o objeto System.in dentro construtor e permite que o usuário digite
        Produto objProduto = new Produto();// Criar o objeto objProduto
//Linha em branco
        System.out.println("Informe os dados do produto"); // O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
        System.out.print("Nome: "); //O método System.out.print() gera uma saída de texto entre aspas duplas significando uma String sem criar uma nova linha
        objProduto.setNome(leia.next());//Invoca através do objProduto o método modificador setter com o nome de "setNome" e passa o argumento para o parâmetro do método "setNome"
        System.out.print("Descrição: ");//O método System.out.print() gera uma saída de texto entre aspas duplas significando uma String sem criar uma nova linha
        objProduto.setDescricao(leia.next());//Invoca através do objProduto o método modificador setter com o nome de "setDescricao" e passa o argumento para o parâmetro do método "setDescricao"
        System.out.print("Valor unitário: ");//O método System.out.print() gera uma saída de texto entre aspas duplas significando uma String sem criar uma nova linha
        objProduto.setValorUnitario(leia.nextDouble());//Invoca através do objProduto o método modificador setter com o nome de "setValorUnitario" e passa o argumento para o parâmetro do método "setValorUnitario"
        System.out.print("Quantidade: ");//O método System.out.print() gera uma saída de texto entre aspas duplas significando uma String sem criar uma nova linha
        objProduto.setQuantidade(leia.nextInt());//Invoca através do objProduto o método modificador setter com o nome de "setQuantidade" e passa o argumento para o parâmetro do método "setQuantidade"
//Linha em branco
        System.out.print("Digite o valor do desconto: %");//O método System.out.print() gera uma saída de texto entre aspas duplas significando uma String e não pula linha
        double desconto = leia.nextDouble();//Declara uma variável com o nome "desconto" do tipo double que recebe o método leia.nextDouble() 
//Linha em branco        
//Linha em branco        
        System.out.println("\nDados do produto");// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha, o escape \n faz com que pule uma linha 
        System.out.println("Nome: "+objProduto.getNome());// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha, e invoca o método "getNome" através do objProduto e mostra os dados contidos dentro do método "getNome"
        System.out.println("Descrição: "+objProduto.getDescricao());// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha, e invoca o método "getDescricao" através do objProduto e mostra os dados contidos dentro do método "getDescricao"
        System.out.println("Valor unitário: "+objProduto.getValorUnitario());// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha, e invoca o método "getValorUnitario" através do objProduto e mostra os dados contidos dentro do método "getValorUnitario"
        System.out.println("Quantidade: "+objProduto.getQuantidade());// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha, e invoca o método "getQuantidade" através do objProduto e mostra os dados contidos dentro do método "getQuantidade"
        System.out.println("Valor total: "+objProduto.calcularValorTotal());// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha, e invoca o método "calcularValorTotal" através do objProduto e mostra os dados contidos dentro do método "calcularValorTotal"
        System.out.println("Valor total com desconto: "+objProduto.calcularValorTotalComDesconto(desconto));// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha concatenando com o método invocado "calcularValorTotalComDesconto" através do objProduto e passa o argumento (desconto) para o parâmetro do método "calcularValorTotalComDesconto(double desconto)"
    }//Fecha o corpo do método main
}//Fecha o corpo da classe Main
