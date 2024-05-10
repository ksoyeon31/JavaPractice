package org.opentutorials.javatutorials.polymorphism;
//다형성

class O{
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
}
public class PolymorphismOverloadingDemo {
	public static void main(String[] args) {
		O o = new O();
		o.a(1);
		o.a("hi");
		//매개변수를 어떤 값을 줬냐에 따라 다르게 기능함
		//오버로딩을 통한 메소드에서의 다형성
	}
}
