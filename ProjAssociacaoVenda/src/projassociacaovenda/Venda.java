package projassociacaovenda;

public class Venda {
    private int codigo;
    private Data dataVenda;
    private Livro objLivro1;
    private Livro objLivro2;
    
    public Venda(){
        this.dataVenda = new Data();
        this.objLivro1 = new Livro();
        this.objLivro2 = new Livro();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Data getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Data dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Livro getObjLivro1() {
        return objLivro1;
    }

    public void setObjLivro1(Livro objLivro1) {
        this.objLivro1 = objLivro1;
    }

    public Livro getObjLivro2() {
        return objLivro2;
    }

    public void setObjLivro2(Livro objLivro2) {
        this.objLivro2 = objLivro2;
    }
    
    public double calcularVenda(){
        return this.objLivro1.getValor() + this.objLivro2.getValor();
    }

    @Override
    public String toString() {
        return  "Dados da venda\n"
                + "Codigo: " + codigo + "\n"
                + "Data venda: " + dataVenda + "\n"
                + "\nDados do livro 1 " + objLivro1 + "\n"
                + "\nDados do livro 2 " + objLivro2 + "\n"
                + "\nValor venda: " + this.calcularVenda();
        
    }
    
    
    
    
    
    
    
    
}
