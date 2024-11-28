

class mythread extends Thread{
    public  mythread(String name ){
        super(name);
    }
    @Override
    public void run(){
        int i=34;
        System.out.println("thankyou");
        // while (true) 
            
        
        // System.out.println("i am a Thread");
    }
}

public class Threadid {
    public static void main(String[] args) {
        mythread t =new mythread("hritik");
        t.start();
        System.out.println("i am a thread"+t.getName());    
    
}
}