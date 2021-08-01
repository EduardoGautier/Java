package projassociacaovenda;

public class Data {
    private byte dia;
    private byte mes;
    private int ano;

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\n"
                + "Dia: " + dia + "\n"
                + "Mes: " + mes + "\n"
                + "Ano: " + ano;
    }
    
    
    
}
