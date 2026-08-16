//DO NOT MODIFY THIS SECTION
#include <iostream>
using namespace std;
//prototypes HERE

int* create(int);
void analyze(int*, int, int&, int&, float&);

int main() {
    int n, *p, sum, largest;
    float avg;
    cout << "How many numbers?";
    cin >> n;

    //ADD YOUR CODE FROM HERE
    p = create(n);
    analyze(p, n, sum, largest, avg);
    cout << "Sum: " << sum << endl;
    cout << "Largest value: " << largest << endl;
    cout << "Average: " << avg << endl;
    return 0;
}

int* create(int n) {
    int* arr = new int[n];

    // Populate array
    for (int i = 0; i < n; i++) {
        arr[i] = i;
    }
    return arr; // Return memory address of array
}

void analyze(int* arr, const int size, int &s, int &l, float &a) {
    // Set to 0 to avoid garbage value
    s=0;
    l=0;
    a=0;

    // Compute sum
    for (int i = 0; i < size; i++) {
        s += arr[i];
    }

    // Compute largest
    for (int i = 0; i < size; i++) {
        l = arr[0]; // Set to 1st element for the sake of comparison

        if (arr[i] > l) {
            l = arr[i];
        }
    }

    // Compute average
    a = s / size;

    // Delete dynamically-allocated array
    delete[] arr;
}