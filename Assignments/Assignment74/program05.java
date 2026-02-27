/*
5. An e-commerce platform wants to compute final payable amount at
checkout.
Discounts are based on purchase amount, and premium members receive an
extra discount after the main discount.

Discount Rules:
• Amount > 5000 → 20% discount
• Amount > 2000 → 10% discount
• Otherwise → no discount
• Premium members → extra 5% discount on the discounted amount

Input:
• Purchase amount (integer)
• Membership type: Premium/Regular

Validations:
• Amount must be > 0
• Membership must be valid

Expected Output:
Original Amount: ₹<amount>
Total Discount: ₹<discount>
Final Payable Amount: ₹<finalAmount>
*/

import java.util.*;

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0;
        float DiscountedAmount = 0.0f;
        float FinalAmount = 0.0f;

        String MembershipType = null;

        System.out.println("Enter purchase Amount : ");
        Amount = sobj.nextInt();

        System.out.println("Enter type of Membership : (Premium / Regular)");
        MembershipType = sobj.next();


        if((Amount < 0) ||
            ((MembershipType.equalsIgnoreCase("Premium") == false) &&
            (MembershipType.equalsIgnoreCase("Regular") == false))
        )
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Amount > 5000)       // 20%
        {
            DiscountedAmount = (float)Amount * 0.2f;
        }
        else if(Amount > 2000)  // 10%
        {
            DiscountedAmount = (float)Amount * 0.1f;
        }
        else                    // 0%
        {
            DiscountedAmount = 0.0f;
        }

        FinalAmount = Amount - DiscountedAmount;

        if(MembershipType.equalsIgnoreCase("Premium"))
        {
            DiscountedAmount = DiscountedAmount + (FinalAmount * 0.05f);
            FinalAmount = Amount - DiscountedAmount;

        }

        System.out.println("Original Amount : "+Amount);
        System.out.println("Total Discount  : "+DiscountedAmount);
        System.out.println("Final Payable Amount : "+FinalAmount);
        

        sobj.close();
    }
}