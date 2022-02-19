package cycletask;

public class ForTask {

    private int i;
    public void printNumbersFor(){
        for (i = 3; i < 20; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
