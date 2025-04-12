public class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority() + " Count: " + i);
            try{
                Thread.sleep(100);
            }catch (Exception e){
                throw new RuntimeException();
            }
        }
    }
}
