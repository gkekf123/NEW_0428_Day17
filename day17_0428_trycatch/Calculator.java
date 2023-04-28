package day17_0428_trycatch;

import java.util.Scanner;

public class Calculator {
	
	public int input() throws Exception {
	
		/* 
		 * 1. 스캐너로 정수 2개를 입력받아, 두 수의 합을 반환하는 기능
		 * 2. 입력 된 값이 정수라면 합계를 반환
		 * 3. 예외가 발생하면 직접 예외를 생성하고 예외 메시지를 외부로 전달하면 된다.
		 * 4. scan.close()은 finally에서 처리
		 */
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = x + y;
			return sum;
			
		} catch (Exception e) {
			throw new Exception("문자를 입력하세요");	//예외생성
			
		}finally {
			sc.close();
		}
	}
	
}
