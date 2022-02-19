package DayTwo;

public class HashCodes {

    private int num;

    public HashCodes(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        HashCodes hashCodes = new HashCodes(3);
        HashCodes hashCodes1 = new HashCodes(4);

        System.out.println(hashCodes.hashCode());
        System.out.println(hashCodes.equals(hashCodes1));
    }

}
