import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Imc imc = new Imc();
		
		System.out.println("Digite o peso da cobaia: ");
		double peso = in.nextDouble();
		System.out.println("Digite a altura da cobaia: ");
		double altura = in.nextDouble();
		
		in.close();
		
		System.out.println("O seu Status de IMC �: " + imc.statusImc(peso, altura));
		
		
	}
}
