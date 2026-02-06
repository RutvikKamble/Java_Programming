// Write a program to accept directory name from user and Write names of all file from that derectory 
// into one newly created file name as "Marvellous.txt"


import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

class program02
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;

        String str = null;
        File fobjsrc = null;
        File fobjdest = null;

        boolean bRet = false;

        String FolderSrc = null;
        String FileNameDest = null;

        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Derectory : ");
        FolderSrc = sobj.nextLine();
        

        fobjsrc = new File(FolderSrc);

        if(fobjsrc.exists() && fobjsrc.isDirectory())
        {
            System.out.println("Folder is present");

            File fArr[] = fobjsrc.listFiles();

            fobjdest = new File("Marvellous.txt");
            FileOutputStream foobj = new FileOutputStream(fobjdest);


            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    String name = fArr[i].getName() + "\n";
                    foobj.write(name.getBytes());
                }
            }

            foobj.close();

            System.out.println("File names written successfully into Marvellous.txt");
        }
        else
        {
            System.out.println("There is no such Derectory");
        }
        
        sobj.close();
    }
}