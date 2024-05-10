package org.opentutorials.javatutorials.loop;

public class ForDemo {
	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			System.out.println("Coding Everybody" + i);
//		}
//		for(int i=5; i<20; i=i+2) {
//			System.out.println("Coding Everybody" + i);
//		}
		for(int i=10; i>=0; i--) {
			System.out.println("Coding Everybody" + i);
			//for문은 while문보다 간결하게 쓸 수 있음
			//for(초기화; 종료조건; 반복실행){반복적으로 실행될 구문} 이 구조임
		}
	}
}
