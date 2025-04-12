public class Main {
    public static void main(String[] args) {

        //Using extend thread
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();

        for(int i=0; i<10000; i++){
            System.out.println(Thread.currentThread().getName());
        }

        //Using implement interface
        RunnableInterfaceClass runnableInterfaceClass = new RunnableInterfaceClass();
        Thread t1 = new Thread(runnableInterfaceClass);
        t1.start();

    }
}