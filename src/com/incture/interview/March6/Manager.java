package com.incture.interview.March6;

import java.util.concurrent.Semaphore;
class SharedPrinter {

    private Semaphore semEven = new Semaphore(0);
    private Semaphore semOdd = new Semaphore(1);

    void printEvenNum(int num) {
        try {
            semEven.acquire();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + num);
        semOdd.release();
    }

    void printOddNum(int num) {
        try {
            semOdd.acquire();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + num);
        semEven.release();

    }
}

class Even implements Runnable {
    private SharedPrinter sp;
    private int max;

    public Even(SharedPrinter sp, int i) {
        this.sp=sp;
        this.max=i;

    }

    // standard constructor

    @Override
    public void run() {
        for (int i = 2; i <= max; i = i + 2) {
            sp.printEvenNum(i);
        }
    }
}

class Odd implements Runnable {
    private SharedPrinter sp;
    private int max;

    public Odd(SharedPrinter sp, int i) {
        this.sp=sp;
        this.max=i;
    }

    // standard constructors
    @Override
    public void run() {
        for (int i = 1; i <= max; i = i + 2) {
            sp.printOddNum(i);
        }
    }

}
class Manager {
    public static void main(String[] args) {
        SharedPrinter sp = new SharedPrinter();
        Thread odd = new Thread(new Odd(sp, 10), "Odd");
        Thread even = new Thread(new Even(sp, 10), "Even");
        odd.start();
        even.start();
    }
}