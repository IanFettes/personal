#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;
int main()
{
    int n1, n2, sum;
    srand( time( 0 ) );
    rand(); rand(); rand();

    n1 = rand() % 1001;
    n2 = rand() % 1001;
    cout << " " << n1 << endl;
    cout << "+" << n2 << endl;
    cout << "----" << " Press ENTER to reveal answer ";
    cin.ignore();

    sum = n1 + n2;
    cout << sum << endl;

    return 0;
}
