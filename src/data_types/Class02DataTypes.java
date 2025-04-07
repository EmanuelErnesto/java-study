package src.data_types;

/**
 * Class that handles java data types examples.
 */
public class Class02DataTypes {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int age = (int) 100000000000L;
        double ageDouble = (double) 40.4F;
        long longNumber = (long)30F;
        float numberValue = 40.02F;
        char character = '\u0042';
        byte firstByte = 'f';
        short firstShort = 1;
        boolean isGreater = true;
        String name = "Goku";

        System.out.println("The age is " + age);
        System.out.println(isGreater);
        System.out.println("Character with unicode 'u0042' in decimal is: " + character);
        System.out.println("Hi, i'm " + name);
    }
}
