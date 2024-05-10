package org.opentutorials.javatutorials.array;

public class Foreach {
		public static void main(String[] args) {
			String[] members = {"김소연", "이지민", "강수연"};
			for(String e: members) {
				System.out.println(e + "이 상담을 받았습니다");
			}
		}
}
