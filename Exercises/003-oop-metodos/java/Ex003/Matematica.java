import java.util.Scanner;

public class Matematica {
	
	Scanner in = new Scanner(System.in);

	//declarando variaveis
	public double valorUm;
	public double valorDois;
	public double resultado;
	
	//declarando metodos
	
	//Metodos sem parametros e sem retorno 
	public void fazerSoma() {
		
		resultado = valorUm + valorDois;
	}
	
	public int fazerSoma(int a, int b) {
		return a + b;
	}
	
	//Metodos sem parametros e com retorno 
	public double fazerSubtracao() {
		
		resultado = valorUm - valorDois;
		
		return resultado;
	}
	
	//Metodos com parametro e sem retorno
	public void fazerMultiplicacao(double valorUm, double valorDois) {
		
		resultado = valorUm * valorDois;
	}
	
	//Metodos com parametros e com retorno
	public double fazerDivisao(double valorUm, double valorDois) {
		
		resultado = valorUm / valorDois;
		
		return resultado;
	}
	
}
