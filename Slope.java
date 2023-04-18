public class Slope extends Mammal implements Swimmable {

    public Slope(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "шшшш";
    }

    @Override
    public int swimmingSpeed() {
        return 24;
    }

    @Override
    public String feed() {
        return "планктон, малюски, раки";
    }
    
}
