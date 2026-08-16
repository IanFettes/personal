#include <iostream>
using namespace std;

int getElement(const int[], int, int);

int main() {
    const int size = 5;
    int arr[size] = {10, 20, 30, 40, 50};

    while (true) {
        cout << "Enter an index to access (negative value to quit): ";
        int index;
        cin >> index;

        if (index < 0) {
            break;
        }

        try {
            int value = getElement(arr, size, index);
            cout << "Element at index " << index << " is " << value << endl;
        } catch (const std::out_of_range& e) {
            cerr << "Error: " << e.what() << std::endl;
        }
    }
    return 0;
}

int getElement(const int a[], int size, int index) {
    // Throw error if requested position is out of bounds
    if (index > (size - 1)) { // Array indices end at size - 1
        throw std::out_of_range("Array index out of bounds");
    }
    return a[index];
}