public class Car {
    private String color;
    private CarEngine engine;
    private Door door;

    public Car (String color){
        this.color = color;
        engine = new CarEngine();
        door = new Door();
    }
    public void setColor(String color){
        this.color = color;
    }
    public String start() {
        return engine.startCarEngine();
    }

}
