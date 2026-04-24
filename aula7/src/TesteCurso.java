public class TesteCurso {
    public static void main(String[] args) {
        Turma turma1 = new Turma("Java 0.0", PeriodoCurso.MANHA); 
        Turma turma2 = new Turma("Curso do pedraosenai", PeriodoCurso.INTEGRAL);

        System.out.println(turma2.getCurso());
        System.out.println(turma2.getPc().getDia());
        System.out.println(turma2.getPc().getValor());
        System.out.println(turma2.getPc().getCargaHoraria());
    }
}
