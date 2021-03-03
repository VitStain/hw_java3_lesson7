package lesson7;

public class Main {


    public static void main(String[] args) {
        try {
            ClassTester.start(TestsClass.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
