package projbiblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Biblioteca objBiblioteca = new Biblioteca();
        
        System.out.println("Biblioteca");
        System.out.print("Nome: ");
        objBiblioteca.setNome(leia.next());
        System.out.print("Cnpj: ");
        objBiblioteca.setCnpj(leia.nextLong());
        
        System.out.print("\nInforme os dados do livro 1\n");
        System.out.print("Título: ");
        objBiblioteca.getObjLivro1().setTitulo(leia.next());
        System.out.print("Genero: ");
        objBiblioteca.getObjLivro1().setGenero(leia.next());
        System.out.print("Autor: ");
        objBiblioteca.getObjLivro1().setAutor(leia.next());
        
        System.out.println("\nInforme os dados do livro 2");
        System.out.print("Título: ");
        objBiblioteca.getObjLivro2().setTitulo(leia.next());
        System.out.print("Genero: ");
        objBiblioteca.getObjLivro2().setGenero(leia.next());
        System.out.print("Autor: ");
        objBiblioteca.getObjLivro2().setAutor(leia.next());
        
        System.out.println(objBiblioteca);
        
    }
    
}
