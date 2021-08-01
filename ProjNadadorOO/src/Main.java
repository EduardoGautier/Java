import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Nadador objNadador = new Nadador();
        
        System.out.println("Informe os Dados do Nadador");
        System.out.print("Nome: ");
        objNadador.setNome(leia.nextLine());
        System.out.print("Idade: ");
        objNadador.setIdade(leia.nextByte());
        
        System.out.println("\nDados do Nadador");
        System.out.println(objNadador);
                
        
    }
    
}
