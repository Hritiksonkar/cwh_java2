interface Myphone{
    void takesnp();
    void myrecordvideo();
    private void greed(){
        System.out.println("good morning");
    }
    default void record4kvideo(){
        greed();
        System.out.println("Recording in 4k");

        
    }
    

}
interface mywifi{
    String[] getnetwork(String network);
    void connectnetwork(String network);

}
class mycellphone{
   public void callnumbeer(int phonenumber){
        System.out.println("colling"+phonenumber);
    }
   public void pickcall(){
        System.out.println("connecting");

    }

}
class mysmartphone extends mycellphone implements Myphone,mywifi{
   
   public void takesnp(){
        System.out.println("taking snp");

    }
   public void myrecordvideo(){
        System.out.println("taking snp");
    }
   public String[]getnetwork(String network){
        System.out.println("geting list of number");
        String[]networklist={"harry","prashant","anjali5g"};
        return networklist;

    }
    public void connectnetwork(String network){
        System.out.println("connecting"+network);

    }


}
public class defult_interface {
    public static void main(String[] args) {
        mysmartphone ms=new mysmartphone();
        String[]arr =ms.getnetwork("there");
        ms. record4kvideo();
        for (String  item :arr) {
            System.out.println(item);
            
        }
    }
    
}
