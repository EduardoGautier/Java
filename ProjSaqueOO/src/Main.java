import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Saque objSaque = new Saque();
        
        System.out.print("\n::::::::::::::::::::::::::::\n: Informe o valor do saque :\n::::::::::::::::::::::::::::\n"
                + "Saque: ");
        objSaque.setValor(leia.nextInt());
        
        System.out.println(objSaque.toString());
    }
    
}
