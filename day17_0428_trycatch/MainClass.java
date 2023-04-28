package day17_0428_trycatch;

public class MainClass {

	public static void main(String[] args) {

		//객체 생성
		Calculator cal = new Calculator();
		
		try {
			cal.input();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
