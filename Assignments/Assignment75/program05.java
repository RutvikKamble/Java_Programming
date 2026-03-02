/*
5. A tax portal calculates income tax based on annual income using progressive slabs. Only the amount in a slab is
taxed at that slab’s rate.

Slabs:
• Up to ₹2,50,000 → 0%
• ₹2,50,001 to ₹5,00,000 → 5%
• ₹5,00,001 to ₹10,00,000 → 20%
• Above ₹10,00,000 → 30%

Input:
• Annual income (integer)

Validations:
• Income cannot be negative

Expected Output:
Annual Income: ₹<income>
Total Tax Payable: ₹<tax>
*/

import java.util.*;

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0;
        double Tax = 0;
       

        System.out.println("Enter Annual income : ");
        Income = sobj.nextInt();
      
        if(Income < 0)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        if(Income <= 250000)
        {
            Tax = 0;
        }
        else if((Income > 250000) && (Income <= 500000))
        {
            Tax = ((Income - 250000) * 0.05);
        }
        else if((Income > 500000) && (Income <= 1000000))
        {
            Tax = 12500 + ((Income - 500000) * 0.2);
        }
        else
        {
            Tax = 112500 + ((Income - 1000000) * 0.3);
        }

        System.out.println("Annual Income : "+Income);
        System.out.println("Total Tax Payable : "+Tax);


        sobj.close();
    }
}

/*
    Test Cases : 1

    Input :         
    Enter Annual income :
    250000
    Annual Income : 250000
    
    Output :
    Total Tax Payable : 0.0

    
    Test Cases : 2

    Input : 
    Enter Annual income :
    250100
    Annual Income : 250100
    
    Output :
    Total Tax Payable : 5.0


    Test Cases : 3

    Input : 
    Enter Annual income :
    500100
    Annual Income : 500100

    Output : 
    Total Tax Payable : 12520.0


    Test Cases : 4

    Enter Annual income :
    1000100
    Annual Income : 1000100

    Output : 
    Total Tax Payable : 112530.0
*/