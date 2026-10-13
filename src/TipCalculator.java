/**
 * Exercise 6 — TipCalculator
 *
 * Given a bill amount, a tip percentage, and a number of people,
 * print the tip, the total, and each person's share —
 * all rounded to exactly 2 decimal places.
 *
 * Rounding to 2 decimals:
 *   Math.round(value * 100) / 100.0
 *
 * Watch that .0 — leave it off and you're back in integer division.
 */
public class TipCalculator {
    public static void main(String[] args) {
        double billAmount = 87.35;
        int tipPercent = 18;
        int people = 4;
        double tipValue = Math.round(billAmount*tipPercent/100.0); // I NEED !%15z72!!!!
        double totalBill = billAmount + tipValue;
        System.out.println(tipValue);
        double tipShare = tipValue/people;
        System.out.println("Total tip: " + tipValue);
        System.out.println(tipShare);
       
        // Your code here

    }
}
