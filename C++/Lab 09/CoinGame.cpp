#include <iostream>
#include "Coin.h"
using namespace std;

int main() {
    srand(time(0));
    Coin quarter, dime, nickel;
    double balance = 0.00;

    while (balance <= 1.00) {
        quarter.toss();
        dime.toss();
        nickel.toss();
        if (quarter.getSideUp() == "heads") {
            balance += 0.25;
        }

        if (dime.getSideUp() == "heads") {
            balance += 0.10;
        }

        if (nickel.getSideUp() == "heads") {
            balance += 0.05;
        }
        cout << "Balance: " << balance << endl;
    }

    if (balance > 1.0) {
        cout << "\nYou lost" << endl;
    } else {
        cout << "\nYou won!" << endl;
    }
    return 0;
}

void Coin::toss() {
    int side = rand() % 2;

    if (side == 0) {
        sideup = "heads";
    }
    if (side == 1) {
        sideup = "tails";
    }
}