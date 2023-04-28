package day17_0428_trycatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {

	public static void main(String[] args) {

		/* 
		 * 메서드나 생성자에서 발생되는 예외를 호풀문장으로 넘기는 키워두 throws이다
		 * throws구문이 붙어있는 생성자 or ㅁ서드는 예외처리를 대신 진행해야 한다
		 * 즉, 예와초라룰 강요할 때 사용된다
		 */
		
		try {
			greeting(10);
		} catch (Exception e) {	
			System.out.println("배열의 범위를 벗어나 에러가 났다");
			e.printStackTrace();	// 에러가 발생했을 때 에러로그를 확인하기 위해서 사용
		}
		
		// throws의 예시
		try {
			Class.forName("asdas");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// throws의 생성자 예시
		try {
			new FileInputStream("asdasd");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상종료");
		
	}
	// 배열을 맴버변수로
	private static String[] arr = {"hello", "bye", "say good bye"};
	
	public static void greeting(int index) throws Exception{
		System.out.println(arr[index]);
	}

}
