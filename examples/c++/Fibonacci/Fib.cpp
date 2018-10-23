#include <iostream>
#include <vector>
#include <string>
using namespace std;
int main(){
    int n;
    cin >> n;
    unsigned long long vals[n+1];
    vals[0]=0;
    vals[1]=1;
    vals[2]=1;
    for(int i = 3;i<n+1;i++){
        vals[i] = vals[i-1]+vals[i-2];
    }
    std::cout << "Value is "<<vals[n]<<endl;
}