public class Funcionario {
    private String nome;
    private double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    public double calcularInss(double salario){
        this.salario = salario;
        double salarioInss = (salario*11)/100;
            return salarioInss;

    }
    public double calcularVt(double salario){
        this.salario = salario;
            double salarioVt = (salario*6)/100;
            return salarioVt;

    }
    public double CalcularLq(double salario){
        this.salario = salario;
            double salarioInss =(salario*11)/100;
            double salarioVt = (salario*6)/100;
            double salarioLq = (salario-salarioInss-salarioVt);
            return salarioLq;
    }

}
