/*
4. A traffic police app records whether a rider violated rules. Each violation has a fixed fine.
If multiple violations happen, fines should be added.

Fines:
• No helmet → ₹500
• No license → ₹1000
• Overspeeding → ₹1500

Input:
• Helmet worn (Yes/No)
• License available (Yes/No)
• Overspeeding (Yes/No)

Validations:
• Inputs must be Yes/No only

Expected Output:
Total Fine Amount: ₹<amount>
*/

import java.util.*;

class program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Helmet = null;
        String License = null;
        String Overspeeding = null;
        int Fine = 0;
       

        System.out.println("Do you Weared Helmet : (Yes/No)");
        Helmet = sobj.next();
        
        System.out.println("Do you have License : (Yes/No)");
        License = sobj.next();

        System.out.println("Did you Overspeeding : (Yes/No)");
        Overspeeding = sobj.next();

        if((Helmet.equalsIgnoreCase("Yes")==false) && (Helmet.equalsIgnoreCase("No")==false) ||
            (License.equalsIgnoreCase("Yes")==false) && (License.equalsIgnoreCase("No")==false) ||
            (Overspeeding.equalsIgnoreCase("Yes")==false) && (Overspeeding.equalsIgnoreCase("No")==false)
        )
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }   
        

        if((Helmet.equalsIgnoreCase("No") == true))
        {
            Fine = Fine + 500;
        }

        if((License.equalsIgnoreCase("No") == true))
        {
            Fine = Fine + 1000;
        }

        if((Overspeeding.equalsIgnoreCase("Yes") == true))
        {
            Fine = Fine + 1500;
        }
    
        
        System.out.println("Total Fine Amount : "+Fine);
        

        sobj.close();
    }
}

/*
    Test Cases : 1

    Input :         
    Do you Weared Helmet : (Yes/No)
    yes
    Do you have License : (Yes/No)
    yes
    Did you Overspeeding : (Yes/No)
    no

    Output :
    Total Fine Amount : 0

    
    Test Cases : 2

    Input : 
    Do you Weared Helmet : (Yes/No)
    no
    Do you have License : (Yes/No)
    no
    Did you Overspeeding : (Yes/No)
    yes
    
    Output :
    Total Fine Amount : 3000


    Test Cases : 3

    Do you Weared Helmet : (Yes/No)
    yes
    Do you have License : (Yes/No)
    no
    Did you Overspeeding : (Yes/No)
    ues

    Output : 
    Invalid Input
*/