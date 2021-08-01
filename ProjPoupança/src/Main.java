import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        SimuladorDePoupanca objSimuladorDePoupanca = new SimuladorDePoupanca();
        double deposito;
        double saldo;
        
        System.out.println(":::::::::::::::::::::::::\n: Simulador de Poupança :\n:::::::::::::::::::::::::");
        System.out.print("Quanto você quer depositar? ");
        deposito = leia.nextDouble();
        System.out.print("Quanto de saldo você quer atingir? ");
        saldo = leia.nextDouble();
        
        System.out.println(objSimuladorDePoupanca.calcularSimulacao(deposito, saldo));
        
        
        
        
    }
    
}
