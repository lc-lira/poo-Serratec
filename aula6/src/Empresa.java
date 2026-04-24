public class Empresa implements Tributos {
    private String razaosSocial;
    private double rendimentos;

    public Empresa(String razaosSocial, double rendimentos) {
        this.razaosSocial = razaosSocial;
        this.rendimentos = rendimentos;
    }

    public String getRazaosSocial() {
        return razaosSocial;
    }

    public double getRendimentos() {
        return rendimentos;
    }

    @Override
    public double calcularImpostoRenda() {
        return rendimentos * impostoRendaPJ;
    }

    @Override
    public double calcularIcms() {
        return rendimentos * icms;
    }

}
