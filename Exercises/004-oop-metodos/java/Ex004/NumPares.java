public class NumPares {
	 
	int result;
	
	public void retornaDecres() {
		for(int i=100;i>0;i--) {
			result = i%2; 
			if(result == 0) {
				System.out.print(i);
			}else {
				System.out.print(", ");
			}
		}
		System.out.println("fim");
	}
	public void retornaCres() {
		for(int i=2;i<=100;i++) {
			result = i%2; 
			if(result == 0) {
				System.out.print(i);
			}else {
				System.out.print(", ");
			}
		}
		System.out.println(", fim");
	}

}
