package projalunoarraylist;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private String turno;
    private ArrayList<Aluno> listaDeAlunos;
    
    public Turma(){
        this.listaDeAlunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    @Override
    public String toString() {
        return "\n" 
                + "Nome: " + nome + "\n"
                + "Turno: " + turno + "\n"
                + "Lista de alunos: " + listaDeAlunos;
    }
}
