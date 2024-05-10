package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //사용자가 입력할 값
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}
}//한번 입력받으면 끝남 다음 파일에선 while 반복문 사용해서 여러번 입력받고 출력하는 코드나옴
