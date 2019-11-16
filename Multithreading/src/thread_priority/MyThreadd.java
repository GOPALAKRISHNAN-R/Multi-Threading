package thread_priority;

/**
 * Simple Java program for MultiThreading(priority)
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/


public class MyThreadd extends Thread
{
	MyThreadd()
	{
		super();
	}
	MyThreadd(String n)
	{
		super(n);
	}
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(i);
		}
	}
	
	
	

	public static void main(String[] args) 
	{
		MyThreadd m1=new MyThreadd("Gopalakrishnan");
		MyThreadd m2=new MyThreadd();
		
		m1.start();
		m1.setPriority(10);
		System.out.println("ThreadName:"+m1.getName());
		System.out.println("Priority Thread1:"+m1.getPriority());
		
		m2.start();
		m2.setPriority(5);
		System.out.println("ThreadName:"+m2.getName());
		System.out.println("Priority Thread1"+m2.getPriority());
	

	}

}
