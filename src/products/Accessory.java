package products;

public class Accessory extends Product{

    private String color;
    private static int BASE = 30003;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        this.color = color;

    }

    @Override
    public String toString() {
        return super.toString() +
                ", color = '" + color + '\'' + ' '
                ;
    }

    @Override
    protected String generateId() {
        int id = BASE + 1;
        BASE += 1;
        return  3 + String.valueOf(id);
    }

}
