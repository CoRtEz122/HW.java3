
public class plate {

    int food;

    public plate() {
        this(100);
    }

    public plate(int food) {
        if (food < 0) {
            throw new IllegalArgumentException("food must be positive");
        }

        this.food = food;
    }

    @Override
    public String toString() {
        return "(" + food + ")";
    }
}
