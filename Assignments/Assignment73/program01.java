// WAP which accept matrix and and display transpose of the matrix

// The transpose of given matrix is formed by interchanging the row and column of a matrix.

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

    public void SwapRow()
    {
        int i = 0, j = 0;
        int iTemp = 0;


        for(i = 0; i < iRow; i += 2)
        {
            for(j = 0; j < iCol; j++)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[i + 1][j];
                Arr[i + 1][j] = iTemp;  
            }
        }
    }


    public void Transpose()
    {
        int i = 0, j = 0;
        int iTemp = 0;


        for(i = 0; i < iRow; i += 2)
        {
            for(j = 0; j < iCol; j++)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[i + 1][j];
                Arr[i + 1][j] = iTemp;  
            }
        }


        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j += 2)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[i][j + 1];
                Arr[i][j + 1] = iTemp; 
            }
        }
    }
}


class program01
{
     public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        System.out.println("Before Swap : ");
        mobj.Display();   

        mobj.SwapRow();

        System.out.println("After Row Swap : ");
        mobj.Display();

        mobj.Transpose();

        System.out.println("After transpose the matrix : ");
        mobj.Display();

        sobj.close();

    }
}