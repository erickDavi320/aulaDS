import java.util.Scanner;

public class App {
	
	public static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		Matematica mat = new Matematica();
		
		
		System.out.println("Digite a operacao desejada: [+, -, *, /]");
		char c = in.next().charAt(0);
		
		
		switch(c) {
		
			case '/': {
				try {
					mat.fazerDivisao();
					break;
				} catch(Exception e) {
					System.out.println("Divisao por 0");
					break;
				}
				
			}
			case '*': {	
				mat.fazerMultiplicacao();
				break;
			}
			case '+': {	
				mat.fazerSoma();
				break;
			}
			case '-': {
				mat.fazerSubtracao();
				break;
			}
			default: {
				System.out.println("foi nao ;-;");
			}
		}
	}

}
