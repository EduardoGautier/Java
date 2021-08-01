package projassociacaovenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Venda objVenda = new Venda();
        
        System.out.println("Livro 1");
        System.out.print("Título: ");
        objVenda.getObjLivro1().setTitulo(leia.next());
        System.out.print("Isbn: ");
        objVenda.getObjLivro1().setIsbn(leia.nextLong());
        System.out.print("Autor: ");
        objVenda.getObjLivro1().setAutor(leia.next());
        System.out.print("Valor: ");
        objVenda.getObjLivro1().setValor(leia.nextDouble());
        System.out.println("Data lançamento");
        System.out.print("Dia: ");
        objVenda.getObjLivro1().getDataLancamento().setDia(leia.nextByte());
        System.out.print("Mes: ");
        objVenda.getObjLivro1().getDataLancamento().setMes(leia.nextByte());
        System.out.print("Ano: ");
        objVenda.getObjLivro1().getDataLancamento().setAno(leia.nextInt());
        Tela.limparTela();
        
        System.out.println("Livro 2");
        System.out.print("Título: ");
        objVenda.getObjLivro2().setTitulo(leia.next());
        System.out.print("Isbn: ");
        objVenda.getObjLivro2().setIsbn(leia.nextLong());
        System.out.print("Autor: ");
        objVenda.getObjLivro2().setAutor(leia.next());
        System.out.print("Valor: ");
        objVenda.getObjLivro2().setValor(leia.nextDouble());
        System.out.println("Data lançamento");
        System.out.print("Dia: ");
        objVenda.getObjLivro2().getDataLancamento().setDia(leia.nextByte());
        System.out.print("Mes: ");
        objVenda.getObjLivro2().getDataLancamento().setMes(leia.nextByte());
        System.out.print("Ano: ");
        objVenda.getObjLivro2().getDataLancamento().setAno(leia.nextInt());
        Tela.limparTela();
        
        System.out.println("Venda");
        System.out.print("Código: ");
        objVenda.setCodigo(leia.nextInt());
        System.out.println("Data venda");
        System.out.print("Dia: ");
        objVenda.getDataVenda().setDia(leia.nextByte());
        System.out.print("Mes: ");
        objVenda.getDataVenda().setMes(leia.nextByte());
        System.out.print("Ano: ");
        objVenda.getDataVenda().setAno(leia.nextInt());
        Tela.limparTela();
        
        System.out.println(objVenda);
        
        
        
        
        
        

    }

}
