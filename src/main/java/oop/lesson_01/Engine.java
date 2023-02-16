package oop.lesson_01;

public class Engine {
    private boolean engineState;

    public Engine() {
        this.engineState = false;
    }

    public boolean getEngineState() {
        return this.engineState;
    }

    public void startTheEngine() {
        if (this.engineState) {
            System.out.println("двигатель уже заведён, зачем заводить его ещё раз?");
        } else {
            this.engineState = true;
        }
    }

    public void stopTheEngine() {
        if (!this.engineState) {
            System.out.println("двигатель уже заглушен, зачем глушить его ещё раз?");
        } else {
            this.engineState = false;
        }
    }

    @Override
    public String toString() {
        if (!this.engineState) {
            return "стоит на месте";
        } else {
            return "едет";
        }
    }
}
