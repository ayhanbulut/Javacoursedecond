package AdvancedJavaPractice.Thread;

public class MultiThread04
{
    public static void main(String[] args) throws InterruptedException
    {

        Brackets2 brackets2=new Brackets2();

        Long startTime=System.currentTimeMillis();

        Thread thread1=new Thread(new Runnable() {

            public void run() {

                for (int i = 1; i <=7; i++)
                {
                    brackets2.generateBrrackets();

                }

            }
        });

        thread1.start();

        Thread thread2=new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 1; i <=7; i++)
                {
                    brackets2.generateBrrackets();

                }

            }
        });

        thread2.start();
        thread1.join();
        thread2.join();

        long endTime=System.currentTimeMillis();

        System.out.println(endTime-startTime);
    }
}
class Brackets2{
    
    public  void generateBrrackets(){

        synchronized(this)
        {
            for (int i = 1; i <= 10; i++)
            {

                if (i <= 5)
                {

                    System.out.print("[");
                } else
                {

                    System.out.print("]");
                }

           
        }//end of for
        System.out.println("");
        }
        for (int i = 1; i < 5; i++)
        {
            try
            {
                Thread.sleep(50);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
}