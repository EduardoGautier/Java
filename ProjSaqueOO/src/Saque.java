public class Saque {
    private int valor;

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    /*
    +calcularNotasDe100(): int
    +calcularNotasDe50 ():int
    +calcularNotasDe5 (): int
    +calcularNotasDe1(): int
    +toString():String
    */
    public int calcularNotasDe100(){
        return this.valor / 100;
    }
    public int calcularNotasDe50(){
        return this.valor % 100 / 50;
    }
    public int calcularNotasDe5(){
        return this.valor % 100 % 50 / 5;
    }
    public int calcularNotasDe1(){
        return this.valor %100 % 50 %5 / 1;
    }
    @Override
    public String toString(){
        return "\n:::::::::\n: Caixa :\n:::::::::\n"
                +"O caixa emitirá "+this.calcularNotasDe100()+" nota(s) de 100\n"
                +"O caixa emitirá "+this.calcularNotasDe50()+" nota(s) de 50\n"
                +"O caixa emitirá "+this.calcularNotasDe5()+" nota(s) de 5\n"
                +"O caixa emitirá "+this.calcularNotasDe1()+" nota(s) de 1";
    }
}
