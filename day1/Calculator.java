package week3.day1;


public class Calculator {
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
		}
	public void add(int num1,double num2,double num3) {
	    System.out.println(num1+num2+num3);
		
		}
		public void sub(int num1,int num2) {
			System.out.println(num1-num2);
		}
		public void sub(double num1,double num2) {
			 System.out.println(num1-num2);
		}
		public void mul(double num1,double num2) {
			System.out.println(num1*num2);
		}
		public void mul(int num1,int num2) {
			System.out.println(num1*num2);
		}
		public void div(int num1,int num2) {
			System.out.println(num1/num2);
		}
		public void div(double num1,int num2) {
			System.out.println(num1/num2);
		}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(3,9);
		cal.add(2,12,13);
		cal.sub(9,5);
		cal.sub(20,10);
		cal.mul(10,20);
		cal.mul(2,3);
		cal.div(4,2);
		cal.div(50,10);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
