package projassociaçãoendereco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Cliente objCliente = new Cliente();
        Funcionario objFuncionario = new Funcionario();
        
        System.out.println("Informe os dados do cliente");
        System.out.print("Nome: ");
        objCliente.setNome(leia.nextLine());
        System.out.print("Cpf: ");
        objCliente.setCpf(leia.nextLong());
        System.out.println("\nInforme o endereço do cliente");
        System.out.print("Rua: ");
        objCliente.getObjEndereco().setRua(leia.nextLine());
        leia.nextLine();
        System.out.print("Número: ");
        objCliente.getObjEndereco().setNumero(leia.nextInt());
        byte op;
        do{
            System.out.print("Deseja informar o complemento?\n"
                    + "1 - Sim" +"\n"
                    + "2 - Não" +"\n"
                    + "Digite aqui sua opção: ");
            op = leia.nextByte();
            
            switch (op) {
                case 1:
                    System.out.print("Informe o complemento: ");
                    objCliente.getObjEndereco().setComplemento(leia.nextLine());
                    break;
                case 2:
                    break;
                default:
                    System.out.print("Opção inválida"
                            + "Digite novamente!");
            }
        }while(op <1 || op>2);
        System.out.print("Bairro: ");
        objCliente.getObjEndereco().setBairro(leia.nextLine());
        leia.nextLine();
        
        
        System.out.println("\nInforme os dados do funcionário");
        System.out.print("Nome: ");
        objFuncionario.setNome(leia.nextLine());
        System.out.print("Cpf: ");
        objFuncionario.setCpf(leia.nextLong());
        System.out.println("\nInforme o endereço do funcionário");
        System.out.print("Rua: ");
        objFuncionario.getObjEndereco().setRua(leia.nextLine());
        leia.nextLine();
        System.out.print("Número: ");
        objFuncionario.getObjEndereco().setNumero(leia.nextInt());
        do{
            System.out.print("Deseja informar o complemento?\n"
                    + "1 - Sim" +"\n"
                    + "2 - Não" +"\n"
                    + "Digite aqui sua opção: ");
            op = leia.nextByte();
            
            switch (op) {
                case 1:
                    System.out.print("Informe o complemento: ");
                    objFuncionario.getObjEndereco().setComplemento(leia.nextLine());
                    break;
                case 2:
                    break;
                default:
                    System.out.print("Opção inválida"
                            + "Digite novamente!");
            }
        }while(op <1 || op>2);
        System.out.print("Bairro: ");
        objFuncionario.getObjEndereco().setBairro(leia.nextLine());
        leia.nextLine();
        
        System.out.println(objCliente);
        System.out.println(objFuncionario);

    }
    
}
