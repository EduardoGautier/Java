public class Semana {
    public String mostrarDiadaSemana(byte numeroDoDia){
        switch (numeroDoDia) {
            case 1:
                return "O dia "+numeroDoDia+" é Domingo";
            case 2:
                return "O dia "+numeroDoDia+" é Segunda-Feira";
            case 3:
                return "O dia "+numeroDoDia+" é Terça-Feira";
            case 4:
                return "O dia "+numeroDoDia+" é Quarta-Feira";
            case 5:
                return "O dia "+numeroDoDia+" é Quinta-Feira";
            case 6: 
                return "O dia "+numeroDoDia+" é Sexta-Feira";
            case 7:
                return "O dia "+numeroDoDia+" é Sábado";
        }
                return "Número inválido";
        }
}   

