package org.opentutorials.javatutorials.inheritance.example1;

class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
		
	}
	
}

class SubstractionableCalculator extends Calculator{
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1{
	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg(); //sum과 avg를 사용할 수 있는 이유는 위에 메소드에서 calculator클래스를 확장하고 있기 때문 = 상속받고 있기 때문
		c1.substract();
	}
}
