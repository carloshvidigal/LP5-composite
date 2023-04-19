package composite;

public class Ingredient extends Content{

    private float value;

    public Ingredient(String description, float value) {
        super(description);
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getContent() {
        return "Ingredient: " + this.getDescription() + " - value: " + this.value + "\n";
    }
}
