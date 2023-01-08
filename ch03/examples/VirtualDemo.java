//package ch03.examples;

public class VirtualDemo {
  public static void main(String args[]) throws Exception {
    Runnable runnable = () -> System.out.println("Hello virtual thread! ID: " + Thread.currentThread().threadId());
    Thread thread = Thread.startVirtualThread(runnable);
    thread.join();
  }
}
