package org.opentutorials.javatutorials.interfaces;

public interface I {
	public void z();
}

class A implements I { //클래스 A는 인터페이스 I를 구현함
	//이때 인터페이스 I에서 정의한 메소드를 클래스 A가 I를 사용하려면 메소드 z를 똑같이 구현해야함
	public void z() {}; // 이 코드가 없으면 에러남
}
