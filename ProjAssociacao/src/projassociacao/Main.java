package projassociacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Cliente objCliente = new Cliente();
        Funcionario objFuncionario = new Funcionario();
        
        System.out.println("Informa os dados do cliente");
        System.out.print("Nome: ");
        objCliente.setNome(leia.nextLine());
        System.out.print("Cpf: ");
        objCliente.setCpf(leia.nextLong());
        System.out.println("Informe o endereço do cliente");
        System.out.print("Rua: ");
        objCliente.getObjEndereco().setRua(leia.nextLine());
        leia.nextLine();
        System.out.print("Número: ");
        objCliente.getObjEndereco().setNumero(leia.nextInt());
        byte op;
        do{
            System.out.print("Desejada informar o complemento?\n"
                    + "1 - Sim\n"
                    + "2 - Não\n"
                    + "Digite aqui sua opção");
            op = leia.nextByte();
            
            switch (op) {
                case 1:
                    System.out.print("Digite o complemento: ");
                    objCliente.getObjEndereco().setComplemento(leia.nextLine());
                    leia.nextLine();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida\n"
                            + "Digite novamente");
            }
        }while(op <1 || op > 3);
        System.out.print("Bairro: ");
        objCliente.getObjEndereco().setBairro(leia.nextLine());
        
        System.out.println("\nInforme os dados do funcionário");
        System.out.print("Nome: ");
        objFuncionario.setNome(leia.nextLine());
        System.out.print("Cpf: ");
        objFuncionario.setCpf(leia.nextLong());
        System.out.print("Salário: ");
        objFuncionario.setSalario(leia.nextDouble());
        System.out.println("Informe o endereço do funcionário");
        System.out.print("Rua: ");
        objFuncionario.getObjEndereco().setRua(leia.nextLine());
        leia.nextLine();
        System.out.print("Número: ");
        objFuncionario.getObjEndereco().setNumero(leia.nextInt());
        do{
            System.out.print("Desejada informar o complemento?\n"
                    + "1 - Sim\n"
                    + "2 - Não\n"
                    + "Digite aqui sua opção");
            op = leia.nextByte();
            
            switch (op) {
                case 1:
                    System.out.print("Digite o complemento: ");
                    objCliente.getObjEndereco().setComplemento(leia.nextLine());
                    leia.nextLine();
                    break;
                case 2:
                    break;
                default:
                    System.out.print("Opção inválida\n"
                            + "Digite novamente");
            }
        }while(op <1 || op > 3);
        
        System.out.println(objCliente);
        System.out.println(objFuncionario);
    }
}
