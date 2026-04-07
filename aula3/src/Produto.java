public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    
    //construtor default - ele é implicito e n tem parametros
    public Produto(){
        System.out.println("Construtor vazio executado!");
    }
    
    //construtor cheio - possui todos os atributos como parametro
    public Produto(int codigo, String nome, double preco){
        System.out.println("Construtor cheio executado");
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    
}
