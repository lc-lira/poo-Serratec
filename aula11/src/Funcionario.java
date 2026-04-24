public class Funcionario {
    private String nome;
    private String profissao;

    public Funcionario(String nome, String profissao) {
        this.nome = nome;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", profissao=" + profissao + "]";
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

}
