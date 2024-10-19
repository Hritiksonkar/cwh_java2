class A1 {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    void meth() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}

// class c2 extends A1 {
// public c2{
//     System.out.println();
// }
// }

public class access {
    public static void main(String[] args) {
        A1 O = new A1();
        O.meth();
        System.out.println(O.a);
        // System.out.println(O.b); privet is not use
        System.out.println(O.c);
        System.out.println(O.d);
        }

    }

