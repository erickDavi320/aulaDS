import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double base,altura,area,perimetro;

        System.out.print("Digite a base do retângulo: ");

        base = in.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        altura = in.nextDouble();

        area = base*altura;
        perimetro = 2*(altura+base);

        System.out.println("A área do retângulo é: "+area);
        System.out.println("O perímetro do retângulo é: "+perimetro);
    }
}
