package java8features.lambda.multithreading;

//class MyRunnable implements Runnable {
//
//    @Override
//    public void run() {
//        for(int i=0; i<100; i++) {
//            System.out.println("Child Thread");
//        }
//    }
//}
public class Main {
    public static void main(String[] args) {
//        MyRunnable r = new MyRunnable();
//        Thread t = new Thread(r);
//        t.start();
//        for(int i=0; i<100; i++) {
//            System.out.println("Main Thread");
//        }
        Runnable r = ()->{
            for(int i=0; i<1000; i++) {
                System.out.println("Child Thread -1");
            }
        };

        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<1000; i++) {
            System.out.println("Main Thread -2");
        }
    }
}
