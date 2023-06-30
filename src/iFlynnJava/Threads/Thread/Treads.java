package iFlynnJava.Threads.Thread;

class SomeTreads extends Thread {
    public void run() {     // метод run необходим для объявления кода в потоке
        for (int i = 0; i < 10; i++) {
            System.out.println("Number Thread -->" + " " + i);
        }
    }
}

public class Treads {
    public static void main(String[] args) {
        SomeTreads st = new SomeTreads(); // Объект класса
        st.start(); //  запуск потока

        SomeTreads st1 = new SomeTreads();
        st1.start();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Number Runnable -->" + " " + i);

                }
            }
        });
        t1.start();
    }
}
