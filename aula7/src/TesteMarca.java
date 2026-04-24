public class TesteMarca {
    public static void main(String[] args) {
        Equipamento eq = new Equipamento(1,"Mouse", Marca.MICROSOFT);

        System.out.println(eq);

        System.out.println("*****Todas as Marcas*****");
        //foreach
        for (Marca m: Marca.values()) {
            System.out.println(m);
        }
        
    }
}
