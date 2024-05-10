package org.opentutorials.javatutorials.io;
import java.util.Scanner;
public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {//while문에서 ()안에가 참이면 반복문이 실행이 되는것인데, 저 조건은 입력값이 int(숫자)면 계속해서 입력값을 받고 중단했다가 또 입력값을 받는 것이고, 숫자가 아닌 문자를 입력하면 거짓으로 판단하여 반복문을 멈추게 됨.
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
	}
}
