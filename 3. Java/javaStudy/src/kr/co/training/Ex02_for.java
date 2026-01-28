package kr.co.training;

public class Ex02_for {

	public static void main(String[] args) {
		// 1. 짝수를 출력하는 for문
		// - 범위 : 1~20
		// - 해당 범위안에 있는 짝수만 출력
		
		for(int i=1; i<=20; i++) {
			if(i%2 ==0 ) {
				System.out.println(i);
			}
		}
		
		// 2. 3과 5의 공배수를 출력하는 for문
		// - 범위 : 1~100
		
		for(int i=1; i<101; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println(i);
			}
		}
		
		// 3. 10팩토리얼의 값을 출력하는 for문
		// - 10팩토리얼 = 1*2*3*4*5*6*7*8*9*10
		int fe = 1;
		for(int i=1; i<11; i++) {
			fe *= i;
		}
		System.out.println(fe);
		// 4. 아래의 별찍기를 구현하세요.
		// *
		// **
		// ***
		// ****
		// *****
		int height = 5;
		
		for(int i=0; i<height; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2단부터 9단까지 출력하는 구구단 프로그램 만들기
		// - 출력값 : 2*1=2 ~2*9=18
		
		for(int a=2; a<10; a++) {
			for(int b=1; b<10; b++) { 
				System.out.println(a+"*"+b +"="+a*b);
			}
		}
	}

}
