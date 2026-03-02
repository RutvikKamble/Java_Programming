/*
3. A warehouse has a product in stock. Every time a customer places an order, the system must check if enough
stock exists.
If possible, fulfill it and update remaining stock. If stock becomes very low, show alert.

Rules:
• If requested quantity > available stock → order fails
• Else deduct quantity
• If remaining stock < 5 → print low stock alert

Input:
• Current stock (integer)
• Requested quantity (integer)

Validations:
• Stock cannot be negative
• Requested quantity must be > 0

Expected Output:
If successful:
Order Processed Successfully.
Remaining Stock: <value>
If remaining < 5 also print: Low Stock Alert!
If failed: Order Failed: Insufficient Stock.
*/

import java.util.*;

class program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int CurrentStock = 0;
        int RequestedQuantity = 0;
       

        System.out.println("Enter the Current Stock : ");
        CurrentStock = sobj.nextInt();

        System.out.println("Enter the Requested quantity : ");
        RequestedQuantity = sobj.nextInt();

        
        if(CurrentStock < 0 || RequestedQuantity <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(RequestedQuantity > CurrentStock)
        {
            System.out.println("Order Failed : Insufficient Stock");
            return;
        }
        else
        {
            System.out.println("Order Processed Successfully");
            System.out.println("Remaining Stock : "+(CurrentStock - RequestedQuantity));

            if((CurrentStock - RequestedQuantity) < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }

        sobj.close();
    }
}

/*
    Test Cases : 1

    Input :         
    Enter the Current Stock : 10
    Enter the Requested quantity : 7

    Output :
    Order Processed Successfully
    Remaining Stock : 3
    Low Stock Alert!


    Test Cases : 2

    Input : 
    Enter the Current Stock : 13
    Enter the Requested quantity : 5

    Output :
    Order Processed Successfully
    Remaining Stock : 8


    Test Cases : 3

    Enter the Current Stock : 3
    Enter the Requested quantity : 4

    Output : 
    Order Failed : Insufficient Stock

*/