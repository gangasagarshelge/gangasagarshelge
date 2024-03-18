class Even implements Runnable
{
        public void run()
        {
                for(int i=1;i<=50;i++)
                {
                    if(i%2==0)
                    {
                        System.out.println(i);
                    }

                }
        }
}

class Odd implements Runnable
{
    public void run()
    {
        for(int i=1;i<=50;i++)
                {
                    if(i%2!=0)
                    {
                        System.out.println(i);
                    }
                    
                }
    }
    
}


class EvenOdd
{
    
    public static void main(String[] args) 
    {
        Even e  = new Even();
        Odd o = new Odd();
        Thread t1 = new Thread(e);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();
    }
}

