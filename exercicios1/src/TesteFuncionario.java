import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        double salario;

        System.out.println("Digite seu nome: ");
        nome = sc.next();

        System.out.println("Digite seu salário: ");
        salario = sc.nextInt();

        Funcionario funcionario = new Funcionario(nome, salario);

        String textocompleto =  String.valueOf("Salário: " + salario + "\nSalário Líquido: " + funcionario.CalcularLq(salario) + "\nINSS: " + funcionario.calcularInss(salario) + "\nVale Transporte: " + funcionario.calcularVt(salario));
        JOptionPane.showMessageDialog(null,textocompleto);
        
    }
}
