public class ClientePJ extends Cliente {
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;
    
    public ClientePJ(int codigo, String nome, String email, String cnpj, String razaoSocial, String inscricaoEstadual) {
        super(codigo, nome, email);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    
}
