package 제어문;

public class 스위치문 {
	
	public static void main(String[] args)
	{
		int month = 2;
		
		switch (month)
		{
		case 1: System.out.println("1월"); break;
		case 2: System.out.println("2월"); break;
		case 3: System.out.println("3월"); break;
		case 4: System.out.println("4월"); break;
		case 5: System.out.println("5월"); break;
		case 6: System.out.println("6월"); break;
		case 7: System.out.println("7월"); break;
		case 8: System.out.println("8월"); break;
		case 9: System.out.println("9월"); break;
		case 10: System.out.println("10월"); break;
		case 11: System.out.println("11월"); break;
		case 12: System.out.println("12월"); break;
		default: System.out.println("해당하는 달이 없습니다"); break;
		
		}
	}

}
