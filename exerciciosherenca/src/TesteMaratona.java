public class TesteMaratona {
    public static void main(String[] args) {

        AtletaAmador atletaamador1 = new AtletaAmador("Lucas", "Masculino", 18, 1.70, true);
        AtletaAmador atletaamador2 = new AtletaAmador("Ana", "Feminino", 18, 1.90, false);
        AtletaProfissional atletaprofissional = new AtletaProfissional("Maicon", "Masculino", 16, 1.90, 80.00);

        atletaamador1.verificaSituação();
        atletaamador2.verificaSituação();
        atletaprofissional.verificaSituação();

    }
}
