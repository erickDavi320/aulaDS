import java.util.Scanner;

public class Matematica {

	//declarando variaveis
	public int valorUm;
	public int valorDois;
	public int resultado;
	
	//declarando variaveis
	Scanner in = new Scanner(System.in);
	
	public void fazerSoma() {
		System.out.print("Digite o primeiro valor:");
		valorUm = in.nextInt();
		System.out.print("Digite o segundo valor:");
		valorDois = in.nextInt();
		
		resultado = valorUm + valorDois;
		System.out.println(resultado);
	}
	
	public void fazerSubtracao() {
		System.out.print("Digite o primeiro valor:");
		valorUm = in.nextInt();
		System.out.print("Digite o segundo valor:");
		valorDois = in.nextInt();
		
		resultado = valorUm - valorDois;
		System.out.println(resultado);
	}
	
	public void fazerMultiplicacao() {
		System.out.print("Digite o primeiro valor:");
		valorUm = in.nextInt();
		System.out.print("Digite o segundo valor:");
		valorDois = in.nextInt();
		
		resultado = valorUm * valorDois;
		System.out.println(resultado);
	}
	
	public void fazerDivisao() {
		System.out.print("Digite o primeiro valor:");
		valorUm = in.nextInt();
		System.out.print("Digite o segundo valor:");
		valorDois = in.nextInt();
		
		resultado = valorUm / valorDois;
		System.out.println(resultado);
	}
	
}
