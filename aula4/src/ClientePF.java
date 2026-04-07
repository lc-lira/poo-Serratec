public class ClientePF extends Cliente {
    private String cpf;
    private String rg;
    
    public ClientePF(int codigo, String nome, String email, String cpf, String rg) {
        super(codigo, nome, email);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    
}
