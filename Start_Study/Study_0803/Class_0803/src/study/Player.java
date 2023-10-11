package study;

public class Player {

	String name;
	int level;
	int experience;
	
	Player(String name) {
		this.name = name;
		this.level = 1;
		this.experience = 0;
	}
	
	Player(String name, int level) {
		this.name = name;
		this.level = level;
		this.experience = 0;
	}
			
	Player(String name, int level, int experience) {
		this.name = name;
		this.level = level;
		this.experience = experience;
	}
	
	void infor() {
		System.out.println("캐릭터명 : " + name + ". level : " + level);
	}
	
	void fight() {
		System.out.println(name + "이(가) 전투를 시작했습니다.");
	}
	
	
	void clear(int exp) {
		System.out.println("전투를 성공적으로 클리어하였습니다.");
		experience +=80;
		if(experience >= 100) {
			
		}
		System.out.println(name + "의 레벨이 상승합니다." );
		System.out.println("현재 " + name + "의 레벨은 " + (++level) + "입니다.");
	}
	
	void getExperience(int experience) {
		
	}
	
	void avoid() {
		System.out.println("전투에서 도망쳤습니다. 나약한 녀석!!!");
	}
	
	
	
}
