import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex002 {

    public static char[][] board = new char[3][3];
    public static String formaVencer;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new
                BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < board.length; i++) {
            System.out.println("Digite os valores da " + (i + 1) + "a. linha");
            String[] line = in.readLine().toLowerCase().split(" ");

            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = line[j].toCharArray()[0];
            }
        }

        System.out.println("Tabuleiro:");

        for (char[] line : board) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(line[j] + "   ");
            }
            System.out.println();
        }

        // Verificação Ganhador
        char ganhador = getGanhador(board);

        if (ganhador == 'F') {
            System.out.println("Xiiii! Deu Velha!");
        } else {
            System.out.println("O jogador " + Character.toUpperCase(ganhador) + " ganhou na " + formaVencer);
        }

    }

    public static char getGanhador(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            // Linha
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                formaVencer = "linha";
                return board[i][0];
            }

            // Coluna
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                formaVencer = "coluna";
                return board[0][i];
            }
        }

        // Diagonal Principal
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            formaVencer = "diagonal principal";
            return board[0][0];
        }

        // Diagonal Secundaria
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            formaVencer = "diagonal secundaria";
            return board[0][2];
        }

        return 'F';
    }
}

