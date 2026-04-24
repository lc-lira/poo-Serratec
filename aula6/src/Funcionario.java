//abstract - n pd ter instancia
public abstract class Funcionario {
    protected int id;
    protected String nome;
    protected double salario;
    protected String turno;
    protected Setor setor;

    public Funcionario(int id, String nome, double salario, String turno, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.turno = turno;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario:" + id + ", nome:" + nome + ", salario:" + salario + ", turno:" + turno + ", setor="
                + setor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }

    public Setor getSetor() {
        return setor;
    }

    //Método abstrato - obriga os filhos a implementarem o código do metodo
    //na classe super temos somente a assinatura do metodo sem corpo

    public abstract void reajustarSalario();

}