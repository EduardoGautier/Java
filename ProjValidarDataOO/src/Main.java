import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Data objData = new Data();

        do {
            System.out.println("\n:::::::::::::::::::::\n: Validação de Data :\n:::::::::::::::::::::");
            System.out.print("Digite o dia: ");
            objData.setDia(leia.nextByte());
            System.out.print("Digite o mês: ");
            objData.setMes(leia.nextByte());
            System.out.print("Digite o ano: ");
            objData.setAno(leia.nextInt());

            if (objData.validarData()) {
            } else {
                System.out.println("\nData inválida!\nDigite novamente");
            }

        } while (!objData.validarData());

        System.out.println(objData.toString());
    }

}
