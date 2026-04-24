public class Contato {
    private String nome;
    private Telefone telefones[];

    public Contato(String nome, Telefone[] telefones) {
        this.nome = nome;
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "nome: " + nome;
    }

    public String getNome() {
        return nome;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    public void mostrarTelefones() {
        for (int i = 0; i < telefones.length; i++) {
            System.out.println(telefones[i]);
        }
    }

}
