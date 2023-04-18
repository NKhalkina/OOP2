public class Dolphin extends Mammal implements Swimmable {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "скр-скр";
    }

    @Override
    public int swimmingSpeed() {
        return 48;
    }

    @Override
    public String feed() {
        return "рыба, планктон";
    }
    
}
