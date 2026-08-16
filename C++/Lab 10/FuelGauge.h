#ifndef FUELGAUGE_H

class FuelGauge {
private:
    int fuel;
    const int MAXIMUM_CAPACITY = 15;
public:
    FuelGauge (const int f) {
       fuel = f;
    }

    int getGallons() const {
        return fuel;
    }

    void addToTank(const int gal) {
        fuel += gal;
    }

    void removeFromTank(const int gal) {
        fuel -= gal;
    }

    void report() const;
};

void FuelGauge::report() const{
    if (fuel == 0) {
        std::cout << "Tank is empty!" << std::endl;
    }
    else {
        std::cout << "Fuel: " << fuel << std::endl;
    }
}
#endif // FUELGAUGE_H