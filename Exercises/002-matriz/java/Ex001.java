import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex001 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new
                BufferedReader(new InputStreamReader(System.in));

        int[][] matriz = new int[4][2];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Digite os valores da " + (i + 1) + "a. linha");
            String[] line = in.readLine().split(" ");
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = Integer.parseInt(line[j]);
            }
        }

        System.out.println("Valores:");

        for (int[] line : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(line[j] + "   ");
            }
            System.out.println();
        }

        System.out.println("Soma dos Valores:");

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                soma += matriz[i][j];
                System.out.print(matriz[i][j] + "  " + ((j == 0) ? "+" : "=") + "  ");
            }
            System.out.println(soma);
        }

    }

}
