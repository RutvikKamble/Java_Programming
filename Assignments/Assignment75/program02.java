/*
2. A bank wants to quickly decide whether a customer is eligible for a personal loan.
The system checks the applicant’s details and either approves the loan or rejects with the exact reason.

Eligibility Conditions:
• Age 21 to 60 inclusive
• Monthly income ≥ ₹25,000
• Credit score ≥ 700
• Must NOT have an existing unpaid loan

Input:
• Age
• Monthly income
• Credit score
• Existing unpaid loan (Yes/No)

Validations:
• Age/income/score must be non-negative
• Yes/No must be valid

Expected Output:
Loan Approved
OR
Loan Rejected: <Specific Reason>
*/

import java.util.*;

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0, MonthlyIncome = 0, CreditScore = 0;
        String UnpaidLoan = null;
       

        System.out.println("Enter the Age : ");
        Age = sobj.nextInt();

        System.out.println("Enter Monthly Income : ");
        MonthlyIncome = sobj.nextInt();

        System.out.println("Enter Credit Score : ");
        CreditScore = sobj.nextInt();

        System.out.println("Existing Unpaid Loan (Yes / No)");
        UnpaidLoan = sobj.next();

        if(Age < 0 || MonthlyIncome < 0 || CreditScore < 0 || 
            ((UnpaidLoan.equalsIgnoreCase("Yes") == false) && 
            (UnpaidLoan.equalsIgnoreCase("No") == false))
        )
        {
            System.out.println("Invalid Input");
            return;
        }

        if((Age < 21 || Age > 60) || MonthlyIncome < 25000 || CreditScore < 700 || (UnpaidLoan.equalsIgnoreCase("Yes") == true))
        {
            System.out.println("Loan Rejected : ");

            if(Age < 21 || Age > 60)
            {
                System.out.println("Age is Invalid");
            }
            
            if(MonthlyIncome < 25000)
            {
                System.out.println("Income is Invalid");
            }
            
            if(CreditScore < 700)
            {
                System.out.println("Credit Score is Invalid");
            }
            
            if((UnpaidLoan.equalsIgnoreCase("Yes") == true))
            {
                System.out.println("Existing loan is unpaid");
            }   
        }        
        else
        {
            System.out.println("Loan Approved");
        }

        sobj.close();
    }
}

/*
    Test Cases

    Input               Output

    2                   20
    1                   20
    5                   50
    11                 160

*/