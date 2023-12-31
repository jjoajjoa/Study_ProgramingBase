package restaurant;

public class F_Korean extends Food{
	
//	String nation; <- 이건 Restaurant 클래스에 있음
//	String name;   <- 이건 Food 클래스에 있음
	String[] menuK;
	int[] priceK;
	
	F_Korean() {
		setting();
	}
	
	
	
	F_Korean(String nation, String name, int point) {
		super(nation, name, point);		
		this.setting();
	}
	
	F_Korean(String nation, String name, int point, String menu, int price) {
		super(nation, name, point);
		setting();
		this.menuK[0] = menu;
		this.priceK[0] = price;
	}
	
	F_Korean(String nation, String name, int point, String[] menu, int[] price) {
		super(nation, name, point);
		this.menuK = menu;
		this.priceK = price;
	}
	
	void printKorean() {
		System.out.println("국가 : " + nation + ", 이름 : " + name + ", 평점 : 0"); //국가 : 456, 이름 : 789
	}
	
	void printKoMePr() {
		super.printStar();
		for(int i=0; i<menuK.length; i++) {
			System.out.println("메뉴 : " + menuK[i] + ", 가격 : " + priceK[i]);
		}
	}
	
	void setting() {
		menuK = new String[3];
		priceK = new int[3];
		
		for(int i=0; i < menuK.length; i++) {
			menuK[i] = "SOLD OUT";
			priceK[i] = 0;
		}
	}
	
//	void printRes() {
//		super.printRes();
//		for(int i=0; i<menuK.length; i++) {
//			System.out.println("메뉴 : " + menuK[i] + ", 가격 : " + priceK[i]);
//		}
//	}

}
