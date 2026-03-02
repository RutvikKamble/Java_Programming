/*
1. A ride-hailing app calculates trip fare based on distance and whether the trip happened during peak hours.
Peak hours increase demand, so surcharge applies.

Rules:
• Base fare ₹50
• First 10 km → ₹12 per km
• Beyond 10 km → ₹15 per km
• Peak hours → 20% extra on total fare

Input:
• Distance in km (integer)
• Peak hour (Yes/No)

Validations:
• Distance cannot be negative

Expected Output:
Distance: <km> km
Peak Hour: <Yes/No>
Total Fare: ₹<amount>

*/

import java.util.*;

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int KM = 0;
        double Fare = 0;
        String PeakHour = null;
       
        Fare = 50;

        System.out.println("Enter the Distance in KM : ");
        KM = sobj.nextInt();

        System.out.println("Peak Hour : (Yes/No)");
        PeakHour = sobj.next();

      
        if(KM < 0 || (PeakHour.equalsIgnoreCase("Yes") == false) && (PeakHour.equalsIgnoreCase("No") == false))
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        if(KM <= 10)
        {
            Fare = Fare + (KM * 12);
        }
        else if(KM > 10)
        {
            Fare = Fare + 120 + ((KM - 10) * 15);
        }

        if(PeakHour.equalsIgnoreCase("Yes") == true)
        {
            Fare = Fare + (Fare * 0.2);
        }

        System.out.println("Distance : "+KM+"km");
        System.out.println("Peak Hour : "+PeakHour);
        System.out.println("Total Fare : "+Fare);


        sobj.close();
    }
}
