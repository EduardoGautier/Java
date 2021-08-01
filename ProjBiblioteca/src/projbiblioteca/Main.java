package projbiblioteca;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner leia = new Scanner(System.in);
        Locacao objLocacao = new Locacao();

        byte op;
        do {
            System.out.print("\n::::::::::::::::::::::::::::::\n:: Sistema de Cadastramento ::\n::::::::::::::::::::::::::::::" + "\n"
                    + "Escolha uma opção abaixo" + "\n"
                    + "[1] - Cadastrar funcionário" + "\n"
                    + "[2] - Cadastrar usuário" + "\n"
                    + "[3] - Cadastrar livro" + "\n"
                    + "[4] - Mostrar todos os dados do cadastro" + "\n"
                    + "[0] - Ir para locação" + "\n"
                    + "Digite aqui opção: ");
            op = leia.nextByte();

            switch (op) {
                case 1:
                    System.out.println("\nInforme os dados do funcionário");
                    System.out.println("Nome: ");
                    objLocacao.getObjFuncionario().setNome(leia.nextLine());
                    System.out.print("Cpf: ");
                    objLocacao.getObjFuncionario().setCpf(leia.nextLong());
                    System.out.print("Chapa: ");
                    objLocacao.getObjFuncionario().setChapa(leia.next());
                    System.out.print("Salário: ");
                    objLocacao.getObjFuncionario().setSalario(leia.nextDouble());
                    System.out.println("Informe o endereço do funcionário");
                    System.out.print("Rua: ");
                    objLocacao.getObjFuncionario().getObjEndereco().setRua(leia.next());
                    System.out.print("Número: ");
                    objLocacao.getObjFuncionario().getObjEndereco().setNumero(leia.nextInt());
                    System.out.print("Bairro: ");
                    objLocacao.getObjFuncionario().getObjEndereco().setBairro(leia.next());
                    Tela.limparTela();
                    break;
                case 2:
                    System.out.println("\nInforme os dados do usuário");
                    System.out.print("Nome: ");
                    objLocacao.getObjUsuario().setNome(leia.next());
                    System.out.print("Código: ");
                    objLocacao.getObjUsuario().setCodigo(leia.nextInt());
                    System.out.print("Cpf: ");
                    objLocacao.getObjUsuario().setCpf(leia.nextLong());
                    System.out.println("Informe o endereço do usuário");
                    System.out.print("Rua: ");
                    objLocacao.getObjUsuario().getObjEndereco().setRua(leia.next());
                    System.out.print("Número: ");
                    objLocacao.getObjUsuario().getObjEndereco().setNumero(leia.nextInt());
                    System.out.print("Bairro: ");
                    objLocacao.getObjUsuario().getObjEndereco().setBairro(leia.next());
                    Tela.limparTela();
                    break;
                case 3:
                    System.out.println("\nInforme os dados do livro");
                    System.out.print("Título: ");
                    objLocacao.getObjLivro().setTitulo(leia.next());
                    System.out.print("Gênero: ");
                    objLocacao.getObjLivro().setGenero(leia.next());
                    System.out.print("Autor: ");
                    objLocacao.getObjLivro().setAutor(leia.next());
                    Tela.limparTela();
                    break;
                case 4:
                    System.out.println(objLocacao.getObjFuncionario());
                    System.out.println(objLocacao.getObjUsuario());
                    System.out.println(objLocacao.getObjLivro());
                    break;
                case 0:
                    Tela.limparTela();
                    break;
                default:
                    System.out.print("Opção inválida" + "\n"
                            + "Digite novamente!");
            }

        } while (op != 0);

        do {
            System.out.print("\n::::::::::::::::::::::::\n:: Sistema de Locação ::\n::::::::::::::::::::::::" + "\n"
                    + "Escolha uma opção abaixo" + "\n"
                    + "[1] - Locar livro" + "\n"
                    + "[2] - Devolver livro" + "\n"
                    + "[3] - Mostrar todos os dados" + "\n"
                    + "[0] - Sair" + "\n"
                    + "Digite aqui a opção: ");
            op = leia.nextByte();

            switch (op) {
                case 1:
                    System.out.println("\nInforme os dados da locação");
                    System.out.print("Valor da locação: ");
                    objLocacao.setValorLocacao(leia.nextDouble());
                    System.out.print("Valor da multa: ");
                    objLocacao.setValorMulta(leia.nextDouble());
                    System.out.println("Informe a data de locação");
                    System.out.print("Dia: ");
                    objLocacao.getDataLocacao().setDia(leia.nextByte());
                    System.out.print("Mês: ");
                    objLocacao.getDataLocacao().setMes(leia.nextByte());
                    System.out.print("Ano: ");
                    objLocacao.getDataLocacao().setAno(leia.nextInt());
                    objLocacao.locarLivro();
                    Tela.limparTela();
                    break;
                case 2:
                    System.out.println("\nInforme a data de devolução");
                    System.out.print("Dia: ");
                    objLocacao.getDataDevolucao().setDia(leia.nextByte());
                    System.out.print("Mês: ");
                    objLocacao.getDataDevolucao().setMes(leia.nextByte());
                    System.out.print("Ano: ");
                    objLocacao.getDataDevolucao().setAno(leia.nextInt());
                    System.out.println("Valor total da locação: " + objLocacao.calcularLocacao());
                    objLocacao.devolverLivro();
                    break;
                case 3:
                    Tela.limparTela();
                    System.out.println(objLocacao);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida" + "\n"
                            + "Digite novamente!");
            }
        } while (op != 0);
    }
}
