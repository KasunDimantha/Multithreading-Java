class MyThread extends Thread {
    public void run(){
        System.out.println("Start : " + Thread.currentThread().getName());
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("End : " + Thread.currentThread().getName());
    }
}


class ThreadJoin {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        t3.start();
    }
}
