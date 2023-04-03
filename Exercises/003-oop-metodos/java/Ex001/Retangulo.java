import java.util.Scanner;

public class Retangulo {

		//declarando variáveis
		public int base;
		public int altura;
		public int area;
		public int perimetro;
		
			//declarando métodos

		public void inserirValores() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Informe a base do retangulo: ");
			base = in.nextInt();
			System.out.print("Informe a altura do retangulo: ");
			altura = in.nextInt();
			in.close();
		}
		
		public void calcArea() {
			area = altura * base;
			System.out.println("Essa eh a area do retangulo: "+area);
		}
		
		public void calcPerimetro() {
			perimetro = (altura*2) + (base*2);
			System.out.println("Esse eh o perimetro do retangulo: "+perimetro);
		}

}
