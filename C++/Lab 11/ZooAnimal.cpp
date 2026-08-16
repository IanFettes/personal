#include "Animal.h"

// Inherits from Animal and Habitat classes
class ZooAnimal : public Animal, public Habitat {
public:
    int id;
    std::string diet;

    void display() {
        std::cout << "Name: " << name << std::endl;
        std::cout << "Species: " << species << std::endl;
        std::cout << "Habitat: " << type << std::endl;
        std::cout << "Size: " << size << std::endl;
        std::cout << "ID: " << id << std::endl;
        std::cout << "Diet: " << diet << std::endl;
    }
};

int main() {
    ZooAnimal a1;
    a1.name = "Bob";
    a1.species = "Giraffe";
    a1.type = "Savannah";
    a1.size = 1000;
    a1.id = 1;
    a1.diet = "Herbivore";

    a1.display();
    std::cout << std::endl;

    ZooAnimal a2;
    a2.name = "Clifford";
    a2.species = "Big Red Dog";
    a2.type = "House";
    a2.size = 125;
    a2.id = 2;
    a2.diet = "Omnivore";

    a2.display();

    return 0;
}