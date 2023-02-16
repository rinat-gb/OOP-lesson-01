package oop.lesson_01;

public class Wheel {
    private String name;
    private boolean wheelState;

    public Wheel() {
    }

    public Wheel(String name) {
        this.name = name;
        this.wheelState = true;
    }

    public String getName() {
        return this.name;
    }

    public boolean getWheelState() {
        return this.wheelState;
    }

    public void punchTire() {
        this.wheelState = true;
    }

    public void pumpTire() {
        this.wheelState = false;
    }
}
