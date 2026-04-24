import java.util.ArrayList;
import java.util.List;

public class TesteAluno {
    public static void main(String[] args) {
        try {

            List<Aluno> alunos = new ArrayList<>();
            alunos.add(new Aluno("Marcelo", 5, 10));
            alunos.add(new Aluno("Maicon", 6, 3));
            alunos.add(new Aluno("Bruno", 4, 7));
            alunos.add(new Aluno("Rebeca", -1, 7));
            alunos.add(new Aluno("Lucas", 4, 25));
            // alunos.get(0).calcularMedia();
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }

        } catch (AlunoException e) {
            System.err.println(e.getMessage());

        }
    }
}