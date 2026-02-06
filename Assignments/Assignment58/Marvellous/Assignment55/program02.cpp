// Write generic program to to perform substraction of two number

#include<iostream>
using namespace std;

template<class T>
void Display(T *Arr, int iNo)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iNo; iCnt++)
    {
        cout<<Arr[iCnt];
        cout<<"\t";
    }
    cout<<"\n";
}

template<class T>
T Substraction(T No1, T No2)
{
    T Ans = T();

    Ans = No1 - No2;
    
    return Ans;
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iRet = 0;

    cout<<"Enter the first value : ";
    cin>>iValue1;

    cout<<"Enter the second value : ";
    cin>>iValue2;

    iRet = Substraction(iValue1,iValue2);

    cout<<"Substraction of above two nubmers : "<<iRet;


    return 0;
}
