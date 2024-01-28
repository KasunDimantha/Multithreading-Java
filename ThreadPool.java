import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable{
    public void run(){
        System.out.println("Start : " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("End : " + Thread.currentThread().getName());
    }
}


class ThreadPool {
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i=0; i<10; i++) {
            Thread t = new Thread(new MyThread());
            executorService.execute(t);
        }
    }
}
