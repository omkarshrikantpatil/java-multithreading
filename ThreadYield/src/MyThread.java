public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }
}
