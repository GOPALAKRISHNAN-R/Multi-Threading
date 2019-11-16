package synchronization;

/**
 * Simple Java program for MultiThreading(synchronized method)
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class Table1
{
	synchronized public void disp(int n)
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

class MyThreadd1 extends Thread
{
	Table1 t;
	MyThreadd1(Table1 t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.disp(5);
	}
	
	
	
}
class MyThreadd2 extends Thread
{
	Table1 t;
	MyThreadd2(Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.disp(100);
	}
}



public class SynMethod {

	public static void main(String[] args) {
		Table1 t=new Table1() ;
		MyThreadd1 m1=new MyThreadd1(t);
		MyThreadd2 m2=new MyThreadd2(t);
		m1.start();
		m2.start();
	}

}
