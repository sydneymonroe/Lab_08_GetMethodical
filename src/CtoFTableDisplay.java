import javax.swing.*;

public class CtoFTableDisplay {
    public static void main(String[] args) {

        for (int C = -100; C <= 100; C++) {
            double F = CtoF(C);
            System.out.printf("%-15d%-15.2f\n", C, F);
        }

    }

        /**
         * @param Celsius temp
         */
        public static double CtoF(double Celsius) {
            double F = 0;

            F = (Celsius * 9 / 5) + 32;

            return F;

        }
}

