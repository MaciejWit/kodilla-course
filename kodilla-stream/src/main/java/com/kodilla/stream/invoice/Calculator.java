import java.util.*;
import java.lang.*;
import java.io.*;

class Calculator {

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subtractAFromB(int a, int b) {
        return b - a;
    }
}

class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.addAToB(5, 5);
    }
}