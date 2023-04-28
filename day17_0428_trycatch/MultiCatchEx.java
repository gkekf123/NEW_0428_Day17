package day17_0428_trycatch;

public class MultiCatchEx {

	public static void main(String[] args) {

		
		//참고~
		//메인 메서드도 매개변수를 받을 수 있다.
		// run > run configuration -> argument탭 -> ${string_prompt}
		
		try {
			String a1 = args[0];
			String a2 = args[1];
			
			//정수로 변경
			int num1 = Integer.parseInt(a1);
			int num2 = Integer.parseInt(a2);
			
			System.out.println("두 수의 합 : " + (num1 + num2));
			
			String str = null;
			str.charAt(0);
			
			// catch문에는 에러를 처리할 정확한 에러클래스가 선언된다
			// Exception은 모든 예외클래스 부모클래스ㅜ 이다(모든 예외처리 가능)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어남(매개변수를 2개 입력하세요)");
		} catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		} catch(Exception e) {
			System.out.println("기타 예외 입니다");
		}
	
		
	}

}
