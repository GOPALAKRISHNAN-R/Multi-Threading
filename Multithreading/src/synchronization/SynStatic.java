package synchronization;

/**
 * Simple Java program for MultiThreading(synchronized static method)
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/


class Tab
{
	synchronized static public void disp(int n)
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i*n);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class MyThrd1 extends Thread
{
	
	
	public void run()
	{
		Tab.disp(5);
	}
	
	
	
}
class MyThrd2 extends Thread
{
	
	public void run()
	{
		Tab.disp(100);
	}
}




public class SynStatic 
{
	public static void main(String[] args) 
	{
		
		MyThrd1 m1=new MyThrd1();
		MyThrd2 m2=new MyThrd2();
		m1.start();
		m2.start();


	}

}
