package tasks.homework.threads;

public class Mouse {

    private String pattern;
    private String name;


    public Mouse(int number){
        this.name = "Mouse <" + number + ">";
    }

    public String getName(){
        return name;
    }

    public void setPattern(int number){
        this.pattern = "Mouse <" + number + ">";
    }

    public void peep(){
        System.out.println(this.name + " PEEP!");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "pattern='" + pattern + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
