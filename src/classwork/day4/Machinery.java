package classwork.day4;

public abstract class Machinery {

    protected String name;

    public Machinery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
