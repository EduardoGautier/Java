import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Triangulo objTriangulo = new Triangulo();

        do {
            System.out.print("\n:::::::::::::::::::::::::::::::::::\n: Informe as medidas do triangulo :\n:::::::::::::::::::::::::::::::::::\n");
            System.out.print("Lado A: ");
            objTriangulo.setLadoA(leia.nextDouble());
            System.out.print("Lado B: ");
            objTriangulo.setLadoB(leia.nextDouble());
            System.out.print("Lado C: ");
            objTriangulo.setLadoC(leia.nextDouble());
            System.out.print("Angulo AB: ");
            objTriangulo.setAnguloAB(leia.nextDouble());
            System.out.print("Angulo BC: ");
            objTriangulo.setAnguloBC(leia.nextDouble());
            System.out.print("Angulo CA: ");
            objTriangulo.setAnguloCA(leia.nextDouble());
            
            if (objTriangulo.validarTriangulo()) {
            } else {
                System.out.println("\nTriângulo inválido!\nDigite novamente");
            }

        }while(!objTriangulo.validarTriangulo());
        
        System.out.println(objTriangulo.toString());
    }

}
