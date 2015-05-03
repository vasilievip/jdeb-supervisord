package org.acme.debian;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting");
        while (true){
            Thread.sleep(2000L);
            System.out.println("still working..");
        }
    }
}
