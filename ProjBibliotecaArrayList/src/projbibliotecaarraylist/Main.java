package projbibliotecaarraylist;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
        Biblioteca objBiblioteca = new Biblioteca();
        
        System.out.println("Informe os dados da biblioteca");
        System.out.print("Nome: ");
        objBiblioteca.setNome(leia.next());
        System.out.print("Cnpj: ");
        objBiblioteca.setCnpj(leia.nextLong());
        Tela.limparTela();
        
        byte op;
        do{
            System.out.print("::::: Gerenciamento de livros :::::\n"
                    + "Escolha uma opção abaixo\n"
                    + "[1] Cadastrar livro\n"
                    + "[2] Mostrar todos os livros\n"
                    + "[3] Mostrar a quantidade de livros\n"
                    + "[4] Excluir todos os livros\n"
                    + "[0] Sair\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();
            
            switch (op) {
                case 1:
                    Livro objLivro = new Livro();
                    System.out.println("Informe os dados do livro");
                    System.out.print("Título: ");
                    objLivro.setTitulo(leia.next());
                    System.out.print("Autor: ");
                    objLivro.setAutor(leia.next());
                    System.out.print("Gênero: ");
                    objLivro.setGenero(leia.next());
                    objBiblioteca.getListaDeLivros().add(objLivro);
                    Tela.limparTela();
                    break;
                case 2:
                    System.out.println("Lista de livros: "+objBiblioteca.getListaDeLivros());
                    Tela.limparTela();
                    break;
                case 3:
                    System.out.println("A quantidade de livros é: "+objBiblioteca.getListaDeLivros().size());
                    Tela.limparTela();
                    break;
                case 4:
                    objBiblioteca.getListaDeLivros().clear();
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
