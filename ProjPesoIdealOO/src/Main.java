import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa objPessoa = new Pessoa();
        byte op;
        
        System.out.println("Calcular Peso Ideal\n");
        System.out.print("Informe sua altura: ");
        objPessoa.setAltura(leia.nextDouble());
                
        do{
            System.out.print("Informe o sexo: "+ "[1] Masculino" + " - [2] Feminino\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();
            
            switch (op) {
                case 1:
                    objPessoa.setSexo(op);
                    break;
                case 2:
                    objPessoa.setSexo(op);    
            }
        }while(op <1 || op >2);
        System.out.print("Informe seu peso: ");
        objPessoa.setPesoAtual(leia.nextDouble());
        
        System.out.println(objPessoa.toString());   
    }
}
