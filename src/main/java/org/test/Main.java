package org.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;

        String sValue = String.valueOf(a) + String.valueOf(b);
        int c = 2 * a * b;

        if (Integer.parseInt(sValue) > c) {
            return Integer.parseInt(sValue);
        } else {
            return c;
        }

    }
}
