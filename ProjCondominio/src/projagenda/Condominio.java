package projagenda;

import java.util.ArrayList;

public class Condominio {

    private ArrayList<Morador> listaDeMorador;

    public Condominio() {
        this.listaDeMorador = new ArrayList<>();
    }

    public ArrayList<Morador> getlistaDeMorador() {
        return listaDeMorador;
    }

    public void setlistaDeMorador(ArrayList<Morador> listaDeMorador) {
        this.listaDeMorador = listaDeMorador;
    }

    public Morador pesquisarPagamento(String Pago) {
        for (int i = 0; i < this.listaDeMorador.size(); i++) {
            if (this.listaDeMorador.get(i).getPago().equalsIgnoreCase(Pago)) {
                return this.listaDeMorador.get(i);
            }
        }
        return null;
    }
        public Morador pesquisarMoradorNome(String nome) {
        for (int i = 0; i < this.listaDeMorador.size(); i++) {
            if (this.listaDeMorador.get(i).getNome().equalsIgnoreCase(nome)) {
                return this.listaDeMorador.get(i);
            }
        }
        return null;
    }

    public String mostrarTodosOsMorador() {
        String contatos = "┌-----------------┐\n"
                + "│Lista de Moradores│\n"
                + "└-----------------┘\n";
        for (int i = 0; i < this.listaDeMorador.size(); i++) {
          contatos += "\n┌---------┐\n"
                    + "│MORADORES " + (i + 1) + "│\n"
                    + "└---------┘" + this.listaDeMorador.get(i) + "\n";
        }
        return contatos;
    }
    
    public boolean verificarCadastro(String nome) {
        for (int i = 0; i < this.listaDeMorador.size(); i++) {
            if (this.listaDeMorador.get(i).getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n"
                + "Lista de moradores: " + this.mostrarTodosOsMorador();
    }

}
