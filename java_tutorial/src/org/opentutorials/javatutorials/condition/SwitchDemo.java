package org.opentutorials.javatutorials.condition;

public class SwitchDemo {
	public static void main(String[] args) {
		System.out.println("switch(1)");
		switch(1) {
		case 1 : 
			System.out.println("one");
			break;
		case 2 : 
			System.out.println("two");
			break;
		case 3 :
			System.out.println("three");
			break;
		}
		int val = 4;
		if(val == 1) {
			System.out.println("one");
		}else if (val == 2) {
			System.out.println("two");
		}else{
			System.out.println("three");
		}
	}
}
	
