package ru.gb.lesson6;

public class Plate {
    private int food; // Количество еды в тарелке

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
        } else {
            System.out.println("В тарелке недостаточно еды.");
        }
    }

    public void addFood(int amount) {
        food += amount;
    }
}