import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Tabuada tab = new Tabuada();
		
		System.out.println("Digite o n�mero");
		int num = in.nextInt();
		in.close();
		
		int a[] = tab.calcular(num);
		
		for(int i=0;i<11;i++) {
			System.out.println(num+" x "+i+" = "+ a[i]);
		}
	}
}
