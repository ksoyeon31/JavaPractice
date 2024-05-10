package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	static void a() {
		int i = 0; // 여기서 선언된 변수 i는 지역변수로 메소드 안에 선언됐으므로 해당 메소드 안에서만 적용됨.
		//새로운 메소드에서 똑같이 변수 i가 선언되도 같은 i 값으로 적용되지 않음
	}
	
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			a();
			System.out.println(i);
		}
	}
}

