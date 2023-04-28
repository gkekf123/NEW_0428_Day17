package day17_0428_trycatch;

public class TryCatchex02 {
	
	public static void main(String[] args) {
		
		//반복문에서의 예외처리
		
		String[] arr = {"홍길동", "이순신", "홍길자"};
		
		int i = 0;
		while(i < 4) {
			
			try {
				System.out.println(arr[i]);	
			} catch (Exception e) {
				System.out.println("배열의 범위를 벗어남");
			} finally {
				System.out.println("이 문장은 무조건 실행된다");
			}
			i++;
		}
		System.out.println("예외처리 완료");
		
		
	}

}
