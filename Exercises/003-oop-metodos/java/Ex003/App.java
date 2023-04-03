import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Matematica mat = new Matematica();
		
		
		System.out.println("Digite a operacao desejada: [+, -, *, /]");
		char c = in.next().toCharArray()[0];
		
		System.out.println("Informe o primeiro valor: ");
		mat.valorUm = in.nextDouble();
		System.out.println("Informe o segundo valor: ");
		mat.valorDois = in.nextDouble();
		
		in.close();
		
		
		switch(c) {
		
			case '/': {	
				System.out.println(mat.valorUm+" / "+mat.valorDois+" = "+mat.fazerDivisao(mat.valorUm, mat.valorDois));
				break;
			}
			case '*': {	
				mat.fazerMultiplicacao(mat.valorUm, mat.valorDois);
				System.out.println(mat.valorUm+" x "+mat.valorDois+" = "+mat.resultado);
				break;
			}
			case '+': {	
				mat.fazerSoma();
				System.out.println(mat.valorUm+" + "+mat.valorDois+" = "+mat.resultado);
				break;
			}
			case '-': {
				System.out.println(mat.valorUm+" - "+mat.valorDois+" = "+mat.fazerSubtracao());
				break;
			}
			default: {
				System.out.println("foi nao ;-;");
			}
		}
	}

}