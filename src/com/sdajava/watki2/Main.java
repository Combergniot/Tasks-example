package com.sdajava.watki2;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Thread[] threads = new Thread[50];
        Runnable[] runnables = new Runnable[50];

        for (int i = 0; i<50; i++){
            runnables[i] = new Tasks(i);
        }

        for (int i = 0; i < 50; i++ ){
            threads[i] = new Thread(runnables[i]);
        }

        for (int i = 0; i<50; i++){
            threads[i].start();
        }

    }
}
