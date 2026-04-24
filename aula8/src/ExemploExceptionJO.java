import javax.swing.JOptionPane;

public class ExemploExceptionJO {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Entre com 1° num.:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Entre com 2° num.:"));

            JOptionPane.showMessageDialog(null, calcular(a, b));
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro", "Divisao por zero", 0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro", "Voce digitou um caracter invalido", 0);
        }

    }

    public static int calcular(int a, int b) {
        // if (b == 0) {
        // throw new ArithmeticException("Divisão por zero!");
        return a / b;

        // }
    }
}
