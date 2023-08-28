package interfacedemo;

interface Left {

    default void m1() {
        System.out.println("This is m1 method from interface left");
    }
}


interface Right {
    default void m1() {
        System.out.println("This is m1 method from interface right");
     }


}

public class InterfImpl implements Left, Right {



    @Override
    public void m1() {
//        System.out.println("my own m1 impl");

        Left.super.m1();
    }


    public static void main(String[] args) {
        InterfImpl obj = new InterfImpl();
        obj.m1();
    }
}

