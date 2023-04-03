import java.util.Scanner;

public class Ex003Part2 {

    public static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);

        System.out.println("Digite um numero de 3 algarismos:");
        int num = in.nextInt();

        int[] algarismos = new int[3];

        algarismos[0] = num % 10;
        num /= 10;
        algarismos[1] = num % 10;
        num /= 10;
        algarismos[2] = num % 10;

        for (int alg: algarismos) {
            System.out.print(alg);
        }

    }
}
