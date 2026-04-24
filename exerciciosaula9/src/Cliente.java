
//2) Criar uma classe chamada Cliente com os atributos: id, nome, idade, telefone. Faça um programa para solicitar os
//dados de vários clientes usando o Scanner e armazenar em um ArrayList até que se digite um número de id negativo.
//Em seguida exiba os dados de todos os clientes em um foreach via System.out, formatando cada objeto separado por
//linhas.
public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", idade=" + idade + ", telefone=" + telefone ;
    }



    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

}
