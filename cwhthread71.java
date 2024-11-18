class Mythreadrunnable1 implements Runnable {
    @Override
    public void run() {
        while (true) { 
            
        
            System.out.println("i am a Thread");
        }

    }

}

class Mythreadrunnable2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            
            System.out.println("i am not a thread");
        }
    }
}

public class cwhthread71 {
    public static void main(String[] args) {

        Mythreadrunnable1 bullet1 = new Mythreadrunnable1();
        Thread gun1 = new Thread(bullet1);

        Mythreadrunnable2 bullet2 = new Mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);
            gun1.start();
            gun2.start();

    }
}
