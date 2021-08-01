package projrevendacarroarraylist;

public class Carro {
    private String marca;
    private int ano;
    private String placa;
    private double valor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\n" 
                + "Marca: " + marca + "\n"
                + "Ano: " + ano + "\n"
                + "Placa: " + placa + "\n"
                + "Valor: " + valor;
    }
}
