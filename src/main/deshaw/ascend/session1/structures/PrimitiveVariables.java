package deshaw.ascend.session1.structures;

public class PrimitiveVariables {

    // Integers

    /**
     * This is a signed 8-bit type that has a range from 128 to 127.
     * Variables of type byte are especially useful when you’re working with a stream of data from
     * a network or file. They are also useful when you’re working with raw binary data that may
     * not be directly compatible with Java’s other built-in types.
     */
    byte bytePrimitive = 127;

    /**
     * short is a signed 16-bit type. It has a range from 32,768 to 32,767. It is probably the least-used Java type.
     */
    short shortPrimitive = 129;

    /**
     * The most commonly used integer type is int. It is a signed 32-bit type that has a range
     * from 2,147,483,648 to 2,147,483,647.
     */
    int intPrimitive = 140;

    /**
     * long is a signed 64-bit type and is useful for those occasions where an int type is not large
     * enough to hold the desired value. The range of a long is quite large. This makes it useful
     * when big, whole numbers are needed
     */
    long longPrimitive = 141;

    // Floating point numbers

    /**
     * The type float specifies a single-precision value that uses 32 bits of storage. Single precision is
     * faster on some processors and takes half as much space as double precision, but will become
     * imprecise when the values are either very large or very small. Variables of type float are useful
     * when you need a fractional component, but don’t require a large degree of precision.
     */
    float floatPrimitive = 3.55f;

    /**
     * Double precision, as denoted by the double keyword, uses 64 bits to store a value. Double
     * precision is actually faster than single precision on some modern processors that have been
     * optimized for high-speed mathematical calculations.
     */
    double doublePrimitive = 3.5567d;

    // Character

    /**
     * Java uses Unicode to represent characters. Unicode defines a fully international character set that can represent
     * all the characters found in all human languages. It is a unification of dozens of character sets, such as Latin,
     * Greek, Arabic, Cyrillic, Hebrew, Katakana, Hangul, and many more. For this purpose, it requires 16 bits. Thus, in
     * Java char is a 16-bit type. The range of a char is 0 to 65,536.
     */
    char characterPrimitive = 'Y';

    // Boolean

    /**
     * Java has a primitive type, called boolean, for logical values. It can have only one of two
     * possible values, true or false.
     */
    boolean booleanPrimitive = true;
}
