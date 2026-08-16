#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    ofstream oFile;
    int nStudents, age;
    string name;

    cout << "Number of students: ";
    cin >> nStudents;
    cin.ignore();
    oFile.open("students.txt");

    for (int i = 0; i < nStudents; i++) {
        cout << "Student " << i+1 << " name: ";
        getline(cin, name);

        cout << "Name: " << name << endl;

        cout << "Student " << i+1 << " age: ";
        cin >> age;
        cin.ignore();
        oFile << name << " " << age << endl;
    }
    return 0;
}