package org.opentutorials.javatutorials.packageexample2;
import org.opentutorials.javatutorials.packageexample1.*; //.*은 import한 패키지 안에 있는 모든 클래스들을 가져온다는 것
//A클래스만 지정해서 가져올 수 있음 > import org.opentutorials.javatutorials.packageexample1.A;

public class B {
	public static void main(String[] args) {
	A a = new A();
}
}
