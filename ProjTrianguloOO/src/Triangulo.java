/*
-ladoA: double
-ladoB: double
-ladoC: double
-anguloAB: double -anguloBC: double
-anguloCA: double
 */
public class Triangulo {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double anguloAB;
    private double anguloBC;
    private double anguloCA;

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getAnguloAB() {
        return anguloAB;
    }

    public void setAnguloAB(double anguloAB) {
        this.anguloAB = anguloAB;
    }

    public double getAnguloBC() {
        return anguloBC;
    }

    public void setAnguloBC(double anguloBC) {
        this.anguloBC = anguloBC;
    }

    public double getAnguloCA() {
        return anguloCA;
    }

    public void setAnguloCA(double anguloCA) {
        this.anguloCA = anguloCA;
    }

    public boolean validarTriangulo() {
        return this.ladoA < this.ladoB + this.ladoC && this.ladoB < this.ladoC + this.ladoA && this.ladoC < this.ladoA + this.ladoB && this.anguloAB + this.anguloBC + this.anguloCA == 180 && this.anguloAB > 0 && this.anguloBC > 0 && this.anguloCA > 0;
    }

    public String classificarLados() {
            if (this.ladoA == this.ladoB && this.ladoB == ladoC) {
                return "Equilátero";
            } else if (this.ladoA != this.ladoB && this.ladoB != this.ladoC && this.ladoC != this.ladoA) {
                return "Escaleno";
            }else{
                return "Isósceles";
            }
        }
        
    public String classificarAngulos() {
        if (this.anguloAB > 90 || this.anguloBC > 90 || this.anguloCA > 90) {
            return "Obtusângulo";
        } else if (anguloAB < 90 && anguloBC < 90 && anguloCA < 90) {
            return "Acutângulo";
        }
        return "Retângulo";
    }

    @Override
    public String toString() {
        return "\n::::::::::::::::::::::::::::::\n: Classificação do triangulo :\n::::::::::::::::::::::::::::::\n"
                + "Lado: " + this.classificarLados() + "\n"
                + "Ângulo: " + this.classificarAngulos();
    }

}
