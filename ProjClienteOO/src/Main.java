import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Cliente objCliente1 = new Cliente();
        Cliente objCliente2 = new Cliente();
        
        System.out.println("Informe os Dados do Cliente 1");
        System.out.print("Nome: ");
        objCliente1.setNome(leia.nextLine());
        System.out.print("Cpf: ");
        objCliente1.setCpf(leia.nextLong());
        System.out.print("Rg: ");
        objCliente1.setRg(leia.nextLine());
        leia.nextLine();
        System.out.print("Endereço: ");
        objCliente1.setEndereco(leia.nextLine());
        System.out.print("Email: ");
        objCliente1.setEmail(leia.nextLine());
        System.out.print("Telefone: ");
        objCliente1.setTelefone(leia.nextLine());
        
        System.out.println("\nDados do Cliente 1");
        System.out.println(objCliente1.toString());
        //System.out.println("Nome: "+objCliente1.getNome());
        //System.out.println("Cpf: "+objCliente1.getCpf());
        //System.out.println("Rg: "+objCliente1.getRg());
        ///System.out.println("Endereço: "+objCliente1.getEndereco());
        //System.out.println("Email: "+objCliente1.getEmail());
        //System.out.println("Telefone: "+objCliente1.getTelefone());
        
        System.out.println("\nInforme os Dados do Cliente 2");
        System.out.print("Nome: ");
        objCliente2.setNome(leia.nextLine());
        System.out.print("Cpf: ");
        objCliente2.setCpf(leia.nextLong());
        System.out.print("Rg: ");
        objCliente2.setRg(leia.nextLine());
        leia.nextLine();
        System.out.print("Endereço: ");
        objCliente2.setEndereco(leia.nextLine());
        System.out.print("Email: ");
        objCliente2.setEmail(leia.nextLine());
        System.out.print("Telefone: ");
        objCliente2.setTelefone(leia.nextLine());
        
        System.out.println("\nDados do Cliente 2");
        System.out.println(objCliente2.toString());
        //System.out.println("Nome: "+objCliente2.getNome());
        //System.out.println("Cpf: "+objCliente2.getCpf());
        //System.out.println("Rg: "+objCliente2.getRg());
        //System.out.println("Endereço: "+objCliente2.getEndereco());
        //System.out.println("Email: "+objCliente2.getEmail());
        //System.out.println("Telefone: "+objCliente2.getTelefone());
    }

}
