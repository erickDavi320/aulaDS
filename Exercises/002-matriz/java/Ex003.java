import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex003 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new
                BufferedReader(new InputStreamReader(System.in));

        final int TAM = 5;

        String[][] matriz = new String[TAM][TAM];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Digite os " + TAM +" elementos da " + (i + 1) + "a. linha separados por espaço:");
            String[] line = in.readLine().split(" ");

            System.arraycopy(line, 0, matriz[i], 0, matriz[0].length);
        }

        System.out.println("Matriz:");

        for (String[] line : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(line[j] + "   ");
            }
            System.out.println();
        }

        System.out.println("Elementos Diagonal Principal:");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "   " + ((i == matriz.length - 1) ? "\n" : ""));
        }
    }
}
