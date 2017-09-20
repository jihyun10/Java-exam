package 반복문;

public class 다중반복문 {

	public static void main(String[] args) 
	{
		for (int i = 2; i < 10; i++)
		{
			for(int j = 1; j < 10; j++)
				System.out.println(i + "X" + j + "=" + i * j);
		}

	}

}
