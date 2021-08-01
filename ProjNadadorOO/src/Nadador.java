public class Nadador {
    private String nome;
    private byte idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
    
    public String classificarNadador(){
        if(idade < 8 || idade > 60){
           return "não pode ser nadador, mínimo 8 anos e no máximo 60";
        }else if(idade <= 10){
            return "Infantil";   
        }else if(idade <= 17 ){
            return "Juvenil";
        }else if(idade <= 49){
            return "Adulto";
        }else{
            return "Terceira Idade";
        }
    }
    
    @Override
    public String toString(){
        return "\n"
                + "Nome: " + this.nome + "\n"
                + "Idade: " + this.idade + "\n"
                + "Classificação: " + this.classificarNadador();
    }
}
