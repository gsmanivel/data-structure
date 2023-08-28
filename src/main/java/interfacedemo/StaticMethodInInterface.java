package interfacedemo;

interface Student {

    static String getStream() {
        return "student's stream";
    }

    void getCollege();
}


class ComputerStudent implements Student {

    @Override
    public void getCollege() {
        System.out.println("Computer Science Student");
    }
}


public class StaticMethodInInterface {

    public static void main(String[] args) {
        ComputerStudent student = new ComputerStudent();
        student.getCollege();

        Student.getStream();
    }

}
