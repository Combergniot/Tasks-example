package com.sdajava.watki2;

/**
 * Created by RENT on 2017-02-28.
 */
public class Tasks implements Runnable {

    public  int id;

    public Tasks(int id){
        this.id = id;
    }

    @Override
    public void run (){
        while (true){   // W ten sposób będzie działać w nieskończoność

            System.out.println("Identyfikator: " + id);
            try {
                Thread.sleep(1000);  // usypiamy program na 1 sekundę,
            }catch (InterruptedException e){}

        }
    }
}
