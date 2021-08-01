import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Vendedor objVendedor = new Vendedor();
        
        System.out.println("Informe os Dados do Vendedor");
        System.out.print("Nome: ");
        objVendedor.setNome(leia.nextLine());
        System.out.print("Meta: ");
        objVendedor.setMeta(leia.nextFloat());
        System.out.print("Total vendido: ");
        float valorVendido = leia.nextFloat();
        objVendedor.calcularComissao(valorVendido);
        
        System.out.println(objVendedor.toString());
        System.out.println("Comissão: R$"+objVendedor.calcularComissao(valorVendido));   
    } 
}
