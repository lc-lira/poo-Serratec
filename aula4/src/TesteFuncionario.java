public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(123, "Ana", "12345", 5000, "3456", "ADM", 10);
        Diretor diretor = new Diretor(567, "Maria", "3434", 10000, "Produção");

        gerente.autenticacao("123");
        System.out.println(gerente.imprimirContraCheque());
        System.out.println(gerente.toString());
        
        gerente.reajusteSalario();
        System.out.println("Salário atualizado gerente "+ gerente.getSalario());
        
        diretor.reajusteSalario();
        System.out.println("Salário atualizado diretor "+ diretor.getSalario());
    }
}
