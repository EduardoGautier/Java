package projcomprasarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Carrinho objCarrinho = new Carrinho();
        ArrayList<Produto> lista = objCarrinho.getListaDeProduto();

        byte op;

        do {
            System.out.print("\n┌---------------------------------------------------┐\n"
                    + "│                  Compras Online                   │\n"
                    + "│---------------------------------------------------│\n"
                    + "│ 1 - CADASTRAR PRODUTO NO CARRINHO                 │\n"
                    + "│ 2 - MOSTRAR TODOS OS PRODUTOS NO CARRINHO         │\n"
                    + "│ 3 - MOSTRAR QUANTIDADE DE PRODUTOS NO CARRINHO    │\n"
                    + "│ 4 - CALCULAR VALOR TOTAL DE COMPRA                │\n"
                    + "│ 5 - ESVAZIAR CARRINHO                             │\n"
                    + "│ 0 - SAIR                                          │\n"
                    + "└---------------------------------------------------┘\n"
                    + "Digite aqui a opção desejada:  ");
            op = leia.nextByte();
            Tela.limparTela();

            switch (op) {
                case 1:
                    Produto objProduto = new Produto();
                    System.out.println("┌---------------------------┐\n"
                            + "│Informe os dados do produto│\n"
                            + "└---------------------------┘");
                    System.out.print("Nome: ");
                    objProduto.setNome(leia.next());
                    System.out.print("Descrição: ");
                    objProduto.setDescricao(leia.next());
                    System.out.print("Valor: R$ ");
                    objProduto.setValor(leia.nextDouble());
                    lista.add(objProduto);
                    Tela.limparTela();
                    break;
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem produtos registrados no carrinho!");
                    } else {
                        System.out.print(objCarrinho.mostrarTodosOsProdutos());
                    }
                    break;
                case 3:
                    Tela.limparTela();
                    if (lista.isEmpty()) {
                        System.out.println("Não existem produtos registrados no carrinho!");
                    } else {
                        System.out.println("A quantidade de produtos no carrinho é: " + lista.size());
                    }
                    break;
                case 4:
                    Tela.limparTela();
                    if (lista.isEmpty()) {
                        System.out.println("Não existem produtos registrados no carrinho!");
                    } else {
                        System.out.println("Valor total de todos os produtos no carrinho: R$ " + objCarrinho.calcularVenda());
                    }
                    break;
                case 5:
                    Tela.limparTela();
                    if (lista.isEmpty()) {
                        System.out.println("Não existem produtos a serem removidos do carrinho");
                    } else {
                        do {
                            System.out.print("┌----------------------------┐\n"
                                    + "│REMOVER PRODUTOS DO CARRINHO│\n"
                                    + "└----------------------------┘\n"
                                    + "Você tem certeza que deseja remover todos os produtos do carrinho?\n"
                                    + "[1] - Sim\n"
                                    + "[2] - Não\n"
                                    + "Digite aqui a opção: ");
                            op = leia.nextByte();
                            Tela.limparTela();
                            switch (op) {
                                case 1:
                                    System.out.println("Produtos removidos do carrinho!");
                                    lista.clear();
                                    break;
                                case 2:
                                    Tela.limparTela();
                                    System.out.println("Remoção cancelada!");
                                    break;
                                default:
                                    System.out.println("Opção inválida\nDigite novamente");
                            }
                        } while (op < 1 || op > 2);
                    }
                    break;
                case 0:
                    Tela.limparTela();
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    Tela.limparTela();
                    System.out.println("Opção inválida\nDigite novamente");
            }
        } while (op != 0);
    }
}
