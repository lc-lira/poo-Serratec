public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ",media="+ calcularMedia();
    }

    public double calcularMedia() {
        if(nota1 > 10 || nota2 > 10 || nota1 < 0 || nota2 < 0){
            throw new AlunoException("Valor da nota inválido");
        }
        return (nota1 + nota2) / 2;
    }

}
