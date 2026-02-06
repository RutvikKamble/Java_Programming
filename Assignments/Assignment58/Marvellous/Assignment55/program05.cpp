// Write generic program to find maximum of four values.

#include<iostream>
using namespace std;

template<class T>
T Max(T No1, T No2, T No3, T No4)
{
    T Max = No1;

    if(No2 > Max)
    {
        Max = No2;
    }

    if(No3 > Max)
    {
        Max = No3;
    }

    if(No4 > Max)
    {
        Max= No4;
    }
    
    return Max;
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iValue3 = 0, iValue4 = 0, iRet = 0;

    cout<<"Enter the first Value : ";
    cin>>iValue1;

    cout<<"Enter the second Value : ";
    cin>>iValue2;

    cout<<"Enter the third Value : ";
    cin>>iValue3;

    cout<<"Enter the fourth Value : ";
    cin>>iValue4;

    iRet = Max(iValue1,iValue2,iValue3,iValue4);


    cout<<"The maximum value is : "<<iRet;

    return 0;
}
