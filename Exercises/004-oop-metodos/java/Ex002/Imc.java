public class Imc {

	public String statusImc(double peso, double altura) {
		double imc = calcularImc(peso, altura);
		
		if(imc < 16){
			return "Magreza grave";
		}else if(imc < 17) {
			return "Magreza moderada";
		}else if(imc < 18.5) {
			return "Magreza leve";
		}else if(imc < 25) {
			return "Saud�vel";
		}else if(imc < 30) {
			return "Sobrepeso";
		}else if(imc < 35) {
			return "Obesidade Grau |";
		}else if(imc < 40) {
			return "Obesidade Grau || (severa)";
		}else {
			return "Obesidade Grau ||| (m�rbida)";
		}
		
	}
	
	public double calcularImc(double peso, double altura) {
		double imc = peso / (altura*altura);
		return imc;
	}
}
