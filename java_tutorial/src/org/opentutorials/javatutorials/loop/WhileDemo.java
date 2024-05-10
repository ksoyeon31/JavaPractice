package org.opentutorials.javatutorials.loop;

public class WhileDemo {
	public static void main(String[] args) {
//		while(true) {
//			System.out.println("Coding Everybody");
			//()안에 조건이 참이고, 언제까지 도는지 설정을 안 해둬서 무한반복됨
		
		int i = 11;
		while (i>10 && i<20) {
			System.out.println("Coding Everybody"+i);
			i++;
		}
	}
}
