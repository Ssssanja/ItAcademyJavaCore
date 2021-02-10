package part13.api;

public class ThreadForSleep extends Thread{
    private Object obj;
    public ThreadForSleep(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj) {
            System.out.println("I'm thread, my name is " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
