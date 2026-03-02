/*
3. A courier counter calculates delivery charge by weight. Charges increase when parcel is heavier.

Charges:
• Up to 1 kg → ₹50
• 1–5 kg → ₹50 + ₹20/kg above 1 kg
• Above 5 kg → ₹150 + ₹30/kg above 5 kg

Input:
• Parcel weight in kg (integer)

Validations:
• Weight must be > 0

Expected Output:
Parcel Weight: <weight> kg
Courier Charge: ₹<amount>

*/

import java.util.*;

class program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Weight = 0;
        int Amount = 0;

        System.out.println("Enter the Weight : ");
        Weight = sobj.nextInt();

      
        if(Weight < 0 )
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        if(Weight <= 1)
        {
            Amount = 50;
        }
        else if(Weight > 1 && Weight <= 5)
        {
            Amount = 50 + ((Weight - 1) * 20);
        }
        else if(Weight > 5)
        {
            Amount = 150 + (Weight - 5) * 30;
        }

        System.out.println("Parcel Weight : "+Weight);
        System.out.println("Couries Charge : "+Amount);

        sobj.close();
    }
}
