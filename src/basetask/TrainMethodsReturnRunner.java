package basetask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {

        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(5));

        System.out.println("метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(123456));

        System.out.println("метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('Q'));

        System.out.println("метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat((float) 3.1));

        System.out.println("метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(5.123));

        System.out.println("метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short) 33245));

        System.out.println("метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte) 7));

        System.out.println("метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(false));
    }
}
