import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SNN = ""; // regex = ^\\d{3}-\\d{2}-\\d{4}$
        String mNum = ""; // regex = ^(M|m)\\d{5}$
        String menuChoice = ""; // ^[OoSsVvQq]$

        SNN = SafeInput.getRegExString(in, "Enter your SNN ", "^\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SNN is " + SNN);
        mNum = SafeInput.getRegExString(in, "Enter your student M number ", "^(M|m)\\d{5}$");
        System.out.println("Your M number is " + mNum);
        menuChoice = SafeInput.getRegExString(in, "Pick an option: O - open\tS - save\tV - view\tQ - quit", "^[OoSsVvQq]$");
        System.out.println("You chose: " + menuChoice.toUpperCase());






    }
}
