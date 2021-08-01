package projrevendacarroarraylist;// Diretório onde fica armazenado as classes deste programa
//Linha em branco
import java.util.ArrayList;// Importa a Classe ArrayList
import java.util.Scanner;// Importa a Classe Scanner
//Linha em branco
public class Main {//Declara uma classe com o nome main com visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
//Linha em branco
    public static void main(String[] args) {// Declara um método com o nome "main", estático, ou seja, podendo chamar classes que sejam estática direto sem precisar criar um objeto, e com visibilidade pública que não retorna com parâmetro(String[] args)  
        Scanner leia = new Scanner(System.in);//Instância o objeto leia do tipo Scanner, assim permitindo o objeto leia usar os métodos da classe Scanner
        Revenda objRevenda = new Revenda();//Instância o objRevenda do tipo Revenda, assim permitindo o objRevenda usar os métodos da classe Revenda
        ArrayList<Carro> patio = objRevenda.getListaDeCarro();// Declara uma variável com o nome de "patio" do tipo ArrayList<Carro> e faz a variável "patio" receber receber o objRevenda.getListaDeCarro()  
//Linha em branco
        System.out.println("Informe os dados da revenda"); // O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
        System.out.print("Nome: ");//O método System.out.print() gera uma saída de texto entre aspas duplas significando uma String sem criar uma nova linha
        objRevenda.setNome(leia.next());//Invoca através do objRevenda o método modificador setter com o nome de "setNome" e passa o argumento para o parâmetro do método "setNome"
        System.out.print("Cnpj: ");//O método System.out.print() gera uma saída de texto entre aspas duplas significando uma String sem criar uma nova linha
        objRevenda.setCnpj(leia.nextLong());//Invoca através do objRevenda o método modificador setter com o nome de "setCnpj" e passa o argumento para o parâmetro do método "setCnpj"
        Tela.limparTela();// Limpa a tela
//Linha em branco
        byte op;//Declara uma variável com o nome "op" do tipo byte
//Linha em branco
        do {// Estrutura de repetição 
            System.out.print(":::::::::::::::::::::SISTEMA REVENDA:::::::::::::::::::::::\n"//O método System.out.print() gera uma saída de texto entre aspas duplas concatenado a String sem criar uma nova linha
                    + "::  1 - CADASTRAR CARRO	                                 ::\n"
                    + "::  2 - MOSTRAR TODOS OS CARROS                          ::\n"
                    + "::  3 - MOSTRAR QUANTIDADE DE CARROS                     ::\n"
                    + "::  4 - CALCULAR O VALOR TOTAL DE CARROS NO PÁTIO        ::\n"
                    + "::  5 - PESQUISAR CARRO POR PLACA                        ::\n"
                    + "::  6 - EXCLUIR TODOS OS CARROS                          ::\n"
                    + "::  0 - SAIR                                             ::\n"
                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "DIGITE A OPÇÃO:  ");
            op = leia.nextByte();//Faz a variável com o nome de "op" receber o que o usuário digitar
//Linha em branco
            switch (op) {//A estrutura switch verifica a variável "op" e age de acordo com seus cases
                case 1:// Caso o valor da variável "op" seja "1" executa esse bloco de código
                    Carro objCarro = new Carro();//Instância o objCarro do tipo Carro, assim permitindo o objCarro usar os métodos da classe Carro
                    System.out.println("Informe os dados do carro");// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                    System.out.print("Marca: ");//O método System.out.print() gera uma saída de texto entre aspas duplas significando uma String sem criar uma nova linha
                    objCarro.setMarca(leia.next());//Invoca através do objCarro o método modificador setter com o nome de "setMarca" e passa o argumento para o parâmetro do método "setMarca"
                    System.out.print("Ano: ");//O método System.out.print() gera uma saída de texto entre aspas duplas significando uma String sem criar uma nova linha
                    objCarro.setAno(leia.nextInt());//Invoca através do objCarro o método modificador setter com o nome de "setAno" e passa o argumento para o parâmetro do método "setAno"
                    System.out.print("Placa: ");//O método System.out.print() gera uma saída de texto entre aspas duplas significando uma String sem criar uma nova linha
                    objCarro.setPlaca(leia.next());//Invoca através do objCarro o método modificador setter com o nome de "setPlaca" e passa o argumento para o parâmetro do método "setPlaca"
                    System.out.print("Valor: ");//O método System.out.print() gera uma saída de texto entre aspas duplas significando uma String sem criar uma nova linha
                    objCarro.setValor(leia.nextDouble());//Invoca através do objCarro o método modificador setter com o nome de "setValor" e passa o argumento para o parâmetro do método "setValor"
                    patio.add(objCarro);// Adiciona o objCarro dentro do objRevenda.getListaDeCarro()
                    Tela.limparTela();// Limpa a tela
                    break;//O break funciona como um comando de interrupção. Ele impede que os próximos blocos de código sejam executados
                case 2:// Caso o valor da variável "op" seja "2" executa esse bloco de código
                    Tela.limparTela();// Limpa a tela
                    if (patio.isEmpty()) {//Estrutura condicional que verifica se o patio está vazio se for verdadeiro executa o bloco de código abaixo
                        System.out.println("Não existem carros cadastrados");// Caso a condição acima seja verdadeira executa o método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                    } else {// Se a estrutura condicional que verifica se o patio está vazio for falsa executa o bloco de código abaixo
                        System.out.println(objRevenda.mostrarTodosOsCarros());//O método System.out.println(objRevenda.mostrarTodosOsCarros() mostra a String que foi gerada dentro do "objRevenda.mostrarTodosOsCarros()"
                    }//Fecha o corpo do else
                    break;//O break funciona como um comando de interrupção. Ele impede que os próximos blocos de código sejam executados
                case 3:// Caso o valor da variável "op" seja "3" executa esse bloco de código
                    Tela.limparTela();// Limpa a tela
                    if (patio.isEmpty()) {//Estrutura condicional que verifica se o patio está vazio se for verdadeiro executa o bloco de código abaixo
                        System.out.println("Não existem carros cadastrados");// Caso a condição acima seja verdadeira executa o método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                    } else {// Se a estrutura condicional que verifica se o patio está vazio for falsa executa o bloco de código abaixo
                        System.out.println("A quantidade de carros é: " + patio.size());// Caso a condição acima seja verdadeira executa o método System.out.println() gera uma saída de texto entre aspas duplas concatenando com patio.size() significando uma String e cria uma nova linha
                    }//Fecha o corpo do else
                    break;//O break funciona como um comando de interrupção. Ele impede que os próximos blocos de código sejam executados
                case 4:// Caso o valor da variável "op" seja "4" executa esse bloco de código
                    Tela.limparTela();// Limpa a tela
                    if (patio.isEmpty()) {//Estrutura condicional que verifica se o patio está vazio se for verdadeiro executa o bloco de código abaixo
                        System.out.println("Não existem carros cadastrados");// Caso a condição acima seja verdadeira executa o método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                    } else {// Se a estrutura condicional que verifica se o patio está vazio for falsa executa o bloco de código abaixo
                    System.out.println("Valor total de todos os carros no pátio: R$ " + objRevenda.calcularValor());// Caso a condição acima seja verdadeira executa o método System.out.println() gera uma saída de texto entre aspas duplas concatenando com objRevenda.calcularValor() e mostra o que tem dentro do método "calcularValor()" cria uma nova linha
                    }//Fecha o corpo do else
                    break;//O break funciona como um comando de interrupção. Ele impede que os próximos blocos de código sejam executados
                case 5:// Caso o valor da variável "op" seja "5" executa esse bloco de código
                    Tela.limparTela();// Limpa a tela
                    if (patio.isEmpty()) {//Estrutura condicional que verifica se o patio está vazio se for verdadeiro executa o bloco de código abaixo
                        System.out.println("Não existem carros cadastrados");// Caso a condição acima seja verdadeira executa o método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                    } else {// Se a estrutura condicional que verifica se o patio está vazio for falsa executa o bloco de código abaixo
                        System.out.print("Digite a placa que deseja pesquisar: ");// Caso a condição acima seja verdadeira executa o método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                        Carro busca = objRevenda.pesquisarCarroPorPlaca(leia.next());// Declara uma variável com o nome de "busca" do tipo Carro que vai receber objRevenda.pesquisarCarroPorPlaca(leia.next()) e vai enviar o argumento que o usuário digitar para o parâmetro do método pesquisarCarroPorPlaca(String placa)
                        if(busca==null){//Estrutura condicional que verifica se a variável busca é igual a null, caso seja verdadeiro executa o bloco de código abaixo
                            System.out.println("Carro não cadastrado");// Caso a condição acima seja verdadeira executa o método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                        }else{// Se a estrutura condicional que verifica se a busca é igual a "null" for falsa executa o bloco de código abaixo
                            System.out.println("O carro é: "+busca);// Caso a condição acima seja verdadeira executa o método System.out.println() gera uma saída de texto entre aspas duplas concatenando com busca e mostra o que tem dentro do método "pesquisarCarroPorPlaca(String placa)" cria uma nova linha
                        }//Fecha o corpo do else
                    }//Fecha o corpo do else
                    break;//O break funciona como um comando de interrupção. Ele impede que os próximos blocos de código sejam executados
                case 6:// Caso o valor da variável "op" seja "6" executa esse bloco de código
                    Tela.limparTela();// Limpa a tela
                    if (patio.isEmpty()) {//Estrutura condicional que verifica se o patio está vazio se for verdadeiro executa o bloco de código abaixo
                        System.out.println("Não existem carros a serem excluidos");// Caso a condição acima seja verdadeira executa o método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                    } else {// Se a estrutura condicional que verifica se o patio está vazio for falsa executa o bloco de código abaixo
                        do{// Estrutura de repetição 
                            System.out.print(":::::::EXCLUSÃO DE CARRO::::::\n"//O método System.out.print() gera uma saída de texto entre aspas duplas concatenado a String sem criar uma nova linha
                                    + "Você tem certeza que deseja excluir todos os carros?\n"
                                    + "Se sim digite 1\n"
                                    + "Se não digite 2\n"
                                    + "Digite aqui sua opção: ");
                            op = leia.nextByte();//Faz a variável com o nome de "op" receber o que o usuário digitar
//Linha em branco                            
                            switch (op) {//A estrutura switch verifica a variável "op" e age de acordo com seus cases
                                case 1:// Caso o valor da variável "op" seja "1" executa esse bloco de código
                                    System.out.println("Carros excluido!");// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                                    patio.clear();//Esse método exclui todos os carros
                                    break;//O break funciona como um comando de interrupção. Ele impede que os próximos blocos de código sejam executados
                                case 2:// Caso o valor da variável "op" seja "2" executa esse bloco de código
                                    Tela.limparTela();//Limpa a tela
                                    System.out.println("Exclusão cancelada");// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                                    break;//O break funciona como um comando de interrupção. Ele impede que os próximos blocos de código sejam executados
                                default:// Caso o valor da variável "op" seja diferente dos casos executa esse bloco de código
                                    System.out.println("Opção inválida\nDigite novamente");// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                            }//Fecha o corpo do switch
                        }while(op < 1 || op > 2);//Enquanto o usuário digita um número menor que 1 ou maior que 2 o programa mostra o bloco de código do default e pede que ele digite novamente
                    }//Fecha o corpo do else
                    break;//O break funciona como um comando de interrupção. Ele impede que os próximos blocos de código sejam executados
                case 0:// Caso o valor da variável "op" seja "0" executa esse bloco de código
                    Tela.limparTela();//Limpa a tela
                    System.out.println("Sistema encerrado!");// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
                    break;//O break funciona como um comando de interrupção. Ele impede que os próximos blocos de código sejam executados
                default:// Caso o valor da variável "op" seja diferente dos casos executa esse bloco de código
                    Tela.limparTela();//Limpa a tela
                    System.out.println("Opção inválida\nDigite novamente");// O método System.out.println() gera uma saída de texto entre aspas duplas significando uma String e cria uma nova linha
            }//Fecha o corpo do switch
        } while (op != 0);////Enquanto o usuário digita um número diferente de "0" o programa mostra o bloco de código do default e pede que ele digite novamente
    }//Fecha o corpo do método public static void main(String[] args)
}//Fecha o corpo da classe Main
