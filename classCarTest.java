//overview of class

public class Car {
    // Attributes
    private String make;
    private String model;
    private int year;
    
    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Methods
    public void startEngine() {
        System.out.println("Engine started");
    }
    
    public void accelerate() {
        System.out.println("Car is accelerating");
    }
    
    public void brake() {
        System.out.println("Car is braking");
    }
    
    // Getters and Setters
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
}
