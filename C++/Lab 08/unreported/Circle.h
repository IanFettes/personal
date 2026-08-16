#ifndef CIRCLE_H

class Circle {
private:
    double radius;
    double pi = 3.14159;
public:
    // Constructor definitions
    Circle() {
        radius = 0.0;
    }
    Circle(double r) {
        radius = r;
    }

    // Function prototypes
    void setRadius(double);
    double getRadius();
    double getArea();
    double getDiameter();
    double getCircumference();
};

// Function definitions
void Circle::setRadius(double r) {
    Circle::radius = r;
}
double Circle::getRadius() {
    return Circle::radius;
}
double Circle::getArea() {
    return (Circle::radius * Circle::radius) * Circle::pi;
}
double Circle::getDiameter() {
    return Circle::radius * 2.0;
}
double Circle::getCircumference() {
    return Circle::pi * Circle::radius * 2.0;
}

#endif // CIRCLE_H