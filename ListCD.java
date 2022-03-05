package bai10;

public class ListCD {
	public CD[] ls;
	private int count;
	
	public ListCD(int n) {
		ls = new CD[n];
		count = 0;
	}
	public void tangKichThuocMang() {
		CD tempCD[] = new CD[ls.length * 2];
		for (int i = 0; i < ls.length; i++) {
			tempCD[i] = ls[i];
		}
		ls = tempCD;
	}
	public void themCD(CD cdThem) throws Exception{
		if (timKiem(cdThem) == -1)
		{
			if (count == ls.length)
				tangKichThuocMang();
			ls[count] = cdThem;
			count++;
		}
		else 
			throw new Exception("Trung ma");
	}
	
	public int timKiem(CD cd) {
		for (int i = 0; i < count; i++) {
			if (cd.getMaCD() == ls[i].getMaCD())
				return i;
		}
		return -1;
	}
	
	public CD[] getListCD() {
		return ls;
	}
	
}
