import java.time.LocalDate;

public class TesteOficina {
    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario("Caíke");
        Carro carro = new Carro("Lamborghini aventador", LocalDate.of(2026,8,11), proprietario, "Espostivo");
        carro.trocarOleo();
        carro.revisao();

        System.out.println(proprietario);
        System.out.println(carro);
        System.out.println(carro.valorCobrado);
    }
}
