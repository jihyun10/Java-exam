package hello;

public class 비트연산자 {

	public static void main(String[] args) 
	{
		int num1 = 105; //00000000 00000000 00000000 01101001
		int num2 = 22; // 00000000 00000000 00000000 00010110
		
		
		System.out.println(num1 + "&" + num2 + "=" + (num1 & num2));
		System.out.println(num1 + "|" + num2 + "=" + (num1 | num2));
		System.out.println(num1 + "^" + num2 + "=" + (num1 ^ num2));
		System.out.println("~" + num1 + "=" + ~num1);
		
	}

}
