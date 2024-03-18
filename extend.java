class Even extends Thread
{
    public void run()
    { 
        for(int i=2;i<50;i=i+2)
        {
            System.out.println(i);
        }
    }
}
class Odd extends Thread
{
    public void run()
    { 
        for(int i=1;i<50;i=i+2)
        {
            System.out.println(i);
        }
    }
}
 class EvenOdd
{
    public static void main(String[] args)
    {
        Even e  = new Even();
        Odd o = new Odd();
        Thread t1=new Thread(e);
        Thread t2=new Thread(o);
        t1.start();
        t2.start();
    }
}