import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Carro objCarro = new Carro();

        System.out.println("Informe os Dados do Veículo");
        System.out.print("Fabricante: ");
        objCarro.setFabricante(leia.nextLine());
        System.out.print("Marca: ");
        objCarro.setMarca(leia.nextLine());
        System.out.print("Modelo: ");
        objCarro.setModelo(leia.nextLine());
        System.out.print("Tipo: ");
        objCarro.setTipo(leia.nextLine());
        System.out.print("Ano de Fabricação: ");
        objCarro.setAnoFabricacao(leia.nextInt());
        System.out.print("Potência cv: ");
        objCarro.setPotenciaCv(leia.nextInt());
        System.out.print("Valor avista: ");
        objCarro.setValorAvista(leia.nextDouble());
        System.out.print("Taxa: ");
        objCarro.setTaxa(leia.nextDouble());
        System.out.print("Consumo médio Km litro: ");
        objCarro.setConsumoMedioKmLitro(leia.nextDouble());
        System.out.print("Quantidade de combustível: ");
        objCarro.setQtdDeCombustivel(leia.nextDouble());
        
        byte op;
        
        do{
            System.out.print("\n::::: Computador de Bordo :::::\n\n"
                    + "Escola uma das opções abaixo\n"
                    + "[1] Calcular Distancia a percorrer\n"
                    + "[2] Calcular Gastos conforme o percusso\n"
                    + "[3] Abastecer\n"
                    + "[4] Mostrar todos os dados do veículo\n"
                    + "[0] Sair do programa\n"
                    + "Digite aqui a opção informada: ");
            op = leia.nextByte();
            
            switch (op){
                case 1:
                    System.out.println("");
                    System.out.print("\n:::::::::::::::::::::::::::::\nA distância a percorrer: "+objCarro.calcularDistanciaAPercorrer()
                    + "\n:::::::::::::::::::::::::::::\n");
                    break;
                case 2:
                    System.out.print("\n::::::::::::::::::::::::::::::::::::::::::::\nInforme a distância que será percorrida: ");
                    System.out.print("Quantidade de litros que seram gastos: "+objCarro.calcularConsumo(leia.nextDouble())
                    + "\n::::::::::::::::::::::::::::::::::::::::::::\n");
                    break;
                case 3:
                    System.out.print("\n:::::::::::::::::::::::::::::::::::\nInforme o preço do litro: R$ ");
                    double valorLitro = leia.nextDouble();
                    System.out.print("Quanto você quer abastecer? R$ ");
                    double valorTotal = leia.nextDouble();
                    objCarro.abastecer(valorLitro, valorTotal);
                    System.out.print("Quantidade de combustível: "+objCarro.getQtdDeCombustivel()
                    + "\n:::::::::::::::::::::::::::::::::::\n");
                    break;
                case 4:
                    System.out.print(objCarro);        
                    break;
                case 0:
                    System.out.println("\n::::::::::::::::::\nSistema encerrado!\n::::::::::::::::::");
                    break;
                default:
                    System.out.println("Opção inválida\nDigite novamente: ");  
            }
        }while (op != 0);
    }   
}
