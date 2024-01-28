class MyThread1 extends Thread{
    public void run(){
        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("My Thread 1");
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("My Thread 2");
        }
    }
}

class MyThread3 extends Thread{
    public void run(){
        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("My Thread 3");
        }
    }
}

class MyThread4 extends Thread{
    public void run(){
        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("My Thread 4");
        }
    }
}

class ThreadPriority {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        MyThread1 t3 = new MyThread1();
        MyThread1 t4 = new MyThread1();

        t1.setPriority(Thread.MIN_PRIORITY); // 1 - 10, Low=1, High = 10 
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(8);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
