public class Maratona {
    protected String nome;
    protected String sexo;
    protected int idade;
    protected double altura;

    public Maratona(String nome, String sexo, int idade, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nAltura: " + altura;
    }

    public void verificaSituação() {
        {
            if (getIdade() < 18 || getAltura() < 1.80) {
                System.out.println("Não poderá competir!");
            } else {
                System.out.println("Tudo ok.");
            }
        }
    }
}