package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {
	
	public static void main(String[] args) {
		String[] members = { "김소연", "이지민", "강수연"};
		for(int i=0; i < members.length; i++) {
//			String member = members[i];
//			System.out.println(member +"이 상담을 받았습니다");
			System.out.println(members[i] + "이 상담을 받았습니다");
		}
	}

}
