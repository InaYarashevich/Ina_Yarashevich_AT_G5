package homework.basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int num) {
        return num * 3;
    }

    public long returnNewLong(long newLong) {
        return newLong - 4;
    }

    public String returnNewChar(char newChar) {
        return newChar + "" + newChar;
    }

    public float returnNewFloat(float newFloat) {
        return newFloat / 2;
    }

    public double returnNewDouble(double newDouble) {
        return newDouble + 8;
    }

    public short returnNewShort(short newShort) {
        return (short) (newShort - ((short) 1));
    }

    public byte returnNewByte(byte newByte) {
        return (byte) (newByte * (byte) 2);
    }

    public boolean returnNewBoolean(boolean newBoolean) {
        return !newBoolean;
    }
}
