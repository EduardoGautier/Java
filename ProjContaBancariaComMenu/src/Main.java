import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ContaBancaria objContaBancaria = new ContaBancaria();
        
        System.out.println("Informe os Dados da Conta Bancária");
        System.out.print("Número: ");
        objContaBancaria.setNumero(leia.nextInt());
        System.out.print("Agência: ");
        objContaBancaria.setAgencia(leia.nextInt());
        System.out.print("Saldo: ");
        objContaBancaria.setSaldo(leia.nextDouble());
        System.out.print("Limite: ");
        objContaBancaria.setLimite(leia.nextDouble());
        
        byte op;
        
        do{
            System.out.print("\n:::: Banco do BR ::::\n\n"
                    + "Escolha uma das opções abaixo\n"
                    + "[1] Depositar\n"
                    + "[2] Sacar\n"
                    + "[3] Aumentar Limite\n"
                    + "[4] Diminuir Limite\n"
                    + "[5] Mostrar Limite\n"
                    + "[6] Motrar Saldo\n"
                    + "[7] Dados da Conta\n"
                    + "[0] Sair do Programa\n"
                    + "Digite aqui a opção informada: ");
            op = leia.nextByte();
            
            switch (op){
                case 1:
                    System.out.println("\n::::::::::::::::::::::::::::::\nInforme o valor do deposito");
                    System.out.print("Valor depósito: ");
                    objContaBancaria.depositar(leia.nextDouble());
                    System.out.print("Saldo atual: "+objContaBancaria.getSaldo()
                    + "\n::::::::::::::::::::::::::::::\n");
                    break;
                case 2:
                    System.out.println("\n:::::::::::::::::::::::::::\nInforme o valor do saque");
                    System.out.print("Valor saque: ");
                    objContaBancaria.sacar(leia.nextDouble());
                    System.out.print("Saldo atual: "+objContaBancaria.getSaldo()
                    + "\n:::::::::::::::::::::::::::\n");
                    break;
                case 3:
                    System.out.println("\n:::::::::::::::::::::::::::::::::::::::\nQuanto de limite você quer aumentar?");
                    System.out.print("Aumentar: ");
                    objContaBancaria.aumentarLimite(leia.nextDouble());
                    System.out.print("Limite atual: "+objContaBancaria.getLimite()
                    + "\n:::::::::::::::::::::::::::::::::::::::\n");
                    break;
                case 4:
                    System.out.println("\n:::::::::::::::::::::::::::::::::::::::\nQuanto de limite você quer reduzir?");
                    System.out.print("Diminuir: ");
                    objContaBancaria.reduzirLimite(leia.nextDouble());
                    System.out.print("Limite atual: "+objContaBancaria.getLimite()
                    + "\n:::::::::::::::::::::::::::::::::::::::\n");
                    break;
                case 5:
                    System.out.print("\n::::::::::::::::\nSeu limite é: "+objContaBancaria.getLimite()
                    + "\n::::::::::::::::\n");
                    break;
                case 6:
                    System.out.print("\n::::::::::::::::\nSeu saldo é: "+objContaBancaria.getSaldo()
                    + "\n::::::::::::::::\n");
                    break;
                case 7:
                    System.out.print(
                            "\n::::::::::::::::::::::::::\nDados da Conta Bancária\n"
                            + "Número: "+objContaBancaria.getNumero() 
                            + "\nAgência: "+objContaBancaria.getAgencia()
                            + "\nSaldo: "+objContaBancaria.getSaldo()
                            + "\nLimite: "+objContaBancaria.getLimite()
                            + "\nMostrar saldo: "+objContaBancaria.mostrarSaldo()
                            + "\nMostrar limite: "+objContaBancaria.mostrarLimite()
                            + "\n::::::::::::::::::::::::::\n");
                    break;
                case 0:
                    System.out.print("\n:::::::::::::::::::\nSistema encerrado!\n:::::::::::::::::::");
                    break;
                default:
                    System.out.print("Opção inválida\nDigite novamente!");
            }
        }while(op != 0);   
    }
}
