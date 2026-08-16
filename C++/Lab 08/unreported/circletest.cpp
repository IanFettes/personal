#include <iostream>
#include "Circle.h"
using namespace std;

int main() {
    double radius;
    cout << "Enter radius:";
    cin >> radius;

    Circle c1(radius);
    double area = c1.getArea();
    double diameter = c1.getDiameter();
    double circumference = c1.getCircumference();

    cout << "Circle area:\t\t" << area << endl;
    cout << "Circle diameter:\t" << diameter << endl;
    cout << "Circle circumference:\t" << circumference << endl;

    return 0;
}
