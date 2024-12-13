public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        //set char at index 0
        sb.setCharAt(1, 'c');
        //add the one string 2 of string
        sb.insert(2,'n');
        System.out.println(sb);
        //delet the char of salected string
        sb.delete(3, 4);
        System.out.println(sb);  

    }
    
}
