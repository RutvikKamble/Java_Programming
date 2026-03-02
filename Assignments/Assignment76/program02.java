/*
2. A scholarship committee uses a strict checklist. Only students who meet all academic and financial conditions
qualify.

Conditions:
• Marks ≥ 80%
• Attendance ≥ 75%
• Family income ≤ ₹3,00,000

Input:
• Marks percent (integer)
• Attendance percent (integer)
• Family income (integer)

Validations:
• Marks and attendance must be 0–100
• Income cannot be negative

Expected Output:
Scholarship Approved
OR
Scholarship Rejected: <Reason>

*/

import java.util.*;

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int Attendence = 0;
        int FamilyIncome = 0;
    

        System.out.println("Enter the Marks : ");
        Marks = sobj.nextInt();

        System.out.println("Enter the Attendence : ");
        Attendence = sobj.nextInt();

        System.out.println("Enter the Family Income : ");
        FamilyIncome = sobj.nextInt();


      
        if((Marks < 0 && Marks > 100) || (Attendence < 0 && Attendence > 100) || FamilyIncome < 0)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        if(Marks >= 80 && Attendence >= 75 && FamilyIncome <= 300000)
        {
            System.out.println("Scholarship Approved");
        }
        else
        {
            System.out.println("Soholarship Rejected : ");

            if(Marks < 80)
            {
                System.out.print("Marks are Less than 80");
            }
            if(Attendence < 75)
            {
                System.out.print("Attendence is less than 75");
            }
            if(FamilyIncome > 300000)
            {
                System.out.print("Family Income is Greater than 300000");
            }
        }

        sobj.close();
    }
}
