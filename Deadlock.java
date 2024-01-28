class MyClass {
    synchronized public void myMethod1(MyClass myClass) {
        System.out.println("method1 - start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        myClass.myMethod2();
        System.out.println("method1 - end");
    }

    synchronized public void myMethod2() {
        System.out.println("method2 - start");
        System.out.println("method2 - end");
    }
}



public class Deadlock {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();

        Thread t1= new Thread(){
            public void run(){
                myClass1.myMethod1(myClass2);
            }
        };

        Thread t2= new Thread(){
            public void run(){
                myClass2.myMethod1(myClass1);
            }
        };

        t1.start();
        t2.start();

    }
}
