import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userName = SafeInput.getNonZeroLenString(in, "Enter your username");
        System.out.println("Your username is: " + userName);

        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("Your age is: " + age);

        double salary = SafeInput.getDouble(in, "Enter your salary");
        System.out.println("Your salary is: " + salary);

    }
}
