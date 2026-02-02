// Write a java program to accept the derectory name from user and display all name of files from that derectory and
// size of each file on screen

import java.io.File;
import java.util.Scanner;

class program05
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of folder : ");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are : "+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println("File name : "+fArr[i].getName()+ " File Size : "+fArr[i].length()+" bytes ");
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }           
    }
}