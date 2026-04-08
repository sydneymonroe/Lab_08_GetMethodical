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

        int favNum = SafeInput.getRangedInt(in, "What is your favorite number? ",1,10);
        System.out.println("Your favorite number is: " + favNum);

        double rate = SafeInput.getRangedDouble(in, "Rate your experience so far! ",1, 10);
        System.out.println("You rated your experience: " + rate);

        boolean YN = SafeInput.getYNConfirm(in, "Would you like to continue?");
        if(YN == true) {
            System.out.println("Ok.. continuing.");
        }
        else {
            System.out.println("Too bad, continuing anyway.");
        }

        String SNN = SafeInput.getRegExString(in, "Enter your SNN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SNN is " + SNN + " ... why would you tell me lol.");
    }
}
