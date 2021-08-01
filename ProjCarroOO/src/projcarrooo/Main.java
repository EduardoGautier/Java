package projcarrooo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        byte op;
        
        System.out.println("Informe os dados do carro");
        System.out.print("Marca: ");
        String marca = leia.nextLine();
        System.out.print("Modelo: ");
        String modelo = leia.nextLine();
        System.out.print("Valor: ");
        double valor = leia.nextDouble();
        
        Carro objCarro = new Carro(marca,modelo,valor);

        do{
            System.out.print("Deseja alterar a kilometragem?\n"
                    + "1 - Sim" +"\n"
                    + "2 - Não" +"\n"
                    + "Digite aqui sua opção: ");
            
            op = leia.nextByte();
            
            switch (op) {
                case 1:
                    System.out.print("Informe a kilometragem: ");
                    objCarro.setKilometragem(leia.nextInt());
                    break;
                case 2:
                    break;
                default:
                    System.out.print("\nOpção inválida\n"
                            + "Digite novamente\n\n");
            }
            
        }while(op<1 || op>2);
        
        System.out.print("Opcionais: ");
        objCarro.setOpcionais(leia.next());
        
        System.out.println(objCarro);
          
    }
}
