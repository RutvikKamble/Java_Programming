/*
4. A customer enters a store with a fixed budget. They pick items one by one in a given order.
The cashier wants to know how many items can be purchased before money becomes insufficient.

Input:
• Budget amount
• Number of items N
• N item prices

Validations:
• Budget ≥ 0
• N ≥ 0
• Each price > 0

Expected Output:
Items Purchased: <count>
Remaining Balance: ₹<amount>

*/

import java.util.*;

class program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Budget = 0;
        int Items = 0;
        int Price[];
        int RemBalance = 0;
        int i = 0;

        System.out.println("Enter the Budget : ");
        Budget = sobj.nextInt();

        System.out.println("Enter the Items");
        Items = sobj.nextInt();

        int []price = new int [Items];

        RemBalance = Budget;

        for(i = 1; i <= Items; i++)
        {
            price[i] = sobj.nextInt();
            RemBalance = RemBalance - (Price[i]);
        }


        System.out.println("Parcel Weight : "+Weight);
        System.out.println("Couries Charge : "+Amount);

        sobj.close();
    }
}
