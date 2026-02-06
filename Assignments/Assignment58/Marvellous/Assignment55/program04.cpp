// Write generic program to swap two values.

#include<iostream>
using namespace std;

template<class T>
void Swap(T No1, T No2)
{
    T No = T();

    No = No1;
    No1 = No2;
    No2 = No;

    return;
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    cout<<"Enter the Value of A : ";
    cin>>iValue1;

    cout<<"Enter the Value of B : ";
    cin>>iValue2;

    Swap(iValue1,iValue2);

    cout<<"Value of A : "<<iValue1;
    cout<<"Value of B : "<<iValue2;

    return 0;
}
