package part13.api;

public class Consumer extends Thread{
    private General general;

    public Consumer(General general) {
        this.general = general;
    }

    @Override
    public void run() {
            while (general.getCount()<9999) {
                synchronized (general) {
                    if (general.getQueue().isEmpty()) {
                        Thread.yield();

                    } else {
                        general.getQueue().poll();
                        general.setCount(general.getCount() + 1);
                        System.out.println(Thread.currentThread().getName() + " забрал циферку, отработано " + general.getCount());

                    }
                }
            }
    }
}
