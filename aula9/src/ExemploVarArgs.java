public class ExemploVarArgs {
    public static void main(String[] args) {
        int total = calcularSoma(10,20,30,2,50,100); 
        System.out.println("Total:" + total);
    }
    //o varargs aceita uma quantidade sem limites de elmentos
    public static int calcularSoma(int...numeros){
        numeros[5] = 200;
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}
