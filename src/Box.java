public class Box<T> {

    private T name;
    private T colour;

    public Box(T name, T colour) {
        this.name = name;
        this.colour = colour;
    }

    public Box() {
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getColour() {
        return colour;
    }

    public void setColour(T colour) {
        this.colour = colour;
    }

    public static <T> T method() {
        T box = (T) new Box<>("Box","Yellow");
        return box;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

}
