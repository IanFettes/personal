//Car.h
//DO NOT MODIFY THIS SECTION
#ifndef CAR_H
#define CAR_H
#include <string>
class Car {
private:
    int year;
    std::string make;
    int speed;
public:
    Car(int y, std::string m);
    int getYear();
    std::string getMake();
    int getSpeed();
    void accelerate();
    void brake();
};

Car::Car(int y, std::string m) {
    year = y;
    make = m;
    speed = 0;
}

int Car::getYear() {
    return year;
}
std::string Car::getMake() {
    return make;
}
int Car::getSpeed() {
    return speed;
}
void Car::accelerate() {
    speed+=5;
}
void Car::brake() {
    speed-=5;
}
#endif // CAR_H