package basetask;

public class TrainMethodsIf {

    public int returnNewInt(int newInt){
        if (newInt < 8){
            return newInt * 7;
        } else {
            return newInt / 4;
        }
    }

    public long returnNewLong(long newLong){
        if (newLong > 300){
            return newLong - 300;
        } else {
            return newLong + 20;
        }
    }

    public String returnNewChar(char newChar){
        if (newChar == 'g'){
            return "go";
        } else {
            return 'o' + new String(String.valueOf(newChar));
        }
    }

    public float returnNewFloat(float newFloat){
        if (newFloat == 0.67){
            return newFloat;
        } else {
            return newFloat * 2;
        }

    }

    public double returnNewDouble(double newDouble){
        if (newDouble > 30 && newDouble < 80){
            return newDouble + 87;
        }
        else if (newDouble > 80 && newDouble < 400) {
            return newDouble - 87;
        }
        else if(newDouble > 400){
            return newDouble / 4;
        } else {
            return newDouble;
        }
    }

    public void returnNewBoolean(boolean newBoolean){
        if (newBoolean){
            System.out.println("Я получила на вход значение истины");
        } else {
            System.out.println("Я получила на вход ложь");
        }
    }
}
