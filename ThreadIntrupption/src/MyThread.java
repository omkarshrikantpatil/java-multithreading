public class MyThread extends Thread{

    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Thread is running...");
        }catch(InterruptedException e){
            System.out.println("Intruppted Exception: " + e);
        }
    }
}
