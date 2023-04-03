public class Tabuada {
	
	public int result[] = new int[11];	
	
	
	public int[] calcular(int num) {
		
		for(int i=0;i<11;i++) {
			result[i] = num * i;
		}
		
		return result;
	}

}
