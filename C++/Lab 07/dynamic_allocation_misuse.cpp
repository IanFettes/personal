#include <iostream>
using namespace std;

int main() {
    int *numbers = nullptr;
    numbers = new int[10];

    for (int i = 0; i < 10; i++) { // Changed <= to <, avoided accessing the array out of bounds
        *(numbers + i) = i * i;
    }

    for (int i = 0; i < 10; i++) {
        cout << numbers[i] << " ";
    }
    cout << endl;
    delete[] numbers; // Changed delete to delete[], 'numbers' is a dynamically-allocated array

    return 0;
}