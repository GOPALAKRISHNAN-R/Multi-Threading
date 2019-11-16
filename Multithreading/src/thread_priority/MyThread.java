package thread_priority;

/**
 * Simple Java program for MultiThreading(priority)
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/


class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=6;i<10;i++)
		{	
				System.out.println(i);
		}
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
		}
		
	}	
}

public class MyThread 
{
	public static void main(String[] args) 
	{
		MyThread1 m1=new MyThread1();
		MyThread2 m2=new MyThread2();
		m1.start();
		m1.setPriority(10);//Higher priority Thread
		m2.start();
		m2.setPriority(1);//Lower priority Thread
	}

}
