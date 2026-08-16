#include <iostream>
using namespace std;

/* Calculates the amount of rainfall for 3
months using galaxy brain math ☺☻ */
int main() {
    string m1, m2, m3;
    float r1, r2, r3;

    // Read in month name from the user
    cout << "Enter first month and rainfall: ";
    cin >> m1 >> r1;

    cout << "Enter second month and rainfall: ";
    cin >> m2 >> r2;

    cout << "Enter third month and rainfall: ";
    cin >> m3 >> r3;

    // Calculate average
    float avg = (r1 + r2 + r3) / 3.0f;

    // Display output
    cout << "Average rainfall for " << m1 << ", " << m2 << ", and " << m3
    << " is " << avg << endl;
    
    return 0;
}