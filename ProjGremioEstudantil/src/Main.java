
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Eleicao objEleicao = new Eleicao();
        byte op;

        do {
            System.out.print("\n:::::::::::::::::::::::::::::\n: Eleição Grêmio Estudantil :\n:::::::::::::::::::::::::::::\n"
                    + "Escolha uma opção abaixo\n"
                    + "[1] para votar na Chapa 1\n"
                    + "[2] para votar na Chapa 2\n"
                    + "[3] para votar na Chapa 3\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();

            switch (op) {
                case 1:
                    objEleicao.computarVotosParaChapa1();
                    break;
                case 2:
                    objEleicao.computarVotosParaChapa2();
                    break;
                case 3:
                    objEleicao.computarVotosParaChapa3();
                    break;
                default:
                    System.err.print("Voto inválido\n");
            }
            System.out.println("\nQuantos votos faltam: "+(100-objEleicao.obterTotalDeVotos()));

        } while (objEleicao.getVotosChapa1() < 51 && objEleicao.getVotosChapa2() < 51 && objEleicao.getVotosChapa3() < 51 && objEleicao.obterTotalDeVotos() < 100);

        System.out.println(objEleicao.toString());
    }

}
