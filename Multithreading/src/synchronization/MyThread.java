package synchronization;

/**
 * Simple Java program for MultiThreading
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class Table
{
	public void disp(int n)
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

class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.disp(5);
	}
	
	
	
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.disp(100);
	}
}

public class MyThread 
{
	public static void main(String[] args) 
	{	
		Table t=new Table() ;
		MyThread1 m1=new MyThread1(t);
		MyThread2 m2=new MyThread2(t);
		m1.start();
		m2.start();
	}

}
