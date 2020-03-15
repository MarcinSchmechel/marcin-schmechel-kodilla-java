package com.kodilla.stream.beautifier;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class PoemDecoratorStyle {
    public static String addABC(String string) {
        return string + "ABC";
    }

    public static String textToUpperCase(String string) {
        return toUpperCase(string);
    }

    public static String addStars(String string) {
        return "*****" + string + "*****";
    }

    public static String textToLowerCase(String string) {
        return toLowerCase(string);
    }
}
