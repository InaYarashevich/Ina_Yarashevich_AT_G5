package homework.basetask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {

        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        System.out.println("метод <returnNewInt> вернул " + trainMethodsIf.returnNewInt(123));
        System.out.println("метод <returnNewLong> вернул " + trainMethodsIf.returnNewLong(123213));
        System.out.println("метод <returnNewChar> вернул " + trainMethodsIf.returnNewChar('W'));
        System.out.println("метод <returnNewFloat> вернул " + trainMethodsIf.returnNewFloat(234.234f));
        System.out.println("метод <returnNewDouble> вернул " + trainMethodsIf.returnNewDouble(123.234));
        trainMethodsIf.returnNewBoolean(true);
    }
}
