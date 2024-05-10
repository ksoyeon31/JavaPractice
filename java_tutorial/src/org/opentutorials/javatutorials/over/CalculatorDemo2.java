package org.opentutorials.javatutorials.over;

public class CalculatorDemo2 {
	int left, right;
	int third = 0;
	
	public void setOprands(int left, int right) {
		System.out.println("setOprands(int left, int right)");
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right, int third) { //이부분이 오버로딩
		System.out.println("setOprands(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
	}
	
	public void sum() {
		System.out.println(this.left + this.right+ this.third);
	}
	
	public void avg() {
		System.out.println((this.left+this.right+this.third)/2);
	}
}

class Calculator{
	public static void main(String[] args) {
		
		CalculatorDemo2 o1 = new CalculatorDemo2();
		o1.setOprands(10,20);
		o1.sum();
		o1.avg();
		o1.setOprands(10, 20, 30);
		o1.sum();
		o1.avg();
	}
}
