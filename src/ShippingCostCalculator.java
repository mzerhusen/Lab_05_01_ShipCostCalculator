import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final double SHIPPING_RATE = .02;
        final int FREE_SHIPPING = 0;
        double itemPrice;
        double shippingCost;
        double totalPrice;
        String invalidInput;

        System.out.print("Enter shipping rate, in Dollars: $");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();
            if(itemPrice > 100)
            {
                totalPrice = itemPrice + FREE_SHIPPING;
                System.out.println("The cost of the item is $" + itemPrice + " so you qualify for free shipping! The total cost will be " + totalPrice + ".");
            }
            else
            {
                shippingCost = itemPrice * SHIPPING_RATE;
                totalPrice =  itemPrice + shippingCost;
                System.out.println( "The cost of the item is $" + itemPrice + ", shipping will cost $" + shippingCost + ". Your total price will be $" + totalPrice + ".");
            }
        }
        else
        {
            invalidInput = in.nextLine();
            System.out.println("You have input an invalid price of " + invalidInput + "." + "\nPlease restart the program and put in a valid price.");
        }
    }
}