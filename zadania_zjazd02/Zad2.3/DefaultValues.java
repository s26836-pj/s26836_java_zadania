public class DefaultValues {
    private final short shortValue;
    private final int intValue;
    private final long longValue;
    private final float floatValue;
    private final double doubleValue;
    private final char charValue;
    private final String stringValue;
    private final boolean booleanValue;

    public DefaultValues() {
        // konstruktor ustawia domyślne wartości zmiennych
        this.shortValue = 0;
        this.intValue = 0;
        this.longValue = 0L;
        this.floatValue = 0.0f;
        this.doubleValue = 0.0;
        this.charValue = '\u0000';
        this.stringValue = null;
        this.booleanValue = false;
    }


    public short getShortValue() {
        return shortValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public boolean getBooleanValue() {
        return booleanValue;
    }
}