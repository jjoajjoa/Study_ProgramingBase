package Class0731;

public class Class01 {
	public static void main(String[] args) {
		System.out.println(function1());
		function2(2);
		System.out.println(sum(10, 30));
	}
	
	public static int function1() {
		return 1;
	}
	
	public static void function2(int x) {
		System.out.println("---------------" + x + "단------------");
		return;
	}
	
	public static int sum(int x, int y) {
		return x+y;
	}
}

//함수 <- f(x) : 입력값이 있고, 출력값이 있는 것.

//자료형 함수명(매개변수) {
//	코드
//	반환값
//}

//매개변수 -> 자료형 변수명, 여러개가 올 수 있다. -> void 매개변수가 없다.
//반환값 -> 단, 하나다. -> void 반환값이 없다.