import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		NumPares par = new NumPares();
		
		
		System.out.println("Você gostaria de rodar o programa em ordem crescente ou decrescente? (C / D)");
		char o = in.next().toCharArray()[0];
		in.close();
		
		if(o == 'C' || o == 'c') {
			par.retornaCres();
		}else if(o == 'D' || o == 'd') {
			par.retornaDecres();
		}else {
			System.out.println("O programa não pode resolver esse pedido");
		}
		
	}
	
}
