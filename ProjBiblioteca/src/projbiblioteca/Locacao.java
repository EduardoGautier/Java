package projbiblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Locacao {
    private double valorLocacao;
    private double valorMulta;
    private Data dataLocacao;
    private Data dataDevolucao;
    private Livro objLivro;
    private Funcionario objFuncionario;
    private Usuario objUsuario;
    
    
    public Locacao(){
        this.dataLocacao = new Data();
        this.dataDevolucao = new Data();
        this.objLivro = new Livro();
        this.objFuncionario = new Funcionario();
        this.objUsuario = new Usuario();
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Data getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Data dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Data getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Data dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getObjLivro() {
        return objLivro;
    }

    public void setObjLivro(Livro objLivro) {
        this.objLivro = objLivro;
    }

    public Funcionario getObjFuncionario() {
        return objFuncionario;
    }

    public void setObjFuncionario(Funcionario objFuncionario) {
        this.objFuncionario = objFuncionario;
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }
    
    public double calcularLocacao() throws ParseException {

        SimpleDateFormat objDataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        Date dataLoc = objDataFormatada.parse(dataLocacao.toString()); 
        Date dataDev = objDataFormatada.parse(dataDevolucao.toString());

        long dias = ((dataDev.getTime() - dataLoc.getTime()) / 86400000);
        if (dias < 7) {
            return this.valorLocacao;
        } else {
            return ((dias - 7) * this.valorMulta) + this.valorLocacao;
        }
    }
    
    public void locarLivro(){
        this.objLivro.status = true;
    }
    
    public void devolverLivro(){
        this.objLivro.status = false;
    }
    
    @Override
    public String toString(){
                return "\n::::::::::::::::::::::\n:: Dados da Locação ::\n::::::::::::::::::::::\n"
                + "Valor da locação: " + valorLocacao + "\n"
                + "Valor da multa: " + valorMulta + "\n"
                + "Data da locação: " + dataLocacao + "\n"
                + "Data da devolução: " + dataDevolucao +"\n"
                + "\n::::::::::::::::::::\n:: Dados do livro ::\n::::::::::::::::::::"+objLivro+"\n"
                + "\n::::::::::::::::::::::::::\n:: Dados do funcionário ::\n::::::::::::::::::::::::::"+objFuncionario+"\n"
                + "\n::::::::::::::::::::::\n:: Dados do usuário ::\n::::::::::::::::::::::"+objUsuario;                     
    }
}
