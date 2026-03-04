// WAP which accept matrix and one number from user and return frequency of that nubmer

import java.util.*;

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    };


    public void Accept()
    {
        int i = 0, j = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Element of matrix : ");

        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter the elements of row : "+(i+1));

            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }


    public void Display()
    {
        int i = 0, j = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Element of matrix are : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int Frequency(int No)
    {
        int i = 0, j = 0;
        int iFrequency = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
               
                if(Arr[i][j] == No)
                {
                    iFrequency++;
                }
            }
        }
        return iFrequency;
    }
}


class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        mobj.Display();

        System.out.println("Enter number which you want to count : ");
        
        int iNo = sobj.nextInt();       

        System.out.println("Frequency of the given number from the matrix : "+mobj.Frequency(iNo));

        sobj.close();
    }
}