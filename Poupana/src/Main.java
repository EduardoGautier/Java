import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Poupanca objSimuladorDePoupanca = new Poupanca();
        
        System.out.println(":::::::::::::::::::::::::\n: Simulador de Poupança :\n:::::::::::::::::::::::::");
        System.out.print("Quanto você quer depositar? ");
        double deposito = leia.nextDouble();
        System.out.print("Quanto de saldo você quer atingir? ");
        double saldo = leia.nextDouble();
        
        System.out.println(objSimuladorDePoupanca.calcularSimulacao(deposito, saldo));
        
        
        
        
    }
    
}