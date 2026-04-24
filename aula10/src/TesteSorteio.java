public class TesteSorteio {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joao", 2000);
        Funcionario f2 = new Funcionario("Maria", 4000);
        Funcionario f3 = new Funcionario("Adriana", 2000);
        Funcionario f4 = new Funcionario("Carlos", 3000);

        Sorteio<Funcionario> sorteio = new Sorteio<>();
        sorteio.adicionar(f1);
        sorteio.adicionar(f2);
        sorteio.adicionar(f3);
        sorteio.adicionar(f4);
        
        System.out.println("Funcionario sorteado foi: "+ sorteio.sortear());

        Integer num1 = 10;
        Integer num2 = 120;
        Integer num3 = 12  ;

    }
}
