public class Main {
    public static void main(String[] args) {
        MyThread l = new MyThread("Low Priority");
        MyThread m = new MyThread("Medium Priority");
        MyThread h = new MyThread("High Priority");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}