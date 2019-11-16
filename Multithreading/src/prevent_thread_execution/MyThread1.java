package prevent_thread_execution;

/**
 * Simple Java program for MultiThreading (yield to prevent)
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class MyThread1 extends Thread
{
		public void startThread()
		{
			start();
			
		}
		public void run()
		{
			try
			{
				for(int i=16;i<=20;i++)
				{

					System.out.println("Child Thread:"+i);
					Thread.yield(); //yield to prevent					
					
				}
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
	
	

	public static void main(String[] args) 
	{
		MyThread1 obj=new MyThread1();
		obj.startThread();
		try
		{
			for(int i=10;i<=15;i++)
			{
				System.out.println("Main Thread:"+i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Main & Child Thread Ends.....");
		}


	}

}
