package ru.kelasov.Ex2;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog ("Max", 2);
        Dog dog2 = new Dog ("Rex", 4);
        DogNursery nursery = new DogNursery();
        nursery.AddDog(dog1, dog2);
    }
}
