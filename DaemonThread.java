class MyThread extends Thread{
    public void run(){
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread");
        } else {
            System.out.println("User Thread");
        }
    }
}

class DaemonThread {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        MyThread t2 = new MyThread();

        t1.setDaemon(true);

        t1.start();
        t2.start();

    }  
}
