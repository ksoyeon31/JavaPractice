package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	static int i;//클래스 메소드 바로 아래에 선언 된 변수 i는 전역변수(global 변수)로 클래스 안에서 다 적용가능함
	
	
	static void a () {
		i = 0; //선언하지 않고 할당만 함 > 전역변수 i를 쓰는거
	}
	
	public static void main(String[] args) {
		for(i=0; i<5; i++) {//여기서도 선언하지 않고 할당만 함
			a();
			System.out.println(i);
		}
	}
}
