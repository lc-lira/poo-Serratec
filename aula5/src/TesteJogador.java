public class TesteJogador {
    public static void main(String[] args) {
        Time time = new Time("Flamengo", "Léonador Jardim", new Jogador[3]);
        Jogador j1 = new Jogador("Gabigol", 32, "genio");
        Jogador j2 = new Jogador("UnoHenrique", 32, "poeta incompreendido");
        Jogador j3 = new Jogador("Emerson Royal", 30, "imbecil");

        time.adicionarJogador(j1);
        time.adicionarJogador(j2);
        time.adicionarJogador(j3);

        System.out.println(time.getNome());
        time.listarJogadores();
        

    }
}
