import java.util.List;

public class ExemploListOf {
    public static void main(String[] args) {
        List produtos = List.of("Celular","Tv","relogio");
        //não aceita novos elementos
        //produtos.add("Pen drive");
        //não aceita modificacoes de elementos da lista
        //produtos.set(0, produtos);

        for (Object o : produtos) {
            System.out.println(o);
        }
    }
}
