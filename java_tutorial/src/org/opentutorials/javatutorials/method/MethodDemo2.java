package org.opentutorials.javatutorials.method;

public class MethodDemo2 {
		public static void numbering(int limit) {
			int i=0;
			while(i<limit) {
				System.out.println(i);
				i++;
			}
		}
		public static void main(String[] args) {
			numbering(5);
			
			//입력받을 값을 수용할 변수 (int limit) 얘를 매개변수라고 함 영어로 parameter
			//입력한 값 (5)를 인자라고함. 영어로는 argument
			//이 둘을 혼용해서 말하기도 함 엄격하게 구분하면 위와 같이 구분되는 것
		}
}
