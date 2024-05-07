package mkt;



class Filpkart{
	private int em=2345;

	public int getEm() {
		return em;
	}

	public void setEm(int em) {
		this.em = em;
	}
}

public class Encapsulation_ex {
public static void main(String[] args) {
	Filpkart f=new Filpkart();
	f.setEm(8918);
	System.out.println(f.getEm());
}
}
