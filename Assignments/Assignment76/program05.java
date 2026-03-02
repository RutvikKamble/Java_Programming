/*
5. A phone OS shows different battery warnings. The user wants a program that prints the correct battery status.

Rules:
• Battery ≤ 5% → Critical
• Battery ≤ 15% → Low
• Otherwise → Normal

Input:
• Battery percentage (integer)

Validations:
• 0 to 100 only

Expected Output:
Battery Percentage: <value>%
Status: <Critical/Low/Normal>

*/

import java.util.*;

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Percentage = 0;
        

        System.out.println("Enter the Percentage : ");
        Percentage = sobj.nextInt();

        if(Percentage < 0 || Percentage > 100)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        if(Percentage <= 5)
        {
            System.out.println("Critical");
        }
        else if(Percentage <= 15)
        {
            System.out.println("Low");
        }
        else
        {
            System.out.println("Normal");
        }

        sobj.close();
    }
}
