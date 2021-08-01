package projagenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Condominio objCondominio = new Condominio();

        ArrayList<Morador> lista = objCondominio.getlistaDeMorador();

        byte op;

        do {
            System.out.print("\n┌----------------------------------------------------------┐\n"
                    + "│                       SISTEMA DE CONDOMINIO                  │\n"
                    + "│----------------------------------------------------------│\n"
                    + "│ 1 - CADASTRAR MORADOR                                    │\n"
                    + "│ 2 - MOSTRAR TODOS OS MORADORES                            │\n"
                    + "│ 3 - MOSTRAR QUANTIDADE DE MORADORES                       │\n"
                    + "│ 4 - PESQUISAR POR NUMERO DO APARTAMENTO                     │\n"
                    + "│ 5 - PESQUISAR PAGAMENTO ATRASADO                           │\n"
                    + "│ 6 - ALTERAR MORADOR POR APARTAMENTO ATRASADO    │\n"
                    + "│ 7 - REMOVER MORADOR PESQUISANDO POR APARTAMENTO ATRASADO                 │\n"
                    + "│ 8 - EXCLUIR TODOS OS CONTATOS                            │\n"
                    + "│ 0 - SAIR                                                 │\n"
                    + "└----------------------------------------------------------┘\n"
                    + "Digite a opção desejada:  ");
            op = leia.nextByte();
            Tela.limparTela();

            switch (op) {
                case 1:
                    Morador objMorador = new Morador();
                    String nome;
                    boolean nomeExiste;

                    do {
                        System.out.println("┌---------------------------┐\n"
                                + "│Informe os dados do contato│\n"
                                + "└---------------------------┘");
                        System.out.print("Nome: ");
                        nome = leia.next();

                        nomeExiste = objCondominio.verificarCadastro(nome);

                        if (nomeExiste) {
                            System.out.println("\nJá existe um contato com esse nome!\nInicie novamente o cadastro");
                        }
                    } while (nomeExiste);
                    objMorador.setNome(nome);
                    System.out.print("Numero Apartamento: ");
                    objMorador.setNumeroAp(leia.nextInt());
                    System.out.print("valor do condominio : ");
                    objMorador.setValorAp(leia.nextInt());
                    System.out.print("O Condominio esta pago(S/N) : ");
                    objMorador.setPago(leia.next());

                    lista.add(objMorador);
                    Tela.limparTela();
                    break;
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem moradores registrados");
                    } else {
                        System.out.print(objCondominio.mostrarTodosOsMorador());
                    }
                    break;
                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem moradores registrados");
                    } else {
                        System.out.print("A quantidade de moradores é: " + lista.size());
                    }
                    break;
                case 4:

                    break;
                case 5:
                case 6:
                case 7:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem moradores cadastrados");
                    } else {
                        System.out.print("Digite se o pagamento esta atrasado (S/N): ");
                        Morador busca = objCondominio.pesquisarPagamento(leia.next());

                        if (busca == null) {
                            System.out.println("Contato não cadastrado");
                        } else {
                            System.out.println("O contato é: " + busca);
                            if (op == 6) {
                                System.out.print("Digite o nome do morador que deseja alterar os dados: ");
                                Morador buscaNome = objCondominio.pesquisarMoradorNome(leia.next());
                                System.out.print("Digite o novo nome do morador: ");
                                buscaNome.setNome(leia.next());
                                System.out.print("Digite o novo numero do apartamento: ");
                                buscaNome.setNumeroAp(leia.nextInt());
                                System.out.print("Digite o novo valor do condominio: ");
                                buscaNome.setValorAp(leia.nextInt());
                                System.out.print("O Condominio esta pago(S/N): ");
                                buscaNome.setPago(leia.next());
                            } else if (op == 7) {
                                do {
                                    System.out.print("┌-------------------┐\n"
                                            + "│EXCLUSÃO DO MORADOR│\n"
                                            + "└-------------------┘\n"
                                            + "Você tem certeza que deseja excluir o contato?\n"
                                            + "[1] - Sim\n"
                                            + "[2] - Não\n"
                                            + "Digite aqui a opção: ");
                                    op = leia.nextByte();
                                    Tela.limparTela();
                                    switch (op) {
                                        case 1:
                                            lista.remove(busca);
                                            System.out.println("O morador foi excluído com sucesso!");
                                            break;
                                        case 2:
                                            System.out.println("Exclusão cancelada");
                                            break;
                                        default:
                                            System.out.println("Opção inválida\nDigite novamente");
                                    }
                                } while (op < 1 || op > 2);
                            }
                        }
                    }
                    break;
                case 8:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem moradores a serem excluídos");
                    } else {
                        do {
                            System.out.print("┌-------------------┐\n"
                                    + "│EXCLUSÃO DO MORADOR│\n"
                                    + "└-------------------┘\n"
                                    + "Você tem certeza que deseja excluir todos os moradores?\n"
                                    + "[1] - Sim\n"
                                    + "[2] - Não\n"
                                    + "Digite aqui a opção: ");
                            op = leia.nextByte();
                            Tela.limparTela();
                            switch (op) {
                                case 1:
                                    lista.clear();
                                    System.out.println("Dados dos moradores excluídos com sucesso!");
                                    break;
                                case 2:
                                    System.out.println("Exclusão cancelada");
                                    break;
                                default:
                                    System.out.println("Opção inválida\nDigite novamente");
                            }
                        } while (op < 1 || op > 2);

                    }
                    break;
                case 0:
                    System.out.println("SISTEMA ENCERRADO");
                    break;
                default:
                    System.out.println("Opção inválida\nDigite novamente");
            }

        } while (op != 0);
    }
}
