package ru.gb.lesson6;
/**
 * Добавить в кота следующее. Пусть голод кота оценивается не true\false, а по шкале (1, 2, ..., 10).
 * Кот хочет съесть то количество еды, каков его текущий голод. Например, если аппетит кота = 100, а голод 5, то он съест 50.
 * Кот съедает все, что есть в тарелке. Например, в тарелке 50, коту нужно 70, он съест 50.
 *
 * Пример.
 * Кот, его аппетит = 100
 * Пусть кот сыт наполовину, то есть его голод = 5. То есть, ему нужно 50 единиц еды.
 * Пусть в тарелке 25 единиц еды.
 * После обеда, сытость кота будет равна 7, а еда в тарелке закончится.
 */


public class Homework {

    public class Cat {
        private int hungerLevel; // Уровень голода кота

        public Cat(int hungerLevel) {
            this.hungerLevel = hungerLevel;
        }

        public void eatFromPlate(Plate plate) {
            int foodNeeded = hungerLevel * 10; // Количество еды, необходимое коту (голод * 10)
            int foodAvailable = plate.getFood(); // Количество еды в тарелке

            if (foodNeeded <= foodAvailable) {
                int foodEaten = foodNeeded / 10; // Количество съеденной еды (foodNeeded / 10)
                plate.decreaseFood(foodEaten);
                System.out.println("Кот съел " + foodEaten + " еды.");
            } else {
                int foodEaten = foodAvailable / 10; // Количество съеденной еды (foodAvailable / 10)
                plate.decreaseFood(foodEaten);
                System.out.println("Кот съел все, что было в тарелке (" + foodEaten + " еды).");
            }

            hungerLevel = 0; // Кот становится сытым
        }

        public int getHungerLevel() {
            return hungerLevel;
        }
    }
}


