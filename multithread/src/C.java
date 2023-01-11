class  C extands Thread
{
	@override
	public void run()
	{
		for (int i = 1; i <= 100 ;i++)
		{
			System.out.println("first thread: " + i);
		}
	}
}
class  D extands Thread
{
	@override
	public void run()
	{
		for (int i = 101; i <= 200 ;i++)
			{
			System.out.println("second thread: " + i);
		}
	}
}

class E
{
	public static void main(String[] args)
	{
		 C c1 = new C();
		System.out.println("hello world");
	}
}
	