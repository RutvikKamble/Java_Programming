// WAP which accept matrix and and check whether the matrix is identity matrix or not.

// Identity matrix is square matrix with 1's along the diagonal from upper left ot lower right and 0's in all other position
// If it satisfies the structure as explaained before than the matrix is called as identity matrix.

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

    public Boolean CheckIdendity()
    {
        int i = 0, j = 0;
        int iTemp = 0;
        boolean iBool = true;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    if(Arr[i][j] != 1)
                    {
                        iBool = false;
                    }
                }
                else if(Arr[i][j] != 0)
                {
                    iBool = false;
                }
            }
        }
        return iBool;
    }
}


class program04
{
     public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        System.out.println("Before Swap : ");
        mobj.Display();   

        bRet = mobj.CheckIdendity();

        if(bRet == true)
        {
            System.out.println("The given matrix is Identity matrix");
        }
        else
        {
            System.out.println("The given matrix is not Identity matrix");
        }

        sobj.close();

    }
}