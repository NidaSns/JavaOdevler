package loopDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü bitti");
		
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++; 
		}
		System.out.println("While Döngüsü bitti");
		
		// Do-while
		int j=2;
		do {
			System.out.println(j);
			j+=2;
		}
		while(j<10);
		System.out.println("Do-While Döngüsü bitti");
	}

}
