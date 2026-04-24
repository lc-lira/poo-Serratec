import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
    private String categoria;

    public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario,
            String categoria) {
        super(modelo, dataConserto, proprietario);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public double lavarVeiculo() {
        return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
    }

    @Override
    public double revisao() {
        if (dataConserto.getMonth() == Month.AUGUST) {
            return valorCobrado += TipoServico.REVISAO.getValorPorServico() * 0.9;
        }
        else{
            return valorCobrado += TipoServico.REVISAO.getValorPorServico();
        }
    }

    @Override
    public double trocarOleo() {
        if (dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY) {
            return valorCobrado += TipoServico.OLEO.getValorPorServico() - 50;
        } else {
            return valorCobrado += TipoServico.OLEO.getValorPorServico();
        }
    }

}
