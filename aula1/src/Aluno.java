public class Aluno {
    //Atributos
    int matricula, idade;
    String nome, telefone;
    double nota1, nota2;

    //Comportamentos - Métodos

    //Método sem retorno
    public void imprimir(){
        System.out.println("Bem vindo a escola!");
    }

    //Método com retorno
    public double calcularMedia(){
        return (nota1+nota2)/2;
    }

}