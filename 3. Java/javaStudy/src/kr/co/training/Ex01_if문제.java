package kr.co.training;

import java.util.Scanner;

public class Ex01_if문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		int score= sc.nextInt();
		
		if (score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		System.out.println("Q2. ------------------------------------");
		Scanner sc2 = new Scanner (System.in);
		int num = sc2.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		System.out.println("Q3.-----------------------------------");
		Scanner sc3 = new Scanner (System.in);
		int year = sc3.nextInt();
		
		if(year >= 20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
		
		System.out.println("Q4.------------------------------------");
		Scanner sc4 = new Scanner(System.in);
		String pw = sc4.nextLine();
		
		if(pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		System.out.println("Q7.------------------------------------");
		Scanner sc5 = new Scanner(System.in);
		int year2 = sc5.nextInt();
		
		if(year2 <= 12) {
			System.out.println("12세 이하 : 3,000원");
		}else if(year2 <= 18) {
			System.out.println("18세 이하 : 5,000원");
		}else {
			System.out.println("19세 이상 : 10,000원");
		}
		
		System.out.println("Q8.------------------------------------");
		Scanner sc6 = new Scanner(System.in);
		String id = sc6.nextLine();
		Scanner sc7 = new Scanner(System.in);
		String pw2 = sc7.nextLine();
		
		if (id.equals("admin")  && pw2.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		System.out.println("Q9.------------------------------------");
		Scanner sc8 = new Scanner(System.in);
		int score2 = sc8.nextInt();
		Scanner sc9 = new Scanner(System.in);
		String ch = sc9.nextLine();
		
		if (ch.equals("true") && score2 >= 90) {
			System.out.println("A");
		}else if(ch =="true" || score2 >= 80) {
			System.out.println("B");
		}else if(ch =="true" || score2 >= 70) {
			System.out.println("c");
		}else {
			System.out.println("F");
		}
		
		System.out.println("Q10.------------------------------------");
		Scanner sc10 = new Scanner(System.in);
		int we = sc10.nextInt();
		
		if(we == 3 || we == 4 || we == 5) {
			System.out.println("봄");
		}else if(we == 6 || we == 7 || we == 8) {
			System.out.println("여름");
		}else if(we == 9 || we == 10 || we == 11) {
			System.out.println("가을");
		}else if(we == 12 || we == 1 || we == 2) {
			System.out.println("겨울");
		}else {
			System.out.println("해당하는 계절이 없습니다.");
		}
	}

}
