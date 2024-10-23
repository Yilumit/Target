
import javax.swing.JOptionPane;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 0, y = 1, fib = 0;

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para descobrir se faz parte da sequencia de Fibonacci: "));

        while (num < 0) {
            JOptionPane.showMessageDialog(null, "O numero deve ser positivo!");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para descobrir se faz parte da sequencia de Fibonacci: ")); 
        }

        while (fib < num) {
            fib = x + y;
            x = y;
            y = fib;
        }
        if (fib == num) {
            JOptionPane.showMessageDialog(null, "O numero "+ num +" faz parte da sequencia de Fibonacci!");
        } else {
            JOptionPane.showMessageDialog(null, "O numero "+ num +" NAO faz parte da sequencia de Fibonacci!");       
        }

    }
}