public class Exemplo2 {
    public static void main(String[] args) {
   
    String dia = "Domingo";
    
    String resultado = switch(dia){
            case "Segunda" -> "dia da semana";
            case "Terça" -> "dia da semana";
            case "Quarta" -> "dia da semana";
            case "Quinta" -> "dia da semana";
            case "Sexta" -> "dia da semana";
            case "Sábado" -> "dia da semana";
            case "Domingo" -> "dia da semana";
            default -> "Dia inválido";
        };
        System.out.println(resultado);
        
        String time = "Fluminense";
        String resposta = switch(time){
            case "Flamengo","Vasco","Fluminense"->"Rio de Janeiro";
            case "São Paulo", "Palmeiras", "Santos", "Corinthians" -> "São Paulo";
            default -> "outro estado";
        };
        System.out.println(resposta);
    
    }
}
