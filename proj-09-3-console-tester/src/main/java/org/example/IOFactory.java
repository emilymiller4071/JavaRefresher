package org.example;

public class IOFactory {
    public static UserIO getUserIO(String type) {
        return new ConsoleIO();
    }
}
