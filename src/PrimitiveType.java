import java.util.Objects;

public class PrimitiveType {

    public static void main(String[] args) {
        char myChar = 'A';
        System.out.println(myChar);
        char myChar2 = '\'';
        System.out.println(myChar2);
        char myChar3 = '\u2764';
        System.out.println(myChar3);
        for (int i = 0; i <= 25; i++) {
            char letter = (char) ('a' + i);
            System.out.print(letter+", ");
        }
        float notExact = 3.1415926f;
        System.out.println(notExact);

        int demo = 2147483647; //maximum positive integer
        System.out.println(demo); //prints 2147483647
        demo = demo + 1; //leads to an integer overflow
        System.out.println(demo); // prints -2147483648

        int a = 1;
        double d = a; // valid conversion to double, no cast needed (widening)
        System.out.println(d);

        double dd = 18.96_10;
        //int b = dd; // invalid conversion to int, will throw a compile-time error
        int b = (int) dd; // valid conversion to int, but result is truncated (gets rounded down)
        // This is type-casting
        // Now, b = 18
        System.out.println(b);

        double d1 = 0d;
        double d2 = -0d;
        System.out.println(d1 == d2); // true
        System.out.println(1d / d1); // Infinity
        System.out.println(1d / d2); // -Infinity
        System.out.println(Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY); // Na

        Long val3 = 128L;
        Long val4 = 128L;
        System.out.println(val3 == val4); //false
        System.out.println(Objects.equals(val3, val4)); // true

        boolean foo = true;
        System.out.println("foo = " + foo); // foo = true
        boolean bar = false;
        System.out.println("bar = " + bar); // bar = false
        boolean notFoo = !foo;
        System.out.println("notFoo = " + notFoo); // notFoo = false
        boolean fooAndBar = foo && bar;
        System.out.println("fooAndBar = " + fooAndBar); // fooAndBar = false
        boolean fooOrBar = foo || bar;
        System.out.println("fooOrBar = " + fooOrBar); // fooOrBar = true
        boolean fooXorBar = foo ^ bar;
        System.out.println("fooXorBar = " + fooXorBar); // fooXorBar = true

        byte example = -36;
        byte myByte = 96;
        byte anotherByte = 7;
        byte addedBytes = (byte) (myByte + anotherByte); // 103
        System.out.println(addedBytes);
        byte subtractedBytes = (byte) (myByte - anotherByte); // 89
        System.out.println(subtractedBytes);


        short myShort = 987;
        short anotherShort = 17;
        short addedShorts = (short) (myShort + anotherShort); // 1,004
        System.out.println(addedShorts);
        short subtractedShorts = (short) (myShort - anotherShort); // 970
        System.out.println(subtractedShorts);

    }
}
