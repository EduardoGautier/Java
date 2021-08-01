package projrevendacarroarraylist;// Diretório onde fica armazenado as classes deste programa
// Linha em branco
import java.util.ArrayList;// Importa a Classe ArrayList
// Linha em branco
public class Revenda {//Declara uma classe com o nome Revenda com visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
    private String nome;// Declara um atributo com o nome de "nome" do tipo String com sua visibilidade privada, ou seja, pode ser acessada apenas para a classe em que este atributo se encontra, ou pode ser usado para outras classes através de métodos getters e setters
    private long cnpj;// Declara um atributo com o nome de "cnpj" do tipo long com sua visibilidade privada, ou seja, pode ser acessada apenas para a classe em que este atributo se encontra, ou pode ser usado para outras classes através de métodos getters e setters
    private ArrayList<Carro> listaDeCarro;// Declara um atributo com o nome de "listaDeCarro" do tipo ArrayList<Carro> com sua visibilidade privada, ou seja, pode ser acessada apenas para a classe em que este atributo se encontra, ou pode ser usado para outras classes através de métodos getters e setters
    
    public Revenda(){// Método construtor
        this.listaDeCarro = new ArrayList<>();// Instância o atributo listaDeCarro
    }//Fecha o corpo do método construtor
//Linha em branco
    public String getNome() {// Declara um método acessor getter com o nome de "getNome" sem parâmetro que retorna uma String e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        return nome;// Retorna o que tem dentro do atributo "nome"
    }//Fecha o corpo do método acessesor getter
//Linha em branco
    public void setNome(String nome) {//Declara um método modificador setter com o nome de "setNome" e com o parâmetro "nome" do tipo String, não retorna e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        this.nome = nome;// O atributo "nome" recebe o que tem dentro do parâmetro do método modificador "setNome" que vem de um argumento da classe Main e armazena no atributo "nome" 
    }//Fecha o corpo do método modificador setter
//Linha em branco
    public long getCnpj() {// Declara um método acessor getter com o nome de "getCnpj" sem parâmetro que retorna um long e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        return cnpj;// Retorna o que tem dentro do atributo "cnpj"
    }//Fecha o corpo do método acessor getter
//Linha em branco
    public void setCnpj(long cnpj) {//Declara um método modificador setter com o nome de "setCnpj" e com o parâmetro "cnpj" do tipo long, não retorna e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        this.cnpj = cnpj;// O atributo "cnpj" recebe o que tem dentro do parâmetro do método modificador "setCnpj" que vem de um argumento da classe Main e armazena no atributo "cnpj"
    }//Fecha o corpo do método modificador setter
//Linha em branco
    public ArrayList<Carro> getListaDeCarro() {// Declara um método acessor getter com o nome de "getListaDeCarro" sem parâmetro que retorna um ArrayList<Carro> e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        return listaDeCarro;// Retorna o que tem dentro do atributo "listaDeCarro"
    }//Fecha o corpo do método acessor getter
//Linha em branco
    public void setListaDeCarro(ArrayList<Carro> listaDeCarro) {//Declara um método modificador setter com o nome de "setListaDeCarro" e com o parâmetro "listaDeCarro" do tipo ArrayList<Carro>, não retorna e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        this.listaDeCarro = listaDeCarro;// O atributo "listaDeCarro" recebe o que tem dentro do parâmetro do método modificador "setListaDeCarro" que vem de um argumento da classe Main e armazena no atributo "listaDeCarro"
    }//Fecha o corpo do método modificador setter
 //Linha em branco   
    public double calcularValor(){// Método que calcula o valor total que retorna um double, e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        double valorTotal = 0;// Declara uma variável com o nome de "valorTotal" do tipo double e inicializa ela com o valor 0
        for(int i = 0; i < this.listaDeCarro.size(); i++){// Estrutura de repetição que percorre o ArrayList desde a posição 0, e quando a posição for maior que o tamanho da this.listaDeCarro.size() ele para de percorrer
            valorTotal+= this.listaDeCarro.get(i).getValor();// Variável "valorTotal" que vai acumular o valor de cada carro que estiver cadastrado no this.listaDeCarro.get(i).getValor()
        }//Fecha o corpo da estrutura de repetição
        return valorTotal;// Retorna o valor da variável "valorTotal" e para o método calcularValor()
    }//Fecha o corpo do método calcularValor()
//Linha em branco
    public String mostrarTodosOsCarros(){// Método que retorna uma String, e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        String carros = "::::: Lista de carros :::::\n";// Declara uma variável com o nome de "carros" do tipo String e faz ela receber uma String "::::: Lista de carros :::::\n"
        for (int i = 0; i < this.listaDeCarro.size(); i++){// Estrutura de repetição que percorre o ArrayList desde a posição 0, e quando a posição for maior que o tamanho da this.listaDeCarro.size() ele para de percorrer
            carros += "\n\n::::: Carro "+(i+1)+" :::::"+this.listaDeCarro.get(i);// Variável "carros" que vai acumular String + a posição no ArrayList + os dados do carro
        }//Fecha o corpo da estrutura de repetição
        return carros;// Retorna o valor da variável "carros" e para o método mostrarTodosOsCarros()
    }//Fecha o corpo do método mostrarTodosOsCarros()
 //Linha em branco
    public Carro pesquisarCarroPorPlaca(String placa){// Método que retorna um Carro com o nome de "pesquisarCarroPorPlaca" com parâmetro "placa" do tipo String, e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        for (int i = 0; i < this.listaDeCarro.size(); i++) {// Estrutura de repetição que percorre o ArrayList desde a posição 0, e quando a posição for maior que o tamanho da this.listaDeCarro.size() ele para de percorrer
            if(this.listaDeCarro.get(i).getPlaca().equalsIgnoreCase(placa)){// Estrutura condicional que testa se o paramêtro placa que vem de um argumento no Main do objRevenda.pesquisarCarroPorPlaca(leia.next()) é igual ao do carro cadastrado no this.listaDeCarro.get(i).getPlaca()
                return this.listaDeCarro.get(i);// Se o teste for verdadeiro retorna o carro que contem a mesma placa informada e para o método pesquisarCarroPorPlaca(String placa)
            }//Fecha o corpo da estrutura condicional 
        }//Fecha o corpo da estrutura de repetição
        return null;//Se o teste der falso retorna um null, e para o método pesquisarCarroPorPlaca(String placa)
    }//Fecha o corpo do método pesquisarCarroPorPlaca(String placa)
//Linha em branco
    @Override// Reescreve o método que foi herdado da classe Pai para a classe filha, ou seja, eles possuem o mesmo nome, mas, funcionalidades ou ações diferentes 
    public String toString() {//Método que retorna uma String, e tem sua visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
        return "\n"// Retorna os atributos concatenado
                + "Nome: " + nome + "\n"
                + "Cpj: " + cnpj + "\n"
                + "Lista de Carro: " + listaDeCarro;
    }//Fecha o corpo do método toString()
}//Fecha o corpo da classe Revenda