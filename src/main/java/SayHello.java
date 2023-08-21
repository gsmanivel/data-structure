public class SayHello {
    public String sayHello(){
        return "hello";
    }

    public static void main(String[] args) {
        SayHello test = new SayHello();
        System.out.println(test.sayHello());
    }
}
