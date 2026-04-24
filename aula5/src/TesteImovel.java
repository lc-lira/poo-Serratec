public class TesteImovel {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario(1, "Arthur");
        Proprietario p2 = new Proprietario(2, "Lucas");

        Imovel imovel1 = new Imovel("Casa", "Rua Dr. Thouzet", 195000, p1);
        Imovel imovel2 = new Imovel("Apartemento", "Rua Dr. Thouzet", 200000, p2);
        
    }
}
