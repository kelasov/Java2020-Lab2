package ru.kelasov.Ex2;

public class DogNursery {
    private Dog array[] = new Dog[100];
    private int Size = 0;
    public void AddDog(Dog ... newDogs){
        for (int i = 0; i < newDogs.length; i++) {
            array[Size]=newDogs[i];
            Size++;
        }
    }
}
