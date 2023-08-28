package interfacedemo;

import com.sun.tools.javac.Main;

public interface MainMethodinInterface {


     static void printMe(){
        System.out.println("This is static method in interface");
    }
    public static void main(String[] args) {
        System.out.println("This is main method in interface");

        MainMethodinInterface.printMe();
    }
}
