#ifndef ODOMETER_H
#define ODOMETER_H

class Odometer {
    friend class FuelGauge;
private:
    int mileage;
    int mileCounter = 0;
public:
    Odometer(const int miles) {
        mileage = miles;
    }

    void advance(int x, FuelGauge &gauge);
    void report() const;
};

void Odometer::advance(const int x, FuelGauge &gauge) {
    mileage += x;
    mileCounter++;
    if (mileCounter >= 24) {
        gauge.removeFromTank(1);
        mileCounter = 0;
    }

    if (mileage > 999999) {
        mileage = 0;
    }
}

void Odometer::report() const {
    std::cout << "Odometer: " << mileage << "\t";
}
#endif // ODOMETER_H