#include <iostream>
#ifndef ANIMAL_H

class Animal {
public:
    std::string name, species;

    void display() { // Overridden in ZooAnimal.cpp
        std::cout << "Name:\t" << name << std::endl;
        std::cout << "Species:\t" << species << std::endl;
    }
};

class Habitat {
public:
    std::string type;
    double size;

    void display() { // Overridden in ZooAnimal.cpp
        std::cout << "Type:\t" << type << std::endl;
        std::cout << "Size:\t" << size << std::endl;
    }
};

#endif