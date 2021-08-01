import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        System.out.println("Informe os Dados do Aluno");
        System.out.print("Nome: ");
        objAluno.setNome(leia.nextLine());
        System.out.print("Nota 1: ");
        objAluno.setNota1(leia.nextDouble());
        System.out.print("Nota 2: ");
        objAluno.setNota2(leia.nextDouble());
        
        System.out.println(objAluno);
    }
    
}
