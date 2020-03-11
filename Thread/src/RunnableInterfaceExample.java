public class RunnableInterfaceExample implements Runnable {
    public static void main(String[] args) {
        RunnableInterfaceExample runable = new RunnableInterfaceExample();
        Thread t = new Thread(runable);
        t.start();
        System.out.println("Thread main");
    }

    @Override
    public void run() {
        System.out.println("Thread run1");
    }
}
