package study;
//	String yesterDay	어제 뭐했는지
public class Dog extends MyHome{
	
	
	Dog(String name) {
		super(name);		
	}
	
	
	void intro() {
		super.intro();
	}
	
	void yesterDay(String yesterDay) {
		System.out.println("어제 " + yesterDay + "했어");
	}
	
		
}
