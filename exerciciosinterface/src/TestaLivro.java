public class TestaLivro {
public static void main(String[] args) {
    Livro lv1 = new Livro("Marco Antonio", "Cisco CCNA", 85.00);
    Livro lv2 = new Livro("Kathy Sierra", "Use a Cabeça Java", 98.00);

    Operacao operacao1 = new Operacao("Venda", 85.00, lv1);
    Operacao operacao2 = new Operacao("Empréstimo", 98.00, lv2);

}
}
