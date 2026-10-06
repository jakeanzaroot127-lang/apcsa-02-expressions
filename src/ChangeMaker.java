/**
 * Exercise 1 — ChangeMaker
 *
 * Given a total in CENTS, output the fewest coins that make it up.
 *
 * Example: 287 cents
 *   Quarters: 11
 *   Dimes:    1
 *   Nickels:  0
 *   Pennies:  2
 *
 * Use only / and %. No conditionals — you don't have them yet.
 *
 * Strategy for each coin:
 *   count     = remaining / coinValue
 *   remaining = remaining % coinValue
 */
public class ChangeMaker {
    public static void main(String[] args) {
        int totalCents = 287;   // try other values when it works
        System.out.println("You have " + totalCents/25 + " Quarters and " + totalCents%25 + " Pennies");//Quarters
        System.out.println("You have " + totalCents/10 + " Dimes and " + totalCents%10 + " Pennies");//Dimes
        System.out.println("You have " + totalCents/5 + " Nickels and " + totalCents%5 + " Pennies");//Nickels
        System.out.println("You have " + totalCents/1 + " Pennies");//Pennies
        // Your code here

    }
}
