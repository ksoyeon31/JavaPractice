package org.opentutorials.javatutorials.polymorphism;

class A{
	public String x() {
		return "A.x";
	}
}
class B extends A{
	public String x() { //오버라이딩
		return "B.x";
	}
	public String y() {
		return "y";
	}
}
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B(); //클래스 B를 인스턴스화 시켜서 obj라는 객체 안에 넣음. 이때 obj는 클래스 A 행세를 함
		//B obj = new B(); 이렇게도 가능함
		
		System.out.println(obj.x()); //obj는 클래스 A 행세를 하지만, B가 클래스 A를 상속하고 메소드 x를 오버라이딩 하였으므로 클래스 B가 재정의한 메소드 x의 기능으로 실행이 됨
//		System.out.println(obj.y()); // 클래스 A에는 메소드 y가 없기 때문에 실행 안 됨
	}
}
