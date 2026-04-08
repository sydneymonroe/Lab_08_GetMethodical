import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favNum = 0;
        double favDoub = 0;

        favNum = SafeInput.getInt(in, "Enter your favorite number");
        System.out.println("Your favorite number is: " + favNum);

        favDoub = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("Your favorite double is: " + favDoub);
    }
}
