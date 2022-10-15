package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseKrediManager[] baseKrediManager = new BaseKrediManager[] 
				{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
		
		for(BaseKrediManager krediManager:baseKrediManager) {
			System.out.println(krediManager.hesapla(1000));
		}
		
	}

}
