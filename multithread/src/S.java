class R extends Thread 
{
	@Override
	public  void run() 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
	}
}
class S
{
	public static void main(String[] args)
	{
		R  r1 = new R();
		r1.start();
    }
}