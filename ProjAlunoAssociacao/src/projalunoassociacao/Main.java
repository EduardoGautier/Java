package projalunoassociacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        System.out.println("Informe os dados do aluno");
        System.out.print("Nome: ");
        objAluno.setNome(leia.nextLine());
        System.out.print("Ra: ");
        objAluno.setRa(leia.nextLong());
        Tela.limparTela();
        
        System.out.println("Avaliação 1");
        System.out.print("Descrição: ");
        objAluno.getObjAvaliacao1().setDescricao(leia.next());
        System.out.print("Nota: ");
        objAluno.getObjAvaliacao1().setNota(leia.nextDouble());
        Tela.limparTela();
   
        System.out.println("Avaliação 2");
        System.out.print("Descrição: ");
        objAluno.getObjAvaliacao2().setDescricao(leia.next());
        System.out.print("Nota: ");
        objAluno.getObjAvaliacao2().setNota(leia.nextDouble());
        Tela.limparTela();
        
        System.out.println(objAluno);
        
        
        
        
        
        
        
    }
    
}
