package projfuncionarioarray;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private double[] salarios;
    
    public Funcionario(){
        this.salarios = new double[12];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
    
    public void cadastrarSalarios(int indice,double salario){
        this.salarios[indice]= salario;
    }
    
    public double calcular13Salario(){
        double somaDosSalarios = 0;
        for (int i = 0; i < 12; i++){
           somaDosSalarios += this.salarios[i];
        }
        return somaDosSalarios / 12.0;
    }
    
    public double calcularFerias(){
        double media = this.calcular13Salario();
        return media + media / 3.0;
    }
    
    public double mostrarMaiorSalario(){
        double maior = this.salarios[0];
        for(int i = 0; i < 12; i++){
            if(maior<this.salarios[i]){
               maior = this.salarios[i];
            }
        }
        return maior;
    }

    @Override
    public String toString() {
        return "\n" 
                + "Nome: " + nome + "\n"
                + "Salarios: " + Arrays.toString(salarios) +"\n"
                + "13º Salário: "+this.calcular13Salario()+"\n"
                + "Férias: "+this.calcularFerias()+"\n"
                + "Maior salário: "+this.mostrarMaiorSalario();
    }
}
