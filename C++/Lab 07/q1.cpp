#include <iostream>
using namespace std;

void reverseArray(int *a, const int size);

int main() {
    int arr[5] = {1, 2, 3, 4, 5};
    reverseArray(arr, 5);
    return 0;
}

void reverseArray(int *a, const int size) { // TODO change return type to int* after testing
    int* temp = new int[size];

    // Copy original array into new array
    for (int i = 0; i < size; i++) {
        temp[i] = a[i];
    }

    // Reverse the array
    for (int i = 0; i < size; i++) {
        a[i] = temp[size - i];

    }
    delete[] temp;
}