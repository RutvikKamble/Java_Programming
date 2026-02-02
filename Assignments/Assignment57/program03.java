// Write a java program to accept the derectory name from user and create that derectory


import java.io.File;
import java.util.Scanner;

class program03
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dname = sobj.nextLine();

        File fobj = new File(dname);

        if(fobj.exists())
        {
            System.out.println("Directory already exists");
        }
        else
        {
            if(fobj.mkdir())
            {
                System.out.println("Directory created successfully");
            }
            else
            {
                System.out.println("Unable to create directory");
            }
        }

        sobj.close();
    }
}
