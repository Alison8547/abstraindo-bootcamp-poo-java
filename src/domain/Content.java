package domain;

public abstract class Content {
    protected static final double XP_STANDARD = 10D;

    private String name;
    private String description;


    public abstract double calcXp();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
