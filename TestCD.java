package bai10;

public class TestCD {
	
	static void nhapCung(ListCD ls) throws Exception {
		CD cd1 = new CD("123", "Dak Lak", "Cong Binh", 2, 30000);
		CD cd2 = new CD("456", "HCM", "Den Vau", 5, 4000000);
	}
	
	
	public static void main(String[] args)  throws Exception{
		CD cd1 = new CD(null, null, null, 0, 0);
		cd1.setMaCD("123456");
		cd1.setTuaCD("Mua xuan");
		cd1.setSoBH(7);
		cd1.setGiaThanh(50000);
		cd1.setCaSy("Cong Binh");
		System.out.println(cd1);
	}
}
