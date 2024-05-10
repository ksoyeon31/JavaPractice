package org.opentutorials.javatutorials.scope;
//유효범위 = scope
public class ScopeDemo3 {
	static int i=5;
	
	static void a() {
		int i = 10;
		b();
	}
	
	static void b() {
//		int i = 30;
		System.out.println(i); // 결론적으로 메소드 b에서 출력되는 i는 메소드 b가 가진 유효범위의 변수 i를 출력하고 있는것임
		//메소드 b에서 선언한 변수 i가 없기 때문에 전역변수 i = 5를 출력하고 있는 것
		// >> 정적인 유효범위 라고 함 만약 메소드 a 가 선언한 i=10을 출력한다면 동적인 유효범위가 되는 것
		
	}
	
	public static void main(String[] args) {
		a();
	}
}
