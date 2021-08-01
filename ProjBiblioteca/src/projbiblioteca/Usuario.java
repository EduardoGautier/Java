/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projbiblioteca;

public class Usuario {
    private String nome;
    private int codigo;
    private long cpf;
    private Endereco objEndereco;
    
    public Usuario(){
        this.objEndereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Endereco getObjEndereco() {
        return objEndereco;
    }

    public void setObjEndereco(Endereco objEndereco) {
        this.objEndereco = objEndereco;
    }
    
    @Override
    public String toString(){
        return "\n"
                + "Nome: "+nome+"\n"
                + "Código: "+codigo+"\n"
                + "Cpf: "+cpf+"\n"
                + "Endereço do cliente "+this.objEndereco;  
    }
    
    
}
