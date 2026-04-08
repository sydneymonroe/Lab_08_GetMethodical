import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMin = 0;
        int daysNum = 0;

        birthYear = SafeInput.getRangedInt(in, "Enter your birth year ", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month ", 1, 12);

        switch(birthMonth) { // 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                daysNum = 30;
                break;

            case 2:
                daysNum = 29;
                break;

                // i jus realized i didnt need to decalre these lol
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysNum = 31;
                break;
        }

        birthDay = SafeInput.getRangedInt(in, "Enter your birth year ", 1, daysNum);
        birthHour = SafeInput.getRangedInt(in, "Enter your hour of birth ", 1, 24);
        birthMin = SafeInput.getRangedInt(in, "Enter the minute you were born ", 1, 59);




        System.out.println("Your birth date and time is: " + birthMonth + "/" + birthDay + "/" + birthYear + " " + birthHour + ":" + birthMin);


    }
}