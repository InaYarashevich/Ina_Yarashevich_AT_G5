package main.java.tasks.homework.collectionstasks;

public class Bubbles {

    private int volume;
    private String name;

    public Bubbles(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bubbles{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }
}
