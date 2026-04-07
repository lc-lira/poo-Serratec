public class Medico {
    private int crm;
    private String nome;
    private double valorConsulta;
    private static int totalMedicos = 0;

    
    public Medico(int crm, String nome, double valorConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.valorConsulta = valorConsulta;
        totalMedicos++;

    }

    public static int getTotalMedicos() {
        return totalMedicos;
    }

    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

}
