public class TestePlano {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Amil", "12341", "Checkup");
        Medico medico = new Medico("Amil", "122", "Carlos");
        Anestesista anestesista = new Anestesista("Amil", "2132", "José", "Raqui");
        
        ControlePagamento cp = new ControlePagamento();

        medico.calcularPagamento();
        anestesista.calcularPagamento();

        System.out.println(clinica);
        System.out.println("Valor Pago Clínica: " + clinica.calcularPagamento());
        cp.calcularTotalPago(clinica);

        System.out.println(medico);
        System.out.println("Valor Pago Médico: " + medico.calcularPagamento());
        cp.calcularTotalPago(medico);

        System.out.println(anestesista);
        System.out.println("Valor Pago Anestesista: " + anestesista.calcularPagamento());
        cp.calcularTotalPago(anestesista);

        System.out.println("Total pago: " + cp.getTotalPago());
    }
}
