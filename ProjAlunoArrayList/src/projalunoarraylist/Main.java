package projalunoarraylist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Turma objTurma = new Turma();
       
        System.out.println("Informe os dados da turma");
        System.out.print("Nome: ");
        objTurma.setNome(leia.next());
        System.out.print("Turno: ");
        objTurma.setTurno(leia.next());
        Tela.limparTela();
        
        byte op;
        
        do{
            System.out.print(":::::::::::::::::::::Sistema Escolar:::::::::::::::::::::\n"
                    + ":: 1 - CADASTRAR ALUNO                                 ::\n"
                    + ":: 2 - MOSTRAR TODOS OS ALUNOS                         ::\n"
                    + ":: 3 - MOSTRAR QUANTIDADE DE ALUNOS                    ::\n"
                    + ":: 4 - EXCLUIR TODOS OS ALUNOS                         ::\n"
                    + ":: 0 - SAIR                                            ::\n"
                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();
            Tela.limparTela();
            
            switch (op) {
                case 1:
                    Aluno objAluno = new Aluno();
                    System.out.println("Informe os dados do aluno");
                    System.out.print("Nome: ");
                    objAluno.setNome(leia.next());
                    System.out.print("RA: ");
                    objAluno.setRa(leia.nextLong());
                    System.out.print("Sexo: ");
                    objAluno.setSexo(leia.next());
                    objTurma.getListaDeAlunos().add(objAluno);
                    Tela.limparTela();
                    break;
                case 2:
                    System.out.println("Lista de alunos: "+objTurma.getListaDeAlunos());
                    break;
                case 3:
                    System.out.println("A quantidade de alunos é: "+objTurma.getListaDeAlunos().size());
                    break;
                case 4:
                    objTurma.getListaDeAlunos().clear();
                    break;
                case 0:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida\nDigite novamente!");
                           
            }
        }while(op!=0);    
    }
}
