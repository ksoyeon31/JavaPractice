package org.opentutorials.javatutorials.array;

public class GetDemo {
	public static void main(String[] args) {
		String[] classGroup = {"김소연","이지민","강수연","우승희","김은정","양소원"};
//		System.out.println(classGroup[0]);
//		System.out.println(classGroup[1]);
//		System.out.println(classGroup[2]);
//		System.out.println(classGroup[3]);
//		System.out.println(classGroup[4]);
//		System.out.println(classGroup[5]);
		
//		for(int i=0; i<6; i++) {
//			System.out.println(classGroup[i]);
//		}
		for(int i=0; i<6; i++) {
			if(i==3)
				break; //if 다음 구문이 한줄이면 {}생략 가능
			System.out.println(classGroup[i]);
		}
		
		String[] classGroup1 = new String[3];
		classGroup1[0] = "김소연";
		System.out.println(classGroup1.length); //classGroup.length는 classGroup이 수용할 수 있는 원소의 개수를 나타내는것. 들어가있는 원소의 개수가 아님
		classGroup1[1] = "이지민";
		System.out.println(classGroup1.length);
		classGroup1[2] = "강수연";
		System.out.println(classGroup1[0]);
	}
}
