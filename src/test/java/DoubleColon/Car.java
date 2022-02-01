package DoubleColon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Car {

    private String make;
    private String model;

    public Car() {

    }

    public Car(String model) {
        this.model = model;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
