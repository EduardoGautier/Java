import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Semana objSemana = new Semana();
        byte numeroDoDia;
        

        do{
            System.out.print(":::::::::::::::::\n: Dia da Semana :\n:::::::::::::::::\n"
                    + "Informe um número para o dia da semana: ");
            numeroDoDia = leia.nextByte();
            
            System.out.println(objSemana.mostrarDiadaSemana(numeroDoDia));
        }while(numeroDoDia <1 || numeroDoDia >7);
    }
}
