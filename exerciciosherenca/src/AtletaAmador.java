public class AtletaAmador extends Maratona {
    private boolean atestado = false;

    public AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
        super(nome, sexo, idade, altura);
        this.atestado = atestado;
    }

    public boolean isAtestado() {
        return atestado;
    }

}
