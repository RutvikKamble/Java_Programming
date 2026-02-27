/*
2. A bank ATM must follow strict safety rules to avoid fraud and ensure customers maintain a minimum balance.
A customer inserts the card, checks their balance, and requests a withdrawal.
The ATM must either approve the request and update the balance or reject it and show the correct reason.

Rules:
• Withdrawal amount must be a multiple of ₹100
• Maximum withdrawal per transaction is ₹25,000
• After withdrawal, balance must remain at least ₹1,000

Input:
• Line 1: current balance (integer)
• Line 2: requested withdrawal amount (integer)

Validations:
• If balance < 0 or withdrawAmount <= 0 → invalid input

Expected Output:
• If successful:
Transaction Successful.

Remaining Balance: ₹<newBalance>
• If failed:

Transaction
*/

import java.util.*;

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your current balance : ");
        int Current_Balance = sobj.nextInt();

        System.out.println("Please enter your the amount tha you want ot withdraw : ");
        int withdraw_Amount = sobj.nextInt();

        if(Current_Balance < 0 || withdraw_Amount <= 0)
        {
            System.out.println("Inbalid input");
            return;
        }

        if(withdraw_Amount % 100 != 0)
        {
            System.out.println("Transactioin Failed : Withdrawl amount must be a multiple of 100");

        }
        else if(withdraw_Amount > 25000)
        {
            System.out.println("Transactioin Failed : Maximum withdrawl per transaction is 25000");
        }
        else if(Current_Balance - withdraw_Amount < 1000)
        {
            System.out.println("Transactioin Failed : After withdrawl, balance must remain at least 1000");
        }
        else
        {
            System.out.println("Transaction Successfull...");
            System.out.println("Remaining Balance : "+(Current_Balance - withdraw_Amount));
        }

    }
}