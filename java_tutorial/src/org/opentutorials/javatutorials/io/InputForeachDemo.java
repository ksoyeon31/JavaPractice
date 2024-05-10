package org.opentutorials.javatutorials.io;

public class InputForeachDemo {
	public static void main(String[] args) {
	     for(String e: args) { //args 값이 e라는 변수에 하나씩 전달됨 > 이게 foreach문
	    	 System.out.println(e);
	     }
	}
}
