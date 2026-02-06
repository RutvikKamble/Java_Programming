// Write generic program to to perform Division of two number.

#include<iostream>
using namespace std;

template<class T>
T Division(T No1, T No2)
{
    T Ans = T();

    if(No2 == T())
    {
        cout<<"Division is not poassible by Zero...";
        return T();
    }

    Ans = No1 / No2;
    
    return Ans;
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iRet = 0;

    cout<<"Enter the first value : ";
    cin>>iValue1;

    cout<<"Enter the second value : ";
    cin>>iValue2;

    iRet = Division(iValue1,iValue2);

    cout<<"Division of above two nubmers : "<<iRet;


    return 0;
}
