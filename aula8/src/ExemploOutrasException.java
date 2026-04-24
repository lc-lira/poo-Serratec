public class ExemploOutrasException {
    public static void main(String[] args) {
        String fraseEntrada = "Aula java";
        String fraseSaida = null;

        try {
            fraseSaida = fraseEntrada.toUpperCase();
            System.out.println(fraseSaida);
        } catch (NullPointerException e) {
            System.out.println("Erro! Nulo");
            e.printStackTrace();
        }
    }
}
