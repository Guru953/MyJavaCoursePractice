class T 
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println("before calling setName method");
		System.out.println(t1.getName());
		t1.setName("new name of  main method");
		System.out.println("after calling set name method");
		System.out.println(t1.getName());
	}
}
