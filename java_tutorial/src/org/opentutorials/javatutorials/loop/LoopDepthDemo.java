package org.opentutorials.javatutorials.loop;

public class LoopDepthDemo { //반복문의 중첩
	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//				System.out.println(i+""+j);
//			} i값이 0일때 j값이 0부터 9까지 1씩 증가되면서 반복되므로 00,01,02,03이런 값이 나올 수 있는것임
//		}
		for(int i=9; i>=0; i--) {
			for(int j=9; j>=0; j--) {
				System.out.println(i+""+j);
			}
		}
	}
}
