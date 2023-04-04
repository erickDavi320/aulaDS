
public class Matematica {

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
	public double fazerDivisao(Double valorUm, Double valorDois) {
		
		if (valorDois == null || valorDois == 0) { // Verificação se o valorDois é nulo ou zero
			throw new IllegalArgumentException("Não é possível dividir por zero ou por valor nulo."); // Exceção lançada caso o valorDois seja nulo ou zero
		}

		resultado = valorUm / valorDois;
		
		return resultado;
	}
	
}
