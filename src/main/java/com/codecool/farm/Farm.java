package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Farm {

    private List<Animal> animals = new ArrayList<>();

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        animals.stream().forEach(animal -> animal.feed());
    }

    public void butcher(Butcher butcher) {
        animals = animals.stream().filter(animal -> !butcher.canButcher(animal)).collect(Collectors.toList());
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> res = new ArrayList<>();
        for(Animal animal : animals) {
            String line = "There is a " + animal.getSize() + " sized " + animal.getClass().getSimpleName().toLowerCase() + " in the farm.";
            res.add(line);
        }
        return res;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
