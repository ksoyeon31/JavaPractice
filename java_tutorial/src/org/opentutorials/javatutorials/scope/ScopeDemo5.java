package org.opentutorials.javatutorials.scope;

class C {
	int v = 10;
	
	void m() {
		int v= 20;
		System.out.println(v); //20
		System.out.println(this.v); //10
		// this는 c1 인스턴스 자체를 의미하고 전역변수를 의미함.
	}
}
public class ScopeDemo5 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}
}
