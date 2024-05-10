package org.opentutorials.javatutorials.method;

public class ReturnDemo {
	public static String numbering(int init, int limit) {//numbering이라는 메소드는 반드시 문자열을 반환한다는 의미
		int i = init;
		String output = "";
		while(i<limit) {
			output += i; //output = output + i 와 같은 의미
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		//void가 있으면 return을 사용할 수 없음
		
		String result = numbering(1,10); //numbering이 리턴한 값이 변수 result에 담긴다
		System.out.println(result);
	}
}
