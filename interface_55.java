interface bicycle{
    int a=54;
    void applybreak(int decrement);
    void speedup(int increment);


}
interface motercycle{
    void blowk3g();
    void blowmhn();

}
class AvonCycle implements bicycle,motercycle{
   public  void blowhorn(){
        System.out.println("pee pee pee");
    }
   @Override
   public void applybreak(int decrement)
    {
        System.out.println("apply breck");
    }
   @Override
   public  void speedup(int increment){
        System.out.println("speed up");
    }@Override
    public void blowk3g(){
        System.out.println("kabhi khushi kabhi gam");
    }@Override
    public void blowmhn(){
        System.out.println("mai hu na po po po");
    }
}
public class interface_55 {
    public static void main(String[] args) {
        AvonCycle cycleharry=new AvonCycle();
        cycleharry.applybreak(1);
        //you cannot modifiy the propreties in I trface as thay are final
        //cycleharry.a=54;
        // System.out.println(cycleharry.a);
        cycleharry .blowk3g();
        cycleharry.blowmhn();
    }
    
}
