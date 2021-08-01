package projhotel;

import java.util.ArrayList;

public class Hotel {

    private String nome;
    private long cnpj;
    private ArrayList<Hospede> listaDeHospede;

    public Hotel() {
        this.listaDeHospede = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Hospede> getListaDeHospede() {
        return listaDeHospede;
    }

    public void setListaDeHospede(ArrayList<Hospede> listaDeHospede) {
        this.listaDeHospede = listaDeHospede;
    }

    public Hospede pesquisarHospedePorCpf(long cpf) {
        for (int i = 0; i < this.listaDeHospede.size(); i++) {
            if (this.listaDeHospede.get(i).getCpf() == cpf) {
                return this.listaDeHospede.get(i);
            }
        }
        return null;
    }

    public ArrayList<Hospede> pesquisarHospedePorSexo(String sexo) {
        ArrayList<Hospede> encontrados = new ArrayList<>();
        for (int i = 0; i < this.listaDeHospede.size(); i++) {
            if (this.listaDeHospede.get(i).getSexo().equalsIgnoreCase(sexo)) {
                encontrados.add(this.listaDeHospede.get(i));
            }
        }
        return encontrados;
    }

    public boolean verificarCadastro(long cpf) {
        for (int i = 0; i < this.listaDeHospede.size(); i++) {
            if (this.listaDeHospede.get(i).getCpf() == cpf) {
                return true;
            }
        }
        return false;
    }

    public String mostrarTodosOsHospedes() {
        String hospedes = "┌-----------------┐\n"
                + "│Lista de Hospedes│\n"
                + "└-----------------┘\n";
        for (int i = 0; i < this.listaDeHospede.size(); i++) {
            hospedes += "\n┌---------┐\n"
                    + "│HOSPEDE " + (i + 1) + "│\n"
                    + "└---------┘" + this.listaDeHospede.get(i) + "\n";
        }
        return hospedes;
    }

    @Override
    public String toString() {
        return "\n"
                + "Nome: " + this.nome + "\n"
                + "Cnpj: " + this.cnpj + "\n"
                + "Lista de Hospedes: " + this.mostrarTodosOsHospedes();
    }
}
