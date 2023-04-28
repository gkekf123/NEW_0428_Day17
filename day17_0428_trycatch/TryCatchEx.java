package day17_0428_trycatch;

public class TryCatchEx {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		try {
			System.out.println(i / j);
			
		//catch뒤에는 예외를 처리할 수 있는 예외의 클래스가 선언된다.
		// Exception은 모든 예외를 전부 처리할 수 있다.
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없다");
		}
		
		
		System.out.println("예외처리 완료");
		
	}

}
