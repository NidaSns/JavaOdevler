package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6;
		int total=0;
		for(int i=1;i<number;i++) {
			if(number%i == 0) {
				total+=i;
			}
			
		}
		if(number==total) {
			System.out.println(number+" mükemmel bir sayýdýr.");
		}
		else {
			System.out.println(number+" mükemmel bir sayý deðildir.");
		}
	}

}
