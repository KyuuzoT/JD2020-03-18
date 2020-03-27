package by.it.bobrovich.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        double a = 756.13;
        double x = 0.3;
        double part1 = cos(pow(x * x + PI / 6, 5));
        double part2 = sqrt(x * pow(a, 3));
        double part3 = log(abs((a - 1.12 * x) / 4));
        double z = part1 - part2 - part3;
        System.out.println(z);
        step2();
    }

    private static void step2() {
        double a = 1.21;
        double b = 0.371;
        double y = tan(pow((a + b), 2)) - pow((a + 1.5), 1 / 3.) + a * pow(b, 5) - b / log(a * a);
        System.out.println(y);
    }
}
