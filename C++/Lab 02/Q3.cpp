#include <iostream>
using namespace std;

int main () {
    double palletWeightItself, palletWithLoad;

    // Ask user for base pallet weight
    cout << "Base weight of pallet? ";
    cin >> palletWeightItself;

    // Ask user for loaded pallet weight
    cout << "Loaded pallet weight? ";
    cin >> palletWithLoad;

    /* Calculate number of widgets based
    on loaded weight */
    const double WIDGET_WEIGHT = 12.5;
    double numberOfWidgets = (palletWithLoad - palletWeightItself) / WIDGET_WEIGHT;
    cout << "Number of widgets: " << numberOfWidgets << endl;

    return 0;
}