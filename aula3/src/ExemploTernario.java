public class ExemploTernario {
    public static void main(String[] args) {
        boolean concluida = true;

        if (concluida) {
            System.out.println("Tarefa concluida");
        }else{
            System.out.println("Tarefa não concluida");
        }

        System.out.println(concluida ? "tarefa concluida com sucesso" : "tarefa não concluida");
    }
}
