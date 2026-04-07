import javax.swing.JOptionPane;

public class Exemplo {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        JOptionPane.showMessageDialog(null ,(num1+num2)/2);

    }
}
