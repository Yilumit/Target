import javax.swing.JOptionPane;

public class VerificarLetra {
    public static void main(String[] args) {
        String busca = JOptionPane.showInputDialog("Escreva o que quiser: ");
        busca.toLowerCase();
        int tamanho = busca.length(); //para melhorar o tempo de execucao do programa
        int quantidadeA = 0;
        char a = 'a';

        for (int i = 0; i < tamanho; i++) {
            char caracter = busca.charAt(i);
            if (caracter == a) {
                quantidadeA++;
            } 

        }
        JOptionPane.showMessageDialog(null, "A quantidade de letra 'a' encontrada no texto e de: "+ quantidadeA);
    }
}
