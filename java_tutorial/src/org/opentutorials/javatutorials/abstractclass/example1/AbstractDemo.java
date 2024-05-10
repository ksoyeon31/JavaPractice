package org.opentutorials.javatutorials.abstractclass.example1;
//abstract는 상속을 강제하고 있음

abstract class A { //추상클래스
	public abstract int b(); //추상메소드
	//본체{코드}가 있는 메소드는 abstract 키워드를 가질 수 없다.
	//ex) public abstract int c(){System.out.println("Hello");
	//추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재할 수 있다.
	//추상메소드를 사용하기 위해선 오버라이딩을 해서 사용해야함
	public void d() {
		System.out.println("world");
	}
}

class B extends A{
	public int b() { //추상메소드 오버라이딩
		return 1;
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
//		A obj = new A(); 상속받은 것이 아니기 때문에 오류남
		B obj = new B();
		System.out.println(obj.b());
	}
}
