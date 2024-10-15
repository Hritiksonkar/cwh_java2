interface simple{
    void met1();
    void met2();

}
interface modifiy{
    void meth3();
    void met4();
    
}
// interface siplemodify extends simple,modifiy
class siplemodify implements simple,modifiy{
  @Override
  public  void met1(){
        System.out.println("mai meth 1 hoon");
    }
  @Override
     public void met2(){
        System.out.println("mai met2 hoon");
     }
  @Override
        public  void meth3 (){
            System.out.println("mai met 3 hoon ");
        }
    
        
  @Override
        public  void met4(){
            System.out.println("mai meth 4 hoon");
        }
    }


public class interface_inheritance {
    public static void main(String[] args) {
        siplemodify se =new siplemodify();
        se.met1();
        se.met2();
        se.meth3();
        se.met4();
    
    }
    }
    
    
    
    

