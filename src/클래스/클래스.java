package Ŭ����;

class Vehicle{
	private int speed = 0;// ���� �ӵ��� ��Ÿ���� �ʵ�
	private int maxSpeed = 100;// �ִ� �ӵ��� ��Ÿ���� �ʵ�
	
	public int showSpeed()// ���� �ӵ��� �����ش�
	{
		return speed;
	}
	
	public int showMaxSpeed()// �ִ� �ӵ��� �����ش�
	{
		return maxSpeed;
	}
	
	public void speedUp(int increment)//�ӵ��� ����
	{
		if(speed + increment > maxSpeed){
			System.out.println("�ִ� �ӵ�" + maxSpeed + "km/h�� �Ѿ �� �����ϴ�");
	
		}
		else
		{
			speed += increment;
		}
	}
	
	public void speedDown(int decrement)// �ӵ��� ���δ�
	{
		if(speed-decrement < 0)
		{
			System.out.println("�ӵ��� 0 �Ʒ��� ������ �� �����ϴ�");
		}
		else
		{
			speed -= decrement;
		}
	}
}

class VehicleMain{
	public static void main(String[] args)
	{
		Vehicle bike = new Vehicle();
		
		bike.speedUp(10);
		System.out.println("���� ��������� �ӵ�" + bike.showSpeed() + "km/h");
		bike.speedUp(50);
		System.out.println("���� ��������� �ӵ�" + bike.showSpeed() + "km/h");
		bike.speedUp(60);
		System.out.println("���� ��������� �ӵ�" + bike.showSpeed() + "km/h");
		bike.speedDown(40);
		System.out.println("���� ��������� �ӵ�" + bike.showSpeed() + "km/h");
	}
}