package study;

public class Class03 {

	public static void main(String[] args) {
		
//		Person kim = new Person("KIM", 23);
//		Person choi = new Person("choi", 12);
//		Person park = new Person("park", 34);
//		
//		kim.speak();
//		kim.run();
//		kim.eat();
//
//		choi.speak();
//		choi.run();
//		choi.eat();
//		
//		park.speak();
//		park.run();
//		park.eat();
		
		
		Musician musNone = new Musician();
		Musician sninee = new Musician("SNINee", 5, "Lucifer");
		Musician ive = new Musician("ive", 6, "afterLike");
		
		sninee.singer();
		sninee.whatSong();
		sninee.member();
		
		ive.singer();
		ive.whatSong();
		ive.member();
		
		
		
	}

}
