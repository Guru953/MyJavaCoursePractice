class Q 
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
	}
}


//daemon threads is a thread which is defending on the parent thread
//when the parent threadis leaving formthe excution then demoan thread also leaving
//even though daemon threadlevinghaving some excution
//theoffosite ofthedemoan thread is user thread
//by defualt in java we get the user threads
//any thread canbe converded to daemoan thread before calling the start method
//main thread isnot daemon thread  
//it is alredy call it by jvm we cannotmake it has a main thread to daemon
// min =  1 normal = 5 maximum = 10