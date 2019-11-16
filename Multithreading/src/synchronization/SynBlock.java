package synchronization;

/**
 * Simple Java program for MultiThreading(synchronized block)
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class Tabl1
{
	public void disp(int n)
	{
		synchronized(this)
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
}

class MyThred1 extends Thread
{
	Tabl1 t;
	MyThred1(Tabl1 t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.disp(5);
	}
	
	
	
}
class MyThred2 extends Thread
{
	Tabl1 t;
	MyThred2(Tabl1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.disp(100);
	}
}
public class SynBlock 
{

	public static void main(String[] args) 
	{
		Tabl1 t=new Tabl1() ;
		MyThred1 m1=new MyThred1(t);
		MyThred2 m2=new MyThred2(t);
		m1.start();
		m2.start();


	}

}
