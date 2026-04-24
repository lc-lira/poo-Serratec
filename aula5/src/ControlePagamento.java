public class ControlePagamento {
    private double totalPago;

    public double getTotalPago() {
        return totalPago;
    }

    public void calcularTotalPago(PlanoSaude planoSaude){
        totalPago += planoSaude.getValorPago();
    }

}
