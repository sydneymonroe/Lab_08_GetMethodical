import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0;
        double totalCost = 0;
        boolean YN = false;

        do {
            price = SafeInput.getRangedDouble(in, "Enter the price of your item ", 0.50, 10.00);
            System.out.println("the price of this item is $" + price);

            totalCost += price;

            YN = SafeInput.getYNConfirm(in, "Continue? ");

        } while (YN);

        // true = yes, false = no

        System.out.printf("The total cost is: $%.2f\n", totalCost);



    }
}
