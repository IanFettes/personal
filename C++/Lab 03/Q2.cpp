#include <iostream>
using namespace std;
int main() {
    int books;
    cout << "How many books did the customer purchase this month? ";
    cin >> books;

    int points;
    if (books == 0) {
        points = books;
    }
    else if (books == 1) {
        points =  5;
    }
    else if (books == 2) {
        points = 12;
    }
    else if (books == 3) {
        points = 18;
    }
    else if (books >= 4) {
        points = 25;
    }

    cout << "Points earned: " << points << endl;
        return 0;
}
