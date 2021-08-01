
public class Eleicao {

    private int votosChapa1;
    private int votosChapa2;
    private int votosChapa3;

    public int getVotosChapa1() {
        return votosChapa1;
    }

    public int getVotosChapa2() {
        return votosChapa2;
    }

    public int getVotosChapa3() {
        return votosChapa3;
    }

    public void computarVotosParaChapa1() {
        this.votosChapa1++;
    }

    public void computarVotosParaChapa2() {
        this.votosChapa2++;
    }

    public void computarVotosParaChapa3() {
        this.votosChapa3++;
    }

    public int obterTotalDeVotos() {
        return this.votosChapa1 + this.votosChapa2 + this.votosChapa3;
    }

    @Override
    public String toString() {
        if (this.votosChapa1 > this.votosChapa2 && this.votosChapa1 > this.votosChapa3) {

            return "\n"
                    + "Votos chapa 1: " + this.votosChapa1 + "\n"
                    + "Votos chapa 2: " + this.votosChapa2 + "\n"
                    + "Votos chapa 3: " + this.votosChapa3 + "\n"
                    + "Chapa 1 ganhou: " + "\n"
                    + "Total de votos: "+this.obterTotalDeVotos();
  
        }else if(this.votosChapa2>this.votosChapa1&&this.votosChapa2>this.votosChapa3){
            return "\n"
                    + "Votos chapa 1: " + this.votosChapa1 + "\n"
                    + "Votos chapa 2: " + this.votosChapa2 + "\n"
                    + "Votos chapa 3: " + this.votosChapa3 + "\n"
                    + "Chapa 2 ganhou: " + "\n"
                    + "Total de votos: "+this.obterTotalDeVotos();
            
        }else{
            return "\n"
                    + "Votos chapa 1: " + this.votosChapa1 + "\n"
                    + "Votos chapa 2: " + this.votosChapa2 + "\n"
                    + "Votos chapa 3: " + this.votosChapa3 + "\n"
                    + "Chapa 3 ganhou: " + "\n"
                    + "Total de votos: "+this.obterTotalDeVotos();
        }
    }
}
