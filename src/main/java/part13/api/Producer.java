package part13.api;

public class Producer extends Thread{
    private General general;

    public Producer(General general) {
        this.general = general;
    }

    @Override
    public void run() {
            while (general.getCount()<9999) {
                synchronized (general) {
                    if (general.getQueue().size() >= 100) {
                        Thread.yield();
                    } else if (general.getQueue().size() <= 80) {
                        general.getQueue().add((int) (Math.random() * 100) + 1);
                        System.out.println(Thread.currentThread().getName() + " положил циферку, отработано " + general.getCount());
                    }
                }

            }

    }
}
