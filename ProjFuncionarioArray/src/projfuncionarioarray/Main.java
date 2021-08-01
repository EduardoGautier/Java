package projfuncionarioarray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Funcionario objFuncionario = new Funcionario();
        
        System.out.println("Cadastro de funcionário");
        System.out.print("Nome: ");
        objFuncionario.setNome(leia.next());
        System.out.println("Informe os 12 salários");
        for(int i = 0; i < 12; i++){
            System.out.print((i+1)+"º salário: ");
            objFuncionario.cadastrarSalarios(i, leia.nextDouble());
        }
        
        System.out.println(objFuncionario);
        
        
        
        

    }
    
}
