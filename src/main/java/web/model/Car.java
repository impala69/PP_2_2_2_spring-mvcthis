package web.model;

public class Car {
    private String name;
    private int model;
    private int valueCar;

    public Car(String name, int model, int value) {
        this.name = name;
        this.model = model;
        this.valueCar = value;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getValueCar() {
        return valueCar;
    }

    public void setValueCar(int valueCar) {
        this.valueCar = valueCar;
    }
}
