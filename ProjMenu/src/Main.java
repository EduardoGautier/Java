import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int op;
        String resposta;

        System.out.println("1 - Mostrar Salário Bruto");
        System.out.println("2 - Mostrar Valor de horas extras");
        System.out.println("3  - Mostrar Valor do VT");
        System.out.println("4 - Mostrar Valor do INSS");
        System.out.println("5 - Mostrar Valor da Insalubridade");
        System.out.println("6 - Mostrar Valor  do Salário Família");
        System.out.println("7 - Mostrar Valor do plano de carreira");
        System.out.println("8 - Mostrar Valor  total de plano de saúde");
        System.out.println("9 - Mostrar Valor do Salário Líquido");
        System.out.println("10 - Cadastrar novo funcionário");
        System.out.println("0 - Sair do sistema");
        do{
        System.out.print("Digite aqui a opção desejada: ");
            op = leia.nextInt();

        switch (op){
            case 1:
                resposta = "[1] - O salário é: R$ 1000";
                break;
            case 2:
                resposta = "[2] - O valor hora é R$: 10";
                break;
            case 3:
                resposta = "[3] - O valor do vale transporte é: R$ 60";
                break;
            case 4:
                resposta = "[4] - O valor do INSS é: R$ 110 ";
                break;
            case 5:
                resposta = "[5] - O valor da Insalubridade é: R$ 400";
                break;
            case 6:
                resposta = "[6] - O valor do Salário Família é: $ 350";
                break;
            case 7:
                resposta = "[7] - O valor do Plano de carreira é: R$ 500";
                break;
            case 8:
                resposta = "[8] - O valor do Plano de saúde é: R$ 600";
                break;
            case 9:
                resposta = "[9] - O valor do Salário Líquido é: R$ 800";
                break;
            case 10:
                resposta = "[10] - Funcionário cadastrado";
                break;
            case 0:
                resposta = "Sistema encerrado";
                break;
            default:
                resposta = "Opção inválidan\nDigite novamente";
            }
            System.out.println(resposta);

        }while(op != 0);
    }
}
