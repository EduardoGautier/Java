package projhotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Hotel objHotel = new Hotel();

        ArrayList<Hospede> lista = objHotel.getListaDeHospede();

        byte op;

        do {
            System.out.print("\n┌----------------------------------------------------------┐\n"
                    + "│                   SISTEMA DE HOTEL                       │\n"
                    + "│----------------------------------------------------------│\n"
                    + "│ 1  -  CADASTRAR HOSPEDE                                  │\n"
                    + "│ 2  -  MOSTRAR TODOS OS HOSPEDES                          │\n"
                    + "│ 3  -  MOSTRAR QUANTIDADE DE HOSPEDES                     │\n"
                    + "│ 4  -  PESQUISAR HOSPEDES POR SEXO                        │\n"
                    + "│ 5  -  PESQUISAR HOSPEDE POR CPF                          │\n"
                    + "│ 6  -  ALTERAR NOME DO HOSPEDE PESQUISANDO POR CPF        │\n"
                    + "│ 7  -  REMOVER HOSPEDE PESQUISANDO POR CPF                │\n"
                    + "│ 8  -  EXCLUIR TODOS OS HOSPEDE                           │\n"
                    + "│ 0  -  SAIR                                               │\n"
                    + "└----------------------------------------------------------┘\n"
                    + "DIGITE A OPÇÃO: ");
            op = leia.nextByte();
            Tela.limparTela();

            switch (op) {
                case 1:
                    Hospede objHospede = new Hospede();

                    String nome;
                    long cpf;
                    boolean cpfExiste;

                    do {
                        System.out.println("┌---------------------------┐\n"
                                + "│Informe os dados do hospede│\n"
                                + "└---------------------------┘");
                        System.out.print("Nome: ");
                        nome = leia.next();
                        System.out.print("Cpf: ");
                        cpf = leia.nextLong();

                        cpfExiste = objHotel.verificarCadastro(cpf);

                        if (cpfExiste) {
                            System.out.println("\nJá existe um hospede registrado com esse cpf!\nInicie novamente o cadastro\n");
                        }
                    } while (cpfExiste);
                    objHospede.setNome(nome);
                    objHospede.setCpf(cpf);

                    do {
                        System.out.print("Escolha o sexo conforme abaixo" + "\n"
                                + "1 - Masculino" + "\n"
                                + "2 - Feminino" + "\n"
                                + "Digite a opção: ");
                        op = leia.nextByte();

                        switch (op) {
                            case 1:
                                objHospede.setSexo("Masculino");
                                break;
                            case 2:
                                objHospede.setSexo("Feminino");
                                break;
                            default:
                                System.out.print("\nOpção inválida!\nDigite novamente\n\n");
                        }
                    } while (op < 1 || op > 2);

                    lista.add(objHospede);
                    Tela.limparTela();
                    break;
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem hospedes registrados");
                    } else {
                        System.out.print(objHotel.mostrarTodosOsHospedes());
                    }
                    break;
                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem hospedes registrados");
                    } else {
                        System.out.print("A quantidade de hospedes é: " + lista.size());
                    }
                    break;
                case 4:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem hospedes registrados");
                    } else {
                        ArrayList<Hospede> resultadoDaPesquisarPorSexo = null;

                        do {
                            System.out.print("Escolha o sexo do hospede que deseja procurar\n"
                                    + "1 - Masculino\n"
                                    + "2 - Feminino\n"
                                    + "Digite a opção: ");
                            op = leia.nextByte();

                            switch (op) {
                                case 1:
                                    resultadoDaPesquisarPorSexo = objHotel.pesquisarHospedePorSexo("Masculino");
                                    break;
                                case 2:
                                    resultadoDaPesquisarPorSexo = objHotel.pesquisarHospedePorSexo("Feminino");
                                    break;
                                default:
                                    System.out.print("\nOpção inválida!\nDigite novamente\n\n");
                            }

                        } while (op < 1 || op > 2);

                        if (resultadoDaPesquisarPorSexo == null) {
                            System.out.println("Nenhum hospede encontrado");
                        } else {
                            System.out.println("\nLista de hospedes encontrados: " + resultadoDaPesquisarPorSexo);
                        }
                    }
                    break;
                case 5:
                case 6:
                case 7:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem hospede registrados");
                    } else {
                        System.out.print("Digite o cpf do hospede que deseja pesquisar: ");
                        Hospede busca = objHotel.pesquisarHospedePorCpf(leia.nextLong());
                        Tela.limparTela();
                        if (busca == null) {
                            System.out.println("Hospede não registrado");
                        } else {
                            System.out.println("O hospede é: " + busca);
                            if (op == 6) {
                                System.out.print("\nDigite o novo nome: ");
                                busca.setNome(leia.next());
                                Tela.limparTela();
                            } else if (op == 7) {
                                do {
                                    System.out.print("\n┌-------------------┐\n"
                                            + "│EXCLUSÃO DO HOSPEDE│\n"
                                            + "└-------------------┘\n"
                                            + "Você tem certeza que deseja excluir o hospede?\n"
                                            + "[1] - Sim\n"
                                            + "[2] - Não\n"
                                            + "Digite aqui a opção: ");
                                    op = leia.nextByte();
                                    Tela.limparTela();
                                    switch (op) {
                                        case 1:
                                            lista.remove(busca);
                                            System.out.println("O hospede foi excluído com sucesso!");
                                            break;
                                        case 2:
                                            System.out.println("Exclusão cancelada");
                                            break;
                                        default:
                                            System.out.println("\nOpção inválida!\nDigite novamente\n\n");
                                    }
                                } while (op < 1 || op > 2);
                            }
                        }
                    }
                    break;
                case 8:
                    if (lista.isEmpty()) {
                        System.out.println("Não existem hospedes a serem excluídos");
                    } else {
                        do {
                            System.out.print("\n┌-------------------┐\n"
                                    + "│EXCLUSÃO DO HOSPEDE│\n"
                                    + "└-------------------┘\n"
                                    + "Você tem certeza que deseja excluir todos os hospedes?\n"
                                    + "[1] - Sim\n"
                                    + "[2] - Não\n"
                                    + "Digite aqui a opção: ");
                            op = leia.nextByte();
                            Tela.limparTela();
                            switch (op) {
                                case 1:
                                    lista.clear();
                                    System.out.println("Dados dos hospedes excluídos com sucesso!");
                                    break;
                                case 2:
                                    System.out.println("Exclusão cancelada");
                                    break;
                                default:
                                    System.out.println("\nOpção inválida!\nDigite novamente\n\n");
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
