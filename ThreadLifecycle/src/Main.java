public class Main {
  public static void main(String[] args) throws InterruptedException{
    MyThread myThread = new MyThread();
    System.out.println(myThread.getState());
    myThread.start();
    System.out.println(myThread.getState());
    Thread.sleep(100);
    System.out.println(myThread.getState());
    myThread.join();
    System.out.println(myThread.getState());
  }
}
