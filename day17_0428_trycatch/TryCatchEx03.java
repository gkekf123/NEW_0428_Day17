package day17_0428_trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * //next, nextInt, nextDoublem, nextLine
		 * 
		 * System.out.print("정수>"); 
		 * int num = sc.nextInt(); // 엔터기준 앞까지만 받음
		 * 
		 * sc.nextLine(); // 엔터를 소비해 줘야 된다 -> nextLine()은 엔터를 포함해서 받기 때문에 이전에 nextInt에서
		 * 엔터가 남았으므로
		 * 
		 * System.out.print("문자열>"); 
		 * String info = sc.nextLine(); // 엔터를 포함해서 받음
		 * 
		 * //System.out.println(num); 
		 * System.out.println(info);
		 * 
		 */	
		
		while(true) {
			try {
				System.out.print(">");
				int num = sc.nextInt();	// 문자 엔터값을 정상적으로 처리를 못해서
				
				System.out.println(num);	
			} catch (Exception e) {
				System.out.println("숫자로 입력하실래요?");
				sc.nextLine();	// 뮨자 + 엔터값을 대신 처리
			}
		}
		
	}

}
