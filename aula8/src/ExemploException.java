public class ExemploException {
    public static void main(String[] args) {
        try {
            System.out.println("Resultado:" + calcular(2, 2));
        } catch (Exception e) {
            System.err.println("Erro! Divisao por zero");
        } finally {
            System.out.println("Fim do programa!");
        }

    }

    public static int calcular(int a, int b) {
        // if (b == 0) {
        // throw new ArithmeticException("Divisão por zero!");
        return a / b;

        // }
    }
}