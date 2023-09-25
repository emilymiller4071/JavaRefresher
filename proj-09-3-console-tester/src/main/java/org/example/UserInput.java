package org.example;

public interface UserInput {

    int getInt(String prompt);
    int getInt(String prompt, int min, int max);
    double getDouble(String prompt);
    double getDouble(String prompt, double min, double max);
    String getString(String prompt);
    String getString(String prompt, String s1, String s2);


}
