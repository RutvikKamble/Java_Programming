/*
1. A shopping mall parking gate records entry and exit duration in hours.
The parking system calculates charges based on the total hours a vehicle stayed. Long-duration parking attracts
additional penalty.

Rules:
• First 2 hours → ₹20 (flat)
• After 2 hours → ₹10 per extra hour
• If total hours > 10 → add ₹50 penalty

Input:
• Total parking hours (integer)

Validations:
• Hours cannot be negative

Expected Output:
Total Parking Duration: <hours> hours
Total Parking Fee: ₹<amount>

*/

import java.util.*;

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int ParkingHours = 0;
        int Fee = 0;
        int i = 0;

        System.out.println("Enter the parking Hours : ");

        ParkingHours = sobj.nextInt();

        if(ParkingHours < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(ParkingHours <= 2)
        {
            Fee = 20;
        }
        else if(ParkingHours > 2)
        {
            for(i = 2, Fee = 20; i < ParkingHours; i++)
            {
                Fee = Fee + 10;
            }
        }

        if(ParkingHours > 10)
        {
            Fee = Fee + 50;
        }

        System.out.println("Total Parking Duration : "+ParkingHours);
        System.out.println("Total Parking Fee : "+Fee);

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