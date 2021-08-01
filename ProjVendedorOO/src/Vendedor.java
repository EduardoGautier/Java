public class Vendedor {
    private String nome;
    private float meta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMeta() {
        return meta;
    }

    public void setMeta(float meta) {
        this.meta = meta;
    }
    public double calcularComissao(float valorVendido){
        double diferenca = valorVendido/meta;
        double comissao;
        if(diferenca<0.5){
            comissao = valorVendido*0.01;
        }else if(diferenca<=0.75){
            comissao = valorVendido*0.025;
        }else if(diferenca<=1){
            comissao = valorVendido*0.035;
        }
        return comissao = valorVendido*0.05; 
    }
    
    @Override
    public String toString(){
        return "\nDados do Vendedor\n"
                +"Nome: "+this.nome +"\n"
                +"Meta: "+this.meta;
    }  
}
