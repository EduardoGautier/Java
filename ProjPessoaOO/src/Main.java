import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa objPessoa = new Pessoa();
        
        System.out.println("Informe os Dados");
        System.out.print("Nome: ");
        objPessoa.setNome(leia.nextLine());
        System.out.print("Cpf: ");
        objPessoa.setCpf(leia.nextLong());
        System.out.print("Celular: ");
        objPessoa.setTelefoneCelular(leia.nextLine());
        leia.nextLine();
        System.out.print("Telefone Residêncial: ");
        objPessoa.setTelefoneResidencial(leia.nextLine());
        
        System.out.println(objPessoa.toString());
        
    }   
}
