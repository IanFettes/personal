#include <iostream>
using namespace std;

int main() {
    // Define variables
    double item1, item2, item3, item4;
    item1 = 15.95;
    item2 = 27.95;
    item3 = 7.95;
    item4 = 12.95;
    const double tax = 0.07;
    double subtotal = 0, total = 0;

    // Add item prices to subtotal
    subtotal+=item1;
    subtotal+=item2;
    subtotal+=item3;
    subtotal+=item4;

    // Display subtotal and tax rate
    cout << "Subtotal:\t" << subtotal << endl;
    cout << "Tax:\t\t" << (tax * 100) << " %" << endl;

    // Add tax to all items
    total += (item1 += (item1 * tax)); // Approx. $17.07
    total += (item2 += (item2 * tax)); // Approx. $29.91  
    total += (item3 += (item3 * tax)); // Approx. $8.51
    total += (item4 += (item4 * tax)); // Approx. $13.86

    // Display total
    cout << "Total:\t\t" << total << endl;
    return 0;
}