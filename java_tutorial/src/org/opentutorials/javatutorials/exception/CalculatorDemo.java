package org.opentutorials.javatutorials.exception;
class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		try {
			System.out.println("계산결과는");
			System.out.println(this.left/this.right);
			System.out.println("입니다");
		}catch(Exception e) {
			System.out.println("오류가 발생했습니다 : " + e.getMessage()); //오류메세지 출력
//			System.out.println("\n\ne.getMessage()\n" + e.getMessage()); //정리
//			System.out.println("\n\ne.toString()\n" + e.toString());//위에보다 더 자세한 오류 설명
//			System.out.println("\n\ne.printStackTrace()");//위에 보다 더 자세한 오류 설명
//			e.printStackTrace();
		
		}
	}
}
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOprands(10,0);
		c.divide();
	}
}