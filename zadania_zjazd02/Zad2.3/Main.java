public class Main {
    public static void main(String[] args) {
        DefaultValues defaultValues = new DefaultValues();

        System.out.println("Default values in Java: \n");
        System.out.println("short s = " + defaultValues.getShortValue());
        System.out.println("int i = " + defaultValues.getIntValue());
        System.out.println("long l = " + defaultValues.getLongValue());
        System.out.println("float f = " + defaultValues.getFloatValue());
        System.out.println("double d = " + defaultValues.getDoubleValue());
        System.out.println("char c = " + defaultValues.getCharValue());
        System.out.println("String str = " + defaultValues.getStringValue());
        System.out.println("boolean b = " + defaultValues.getBooleanValue());
    }
}
