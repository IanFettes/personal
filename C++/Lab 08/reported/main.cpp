#include <iostream>
#include "car.h"
using namespace std;

int main() {
    Car c1(2006, "Dodge");

    // Call the accelerate function 5 times
    for (int i = 0; i < 5; i++) {
        c1.accelerate();
        // Display current speed of car
        cout << "Current speed:\t" << c1.getSpeed() << endl;
    }

    // Call the brake function 5 times
    for (int i = 0; i < 5; i++) {
        c1.brake();
        cout << "Current speed:\t" << c1.getSpeed() << endl;
    }
    return 0;
}