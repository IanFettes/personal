#include <iostream>
using namespace std;

int main() {
    double payAmount, payPeriods, annualPay;
    payAmount = 2100.0;
    payPeriods = 26;
    annualPay = payAmount * payPeriods;

    cout << "Annual pay: " << annualPay << endl;
    return 0;
}