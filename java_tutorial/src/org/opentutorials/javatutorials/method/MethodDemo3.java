package org.opentutorials.javatutorials.method;

public class MethodDemo3 {
		public static void numbering(int init, int limit) {
			int i = init;
			while(i<limit) {
				System.out.println(i);
				i++;
			}
		}
		
		public static void main(String[] args) {
			numbering(3,10);
		}
//여러개의 인자값이 들어갈 경우 , 를 사용하여 구분하여 주면 됨
}
