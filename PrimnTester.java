public class PrimnTester {

	public void istPrimn(long n) {
		
		String result ;
		int count=0;
		for (int i = 2; i < n; i++) {
			
			if(n%i==0) {
				count++;
				break;
			}
		}
		
		if(count==0 & n>1) {
			System.out.println("JA");
		} else {
			System.out.println("NEIN");
		}
		
		
	}
	
	public static void main(String[] args) {
		int x = 8;
		System.out.print("Ist ");
		System.out.print(x);
		System.out.println(" eine Primn?");
		new PrimnTester().istPrimn(x);
	}

}



 