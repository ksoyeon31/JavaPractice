package org.opentutorials.javatutorials.method;

public class MethodDemo {
		public static void numbering(){
			int i=0;
			while(i<10){
				System.out.println(i);
				i++;
			}
		}
		
		public static void main(String[] args) {
			numbering();
			numbering();
			numbering();
			
		} 
		//자바에서 method란 다른 언어에서의 함수와 같은것. 
		//main 메소드 안에 있는 코드가 실행되는 것임
		//메소드이름(){}; -> 이건 정의되는 것이고 main 메소드안에 다른 메소드들이 (); 이렇게 호출되는것임.
		//메소드 활용으로 코드량이 줄어들고, 재활용할 수 있고, 유지보수에 유리함(수정할때)
}
