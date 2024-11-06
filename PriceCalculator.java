package Assignment1;

import java.util.Scanner;
/**
 * Assignment 01 Task 02 Price Calculator
 *
 * @author Astghik Minasyan
 */
public class PriceCalculator {
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);
        System.out.print("Please enter the item price: ");
        double item = price.nextDouble();
        System.out.print("Please enter the discount ratio (5 for 5%): ");
        double discount = price.nextDouble();

        System.out.printf("\n%-17s: %.2f", "Original Price", item);
        System.out.printf("\n%-17s: %.2f%%", "Discount Ratio", discount);

        double itemDisc = item - (item * discount / 100);
        System.out.printf("\n%-17s: %.2f", "Price before tax", itemDisc);
        System.out.println("\n-------------------------------");

        double taxFed = itemDisc * 0.05;
        double taxProv = itemDisc * 0.09975;
        double priceFin = itemDisc + taxFed + taxProv;
        System.out.printf("\n%-17s: %.2f", "Federal Tax", taxFed);
        System.out.printf("\n%-17s: %.2f", "Provincial Tax", taxProv);
        System.out.printf("\n%-17s: %.2f", "Final Price", priceFin);
    }
}
