public class Usuario {
    private String nome;
    private String cpf;
    //private List<livro> livrosEmprestados;

    public Usuario(){
    }

    public Usuario(String nome, String cpf){

        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }

   // public void pegarLivro(){
//
   // }
    public void devolverLivro(Livro livro){

    }
}
