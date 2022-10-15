package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=25;
		int remainder = number%2;
		System.out.println(remainder);
		boolean isPrime = true; //asalMý
		
		if(number==1) {
			System.out.println("Sayý asal deðildir");
			return;
		}
		if(number<1)
		{
			System.out.println("Geçersiz sayý");
		}
		for(int i=2;i<number;i++) {
			if(number%i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Sayý asaldýr");
		}else {
			System.out.println("Sayý asal deðildir");
		}
		
	}

}
