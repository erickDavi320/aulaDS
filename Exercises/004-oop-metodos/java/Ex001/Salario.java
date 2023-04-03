import java.util.Scanner;

public class Salario {
	
	Scanner in = new Scanner(System.in);
	
	public double retornaSalario() {
		double salarioNovo = 0;
		
		System.out.print("Informe o salário antigo: ");
		double salarioAntigo = in.nextDouble();
		in.close();
		
		if(salarioAntigo < 3000) {
			salarioNovo = salarioAntigo + salarioAntigo*0.1;
			return salarioNovo;
		}else {
			salarioNovo = salarioAntigo + salarioAntigo*0.2;
			return salarioNovo;
		}
	}

}
