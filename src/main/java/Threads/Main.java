package Threads;

public class Main extends Thread {
    private static int amount;

    /*  this piece of code shares a common static variable which occurs conncurrency problems occurs

            both thread and main() access amount at same time and lost the changes on amount so to avoid this we have to check if thread is running or not

    public static void main(String args[]){
        Main thread = new Main();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    */

    public static void main(String args[]){
        Main thread = new Main();
        thread.start();
        while (thread.isAlive()) System.out.println("Thread is Excuting..");
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}
