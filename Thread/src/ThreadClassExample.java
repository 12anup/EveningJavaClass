import static java.lang.Thread.sleep;

public class ThreadClassExample extends Thread {
    @Override
    public void run() {
        try {
            sleep(5000);
            System.out.println("Thread run");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ThreadClassExample t = new ThreadClassExample();
        t.setName("ThreadClass");
        t.start();
//        t.stop();
        System.out.println("Thread main" + t.getName());
    }
}
