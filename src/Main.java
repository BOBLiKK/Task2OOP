public class Main {

    public static void main(String[] args) {

        Task2 test1 = new Task2();

        System.out.println(test1.getTemp1());
        System.out.println(test1.getTemp2());

        Task2 test2 = new Task2(15, 56);

        System.out.println(test2.getTemp1());
        System.out.println(test2.getTemp2());
    }
}