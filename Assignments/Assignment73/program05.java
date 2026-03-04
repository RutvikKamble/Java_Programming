// WAP which accept matrix and and check whether the matrix is identity matrix or not.
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

    public Boolean CheckSparse()
    {
        int i = 0, j = 0;
        int iCount1 = 0, iCount2 = 0;
        boolean iBool = false;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iCount1++;
                }
                else
                {
                    iCount2++;
                }
            }

            if(iCount1 > iCount2)
            {
                iBool = true;
            }
        }
        return iBool;
    }
}


class program05
{
     public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        System.out.println("Before Swap : ");
        mobj.Display();   

        bRet = mobj.CheckSparse();

        if(bRet == true)
        {
            System.out.println("The given matrix is Sparse matrix");
        }
        else
        {
            System.out.println("The given matrix is not Sparse matrix");
        }

        sobj.close();

    }
}