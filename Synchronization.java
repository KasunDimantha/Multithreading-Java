class MyClass {
    public void printData(String threadName) {

        for(int i=0; i<10; i++){
            System.out.println(threadName + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}

class MyThread1 extends Thread{
    private MyClass myClass;

    MyThread1(MyClass myClass){
        this.myClass = myClass;
    }

    public void run(){
        this.myClass.printData("Thread1");
    }
}

class MyThread2 extends Thread{
    private MyClass myClass;

    MyThread2(MyClass myClass){
        this.myClass = myClass;
    }

    public void run(){
        this.myClass.printData("Thread2");
    }
}


class Synchronization {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        
        MyThread1 t1 = new MyThread1(myClass);
        t1.start();

        MyThread2 t2 = new MyThread2(myClass);
        t2.start();
    }

}
