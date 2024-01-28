class MyThread1 extends Thread{
    public void run(){

        System.out.println("Extends from Thread");
    }
}

class Car{
    int speed;

    public void park(){
        System.out.println("Car Parking");
    }
}

class MyThread2 extends Car implements Runnable{
    public void run(){
        System.out.println("Implements from Runnable");
    }
}




class Example3 {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new MyThread());
        t1.start();
        
        MyThread1 m1 = new MyThread1();
       m1.start();

       Thread t2 = new Thread(new MyThread2());
       t2.start();

       MyThread2 m2 = new MyThread2();
       //m2.start()

    }
}
