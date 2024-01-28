class MyThread extends Thread{

    public void run(){
        for(int i=0; i<10; i++) {

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }

            System.out.println("i : " + i);
        }
    }
}


class Example {
    public static void main(String[] args) {

        System.out.println("Start main");
        Thread t1 = new Thread(new MyThread());
        t1.start();
        System.out.println("End main");

    }
}