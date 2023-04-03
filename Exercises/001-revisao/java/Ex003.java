import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex003 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String entrada = in.readLine();
        char[] lista = entrada.toCharArray();

        for (int i = lista.length - 1; i >= 0; i--) {
            System.out.print(lista[i]);
        }
    }

}
