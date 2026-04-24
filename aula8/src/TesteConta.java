public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, "Lucas", 2000);
        try {
            cc.deposito(0);
        } catch (ContaException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("saldo atual é: " + cc.getSaldo());
        }

    }
}
