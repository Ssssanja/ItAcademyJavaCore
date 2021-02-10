package part13;

public class Task56 {
    public static void main(String[] args) {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        ThreadDemo3 T3 = new ThreadDemo3();
        T1.start();
        T2.start();
        T3.start();
    }

    private static class ThreadDemo1 extends Thread {
        public void run() {
            synchronized (String.class) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Acquired lock on String.class object");
                synchronized (Integer.class) {
                    System.out.println("Acquired lock on Integer.class object");
                    synchronized (Boolean.class){
                        System.out.println("Acquired lock on Boolean.class object");

                    }
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        public void run() {
            synchronized (Integer.class) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Acquired lock on Integer.class object");
                synchronized (String.class) {
                    System.out.println("Acquired lock on String.class object");
                    synchronized (Boolean.class){
                        System.out.println("Acquired lock on Boolean.class object");
                    }
                }
            }
        }
    }

    private static class ThreadDemo3 extends Thread {
        public void run() {
            synchronized (Boolean.class) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Acquired lock on Boolean.class object");
                synchronized (Integer.class) {
                    System.out.println("Acquired lock on Integer.class object");
                    synchronized (String.class){
                        System.out.println("Acquired lock on String.class object");
                    }
                }
            }
        }
    }


}
