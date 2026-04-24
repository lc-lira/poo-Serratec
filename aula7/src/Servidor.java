//o final na classe serve para q a classe n posso ter filho
public class Servidor {
    protected String cpf;
    protected String nome;
    // atributo constante
    protected final String LOTACAO;

    public Servidor(String cpf, String nome, String lOTACAO) {
        this.cpf = cpf;
        this.nome = nome;
        LOTACAO = lOTACAO;
    }

    // o método n pd ser sobreescrito
    public final String imprimirServidores() {
        return "Dados dos servidores";
    }

}
