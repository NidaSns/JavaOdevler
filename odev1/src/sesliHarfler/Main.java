package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harf = 'A';
		char[] inceHarfli = new char[] {'E','I','D'};
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal?n sesli harf");
			break;
			default:
				System.out.println("?nce sesli harf");
		}
		
	}

}
