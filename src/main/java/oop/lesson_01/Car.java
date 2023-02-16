package oop.lesson_01;

public class Car {
    public static final int FRONT_LEFT = 0;
    public static final int FRONT_RIGHT = 1;
    public static final int BACK_LEFT = 2;
    public static final int BACK_RIGHT = 3;

    private final int TOTAL_WHEELS = 4;

    private Engine engine;
    private Wheel[] wheels;

    private String model;
    private int year;
    private double price;
    private String color;

    private String destination;

    public Car(String model, int year, double price, String color) {
        this.engine = new Engine();
        this.wheels = new Wheel[TOTAL_WHEELS];

        wheels[FRONT_LEFT] = new Wheel("левое переднее");
        wheels[FRONT_RIGHT] = new Wheel("правое переднее");
        wheels[BACK_LEFT] = new Wheel("левое заднее");
        wheels[BACK_RIGHT] = new Wheel("правое заднее");

        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Wheel[] getWheels() {
        return this.wheels;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    private int getIllWheelIdx() {
        for (int i = 0; i < TOTAL_WHEELS; i++) {
            if (!this.wheels[i].getWheelState()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.color);
        sb.append(" автомобиль марки ");
        sb.append(this.model);
        sb.append(' ');
        sb.append(this.year);
        sb.append(" года выпуска стоимостью ");
        sb.append(this.price);

        if (this.engine.getEngineState()) {
            if (this.destination == "") {
                sb.append(" заведён и стоит на месте");
            } else {
                int i = getIllWheelIdx();
                if (i == -1) {
                    sb.append(" едет в направлении ");
                    sb.append(this.destination);
                } else {
                    sb.append(" не может ехать потому что спущено ");
                    sb.append(wheels[i].getName());
                    sb.append(" колесо");
                }
            }
        } else {
            sb.append(" стоит на месте");
        }
        return sb.toString();
    }
}
