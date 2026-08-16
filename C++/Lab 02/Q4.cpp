#include <iostream>
using namespace std;

int main() {
    int bagCapacity = 30, servings = 10, servingCalories = 150;
    int nCookies, consumedCalories;

    // Get number of cookies from user
    cout << "How many cookies consumed? ";
    cin >> nCookies;

    // Each serving is 3 cookies
    int caloriesPerCookie = servingCalories / (bagCapacity / servings);
    consumedCalories = caloriesPerCookie * nCookies;

    cout << "Consumed calories: " << consumedCalories << endl;
    return 0;    
}