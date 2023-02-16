package oop.lesson_01;

public class App {
    public static void main(String[] args) {
        // создаём Мерседес
        Car carMersedes = new Car("Мерседес", 2000, 1000.24, "белый");
        // создаём BMW
        Car carBMW = new Car("BMW", 2005, 1500.50, "чёрный");

        System.out.println("Состояние атомобилей:");
        System.out.println("---------------------");

        System.out.println(carMersedes);
        System.out.println(carBMW);

        System.out.println();

        System.out.println("Статусы Мерседеса:");
        System.out.println("------------------");
        // Мерседес поедет во Франкфурт
        carMersedes.setDestination("Франкфурт");
        // заводим Мерседес
        carMersedes.getEngine().startTheEngine();
        System.out.println(carMersedes);
        // заводим Мерседес ещё раз
        carMersedes.getEngine().startTheEngine();
        System.out.println();

        System.out.println("Статусы BMW:");
        System.out.println("------------------");
        // пробиваем колесо у BMW
        carBMW.getWheels()[Car.FRONT_RIGHT].punchTire();
        // BMW поедет в Берлин
        carBMW.setDestination("Берлин");
        // заводим BMW
        carBMW.getEngine().startTheEngine();
        // смотрим на BMW
        System.out.println(carBMW);
        // накачиваем колесо у BMW
        carBMW.getWheels()[Car.FRONT_RIGHT].pumpTire();
        // смотрим на BMW
        System.out.println(carBMW);
        // глушим BMW
        carBMW.getEngine().stopTheEngine();
        // глушим BMW ещё раз
        carBMW.getEngine().stopTheEngine();
        System.out.println();
    }
}
