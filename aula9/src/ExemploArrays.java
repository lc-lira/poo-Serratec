import java.util.Arrays;
import java.util.List;

public class ExemploArrays {
    public static void main(String[] args) {
        List produtos = Arrays.asList("celular","TV","Relogio","Kindle");
        //não posso adicionar novos elementod so vetor
        //produtos.add("Som");
        //posso modicificar elementos existentes
        produtos.set(1, "Tv 42");

        for (Object o : produtos) {
            System.out.println(o);
        }

    }
}
