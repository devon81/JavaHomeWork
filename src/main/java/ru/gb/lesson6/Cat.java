package ru.gb.lesson6;

import java.util.Objects;

public class Cat {

        // private недоступно никому
        // protected доступно внутри пакета + наследование
        // default доступно внутри пакета
        // public доступно всем

        //    private String name; // поле, содержащее имя кота
//    private int appetite; // аппетит кота (столько он съедает за раз)
//    //private boolean satiety; // сытость (голодный или нет)
//
//    public Cat(String name, int appetite) {
//        this.name = name;
//        this.appetite = appetite;
        //satiety = false;
        public static void main(String[] args) {

                Plate plate = new Plate(50); // Создаем тарелку с 50 единицами еды
                Cat myCat = new Cat(5); // Создаем кота с уровнем голода 5

                System.out.println("Уровень голода кота: " + myCat.getHungerLevel());
                System.out.println("Количество еды в тарелке: " + plate.getFood());

                myCat.eatFromPlate(plate);

                System.out.println("Уровень голода кота после кормления: " + myCat.getHungerLevel());
                System.out.println("Оставшееся количество еды в тарелке: " + plate.getFood());
        }
}






