abstract class Parent2{
    public Parent2(){
System.out.println("mai ek constructor hoon");

    }
public void sayhello()
{
    System.out.println("hello");

}   
 abstract public void greed();
 abstract public void greed2();

}
class Child extends Parent2{
    @Override
    public void greed(){

        System.out.println("god afternoon");
    }


    @Override
    public void greed2(){
  
        System.out.println("good afternoon");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("i am good");


    } 
    @Override
    public void greed(){

        System.out.println("god aftenoon");
    }
    
}
public class abstract_53
{
public static void main(String[] args) {
    // Parent2 P=new Parent2(); error
    Child c =new Child();
    c.greed();

    
}
    
}

 

