import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
      List produtos = new ArrayList<>();
        
      produtos.add("celular");
      produtos.add("tv");
      produtos.remove(1);
        produtos.set(0,"Celular Samsung");

        for (Object produto: produtos) {
            System.out.println(produto);
        }
    }
}
