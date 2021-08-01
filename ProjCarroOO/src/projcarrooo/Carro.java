package projcarrooo;
public class Carro {
    private String marca;
    private String modelo;
    private int kilometragem;
    private double valor;
    private String opcionais;
    
    public Carro(String marca,String modelo,double valor){
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.kilometragem = 0;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    @Override
    public String toString() {
        return "\nDados do carro\n" + "\n"
                + "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Kilometragem: " + kilometragem + "\n"
                + "Valor: " + valor + "\n"
                + "Opcionais: " + opcionais;
    }
    
    
    
    
}
