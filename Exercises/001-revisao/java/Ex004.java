import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double preco,margemLucro,novoValor;
        String continuar = "";

        do {
            System.out.print("Informe o preço: ");
            preco = in.nextDouble();

            System.out.print("Informe a margem de lucro: ");
            margemLucro = in.nextDouble();

            novoValor = (preco * margemLucro / 100) + preco;

            System.out.println("o novo valor será: "+novoValor);

            System.out.println("O programa deve continuar? (S/N)");
            continuar = in.next();
        } while (continuar.equals("S"));



    }
}
