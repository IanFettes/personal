#include <iostream>
using namespace std;

const int SPECIAL = 13;
int main() {
    int totalOccupied = 0, totalRooms = 0, nFloors, nRooms, occupied;
    double percent;

    cout << "How many floors in the hotel?\n";
    cin >> nFloors;

    /* Set with 0 to avoid garbage value after the loop */
    nRooms = 0;
    occupied = 0;

    for (int i = 1; i <= nFloors; i++) {
        int roomsPerFloor=0, occupiedPerFloor=0;
        cout << "How many rooms on floor " << (i) << "?\n";
        cin >> roomsPerFloor;
        nRooms += roomsPerFloor;

        cout << "How many are occupied?\n";
        cin >> occupiedPerFloor;
        occupied += occupiedPerFloor;
    }
    percent = static_cast<double>(occupied) / static_cast<double>(nRooms) * 100;

    cout << endl;
    cout << "Total rooms: " << nRooms << endl;
    cout << "Occupied rooms: " << occupied << endl;
    cout << "Unoccupied rooms: " << (nRooms - occupied) << endl;
    cout << "% rooms occupied: " << percent << endl;
    cout << endl;
    return 0;
}