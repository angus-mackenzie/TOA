#include <iostream>
#include <sstream>
using namespace std;
void hanoi(int n, int source, int spare, int dest){
    if(n>0){
        hanoi(n-1, source, dest, spare);
        cout << "Move disk from " << source << " to "<< dest << endl;
        hanoi(n-1,spare,source,dest);
    }
}

int main(int argc, char * argv[]){
    hanoi(2,2,1,3);
}