#include <iostream>
using namespace std;

int main() {

    // Define variables
    int length, width, area;

    // Read in length and width
    cout << "Enter length:\t";
    cin >> length;
    cout << "Enter width:\t";
    cin >> width;

    // cin >> length >> width;

    // Calculate area
    area = length * width;

    // Display output
    cout << "Area:\t\t" << area << endl;
    return 0;
}