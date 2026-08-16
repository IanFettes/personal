#include <iostream>
using namespace std;

template <typename T>

/** Returns the absolute value of the argument.
 * The function checks if the argument is negative,
 * and if it is, it multiplies it by -1 to make the
 * returned value positive. If the argument is already
 * positive, return the value as normal. **/
T absolute(T a) {
    if (a < 0) {
        return a * -1;
    }
    return a;
}

int main() {
    double d = -1.2;
    int i = -6;

    cout << absolute(d) << endl;
    cout << absolute(i) << endl;
    return 0;
}