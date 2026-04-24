/* 
Criar um  novo projeto com o nome aula-vetor.  Criar um pacote com o nome aula.
	Criar uma classe com o nome Funcionario
  	- atributos  private do Funcionario :  nome, cargo, e salario

	- Métodos da classe Funcionario.

	- Crie  o método  abonoSalario na classe Funcionario . 

	O abono é acrescido ao salário do funcionário

	- Construa dois objetos em um vetor em outra classe com o nome TestaFuncionario 
	com quaisquer dados.

	- Exiba os dados dos funcionários com o abono salarial.*/
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];

        funcionarios[0] = new Funcionario("Lucas", "Programador", 2000);
        funcionarios[1] = new Funcionario("Douglas", "Programador", 2100);

        funcionarios[0].abonoSalario(200);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

    }

}
