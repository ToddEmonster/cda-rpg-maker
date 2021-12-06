package correction;

public class Character {
    protected String name;
    protected int healthPoints;
    protected String type;
    protected String alignment;

    public Character(String name) {
        this(name, 50, "neutre", "neutre");
    }

    public Character(String name, int healthPoints) {
        this(name, healthPoints, "neutre", "neutre");
    }

    public Character(String name, int healthPoints, String type) {
        this(name, healthPoints, type, "neutre");
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public Character(String name, int healthPoints, String type, String alignment) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.type = type;
        this.alignment = alignment;
    }

    @Override
    public String toString() {
        return "Character \"" + name + "\""
                + " ; HP = " + healthPoints
                + " ; type = " + type
                +" ; alignment = " + alignment;
    }
}
