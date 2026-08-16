#include <iostream>
#include "Coin.h"
using namespace std;

int main() {
    srand(time(0));
    int numHeads = 0, numTails = 0;
    Coin c1;

    for (int i = 0; i < 10; i++) {
        c1.toss();
        cout << c1.getSideUp() << endl;
        if (c1.getSideUp() == "heads") {
            numHeads++;
        }
        else {
            numTails++;
        }
    }
    cout << "Number of heads: " << numHeads << endl;
    cout << "Number of tails: " << numTails << endl;
    return 0;
}

void Coin::toss() {
    int side = rand() % 2;

    if (side == 0) {
        sideup = "heads";
    } else {
        sideup = "tails";
    }
}