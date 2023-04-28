package day17_0428_trycatch;

public class ThrowEx01 {

	public static void main(String[] args) {
		
		//3. 에러 넘어온다
		try {
			int resutl = sum(-10);
			System.out.println(resutl);	
			
			//4. 예외 메세지가 여기까지 넘어 온다
		} catch (Exception e) {
			String msg = e.getMessage();	//예외 메시지를 문자열로 반환 기능
			System.out.println(msg);
		}
		
		
	}

	//메서드
	public static int sum(int n) throws Exception{	//2. 예외 처리
		
		// 예외를 직접 생성해서, 메서드를 종료할 때 사용할 수 있다.
		if(n < 0) {
			throw new Exception("0 이상의 값이어야 한다");	//1. 에러 생성 할때, 예외에서 사용되는 메시지를 전달 할 수 있다.
		}
		
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
}
