public class ServidorFederal extends Servidor {
    private String matricula;

    public ServidorFederal(String cpf, String nome, String lOTACAO, String matricula) {
        super(cpf, nome, lOTACAO);
        this.matricula = matricula;
    }

}
